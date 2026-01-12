
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;;

public class gamme_chromatique {

    private static final float sample_rate = 44100;

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

    public static void main(String[] args) throws Exception {

        int duree = 300;

        // === OCTAVE 4 (do4 → si4) ===

        double do4        = 261.63;
        double do_diese4  = 277.18;
        double re_bemol4  = 277.18;

        double re4        = 293.66;
        double re_diese4  = 311.13;
        double mi_bemol4  = 311.13;

        double mi4        = 329.63;

        double fa4        = 349.23;
        double fa_diese4  = 369.99;
        double sol_bemol4 = 369.99;

        double sol4       = 392.00;
        double sol_diese4 = 415.30;
        double la_bemol4  = 415.30;

        double la4        = 440.00;
        double la_diese4  = 466.16;
        double si_bemol4  = 466.16;

        double si4        = 493.88;

        // === Lecture de la gamme chromatique ===

        jouer_note(do4, duree);
        jouer_note(do_diese4, duree);
        jouer_note(re4, duree);
        jouer_note(re_diese4, duree);
        jouer_note(mi4, duree);
        jouer_note(fa4, duree);
        jouer_note(fa_diese4, duree);
        jouer_note(sol4, duree);
        jouer_note(sol_diese4, duree);
        jouer_note(la4, duree);
        jouer_note(la_diese4, duree);
        jouer_note(si4, duree);
    }
}
