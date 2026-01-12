package exocoursfranck;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class Sound_test {
    private static final float SAMPLE_RATE = 44100;

    enum Wave {
        SINE,
        SQUARE
    }

    static void playTone(int hz, int ms, double volume, Wave wave) throws Exception {
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
        SourceDataLine line = AudioSystem.getSourceDataLine(af);
        line.open(af);
        line.start();

        for (int i = 0; i < ms * SAMPLE_RATE / 1000; i++) {
            double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
            double sample = (wave == Wave.SQUARE)
                    ? Math.signum(Math.sin(angle))
                    : Math.sin(angle);

            buf[0] = (byte) (sample * 127 * volume);
            line.write(buf, 0, 1);
        }

        line.drain();
        line.stop();
        line.close();
    }

    static void rest(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public static void main(String[] args) throws Exception {

        // === Notes (mode mineur héroïque) ===
        int A = 220;
        int C = 262;
        int D = 294;
        int E = 330;
        int G = 392;
        int A2 = 440;

        int beat = 130;

        while (true) {

            // === Phrase héroïque A ===
            playTone(A, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(C, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(D, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(E, beat * 2, 1.0, Wave.SQUARE); rest(60);

            // === Réponse mélodique ===
            playTone(D, beat, 0.8, Wave.SQUARE); rest(20);
            playTone(C, beat, 0.8, Wave.SQUARE); rest(20);
            playTone(A, beat * 2, 0.9, Wave.SQUARE); rest(60);

            // === Montée épique ===
            playTone(C, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(D, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(E, beat, 0.9, Wave.SQUARE); rest(20);
            playTone(G, beat * 2, 1.0, Wave.SQUARE); rest(60);

            // === Conclusion / loop ===
            playTone(E, beat, 0.8, Wave.SQUARE); rest(20);
            playTone(D, beat, 0.8, Wave.SQUARE); rest(20);
            playTone(A2, beat * 2, 1.0, Wave.SQUARE); rest(120);
        }
    }
}
