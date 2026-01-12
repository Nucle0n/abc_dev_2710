import javax.sound.sampled.*;

public class piano_88_touches_lisible {

    private static final float sample_rate = 44100;

    // === STRUCTURE NOTE ===

    static class note {

        String nom;

        int offset; // position dans l’octave (0–11)

        note(String nom, int offset) {

            this.nom = nom;

            this.offset = offset;

        }

    }

    // === TOUCHES BLANCHES ===

    static note[] touches_blanches = {

        new note("do", 0),

        new note("re", 2),

        new note("mi", 4),

        new note("fa", 5),

        new note("sol", 7),

        new note("la", 9),

        new note("si", 11)

    };

    // === TOUCHES NOIRES ===

    static note[] touches_noires = {

        new note("do#", 1),

        new note("re#", 3),

        new note("fa#", 6),

        new note("sol#", 8),

        new note("la#", 10)

    };

    static void jouer_note(double frequence, int duree_ms) throws Exception {

        byte[] buffer = new byte[1];

        AudioFormat format = new AudioFormat(sample_rate, 8, 1, true, false);

        SourceDataLine ligne = AudioSystem.getSourceDataLine(format);

        ligne.open(format);

        ligne.start();

        for (int i = 0; i < duree_ms * sample_rate / 1000; i++) {

            double angle = i / (sample_rate / frequence) * 2.0 * Math.PI;

            buffer[0] = (byte) (Math.sin(angle) * 120);

            ligne.write(buffer, 0, 1);

        }

        ligne.drain();

        ligne.stop();

        ligne.close();

    }

    static double frequence_depuis_midi(int midi) {

        return 440.0 * Math.pow(2.0, (midi - 69) / 12.0);

    }

    public static void main(String[] args) throws Exception {

        int duree = 160;

        // MIDI 21 = la0 (début du piano)

        // MIDI 108 = do8 (fin du piano)

        System.out.println("=== TOUCHES BLANCHES ===");

        for (int midi = 21; midi <= 108; midi++) {

            int offset = midi % 12;

            for (note n : touches_blanches) {

                if (offset == n.offset) {

                    jouer_note(frequence_depuis_midi(midi), duree);

                }

            }

        }

        Thread.sleep(600);

        System.out.println("=== TOUCHES NOIRES ===");

        for (int midi = 21; midi <= 108; midi++) {

            int offset = midi % 12;

            for (note n : touches_noires) {

                if (offset == n.offset) {

                    jouer_note(frequence_depuis_midi(midi), duree);

                }

            }

        }

    }

}