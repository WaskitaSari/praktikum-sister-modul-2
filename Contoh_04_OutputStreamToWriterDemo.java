/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul_02;

/**
 *
 * @author LAB_TI
 */
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Contoh_04_OutputStreamToWriterDemo {
    public static void main(String[] args) {
        try{
            OutputStream output = System.out;
            OutputStreamWriter writer = new OutputStreamWriter(output);

            writer.write("Hello World");
            writer.flush();
            writer.close();
        }catch(IOException ioe){
            System.out.println("I/O error : "+ioe);
        }
    }
}
