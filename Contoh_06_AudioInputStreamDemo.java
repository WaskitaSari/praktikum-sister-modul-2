/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul_02;

/**
 *
 * @author LAB_TI
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Contoh_06_AudioInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String audioFile = "d:/busy.wav";
        InputStream in = new FileInputStream(audioFile);

        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
