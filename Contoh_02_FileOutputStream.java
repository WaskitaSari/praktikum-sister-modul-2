/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul_02;

/**
 *
 * @author LAB_TI
 */
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class Contoh_02_FileOutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String destination = "d:/B_16650052/writedocument.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened "+destination+" for writing.");

        String data = "Try to write data using output stream";
        for(int i=0; i<data.length(); i++){
            output.write((byte)data.charAt(i));
        }

        output.close();
        System.out.println("Output stream closed");
    }
}
