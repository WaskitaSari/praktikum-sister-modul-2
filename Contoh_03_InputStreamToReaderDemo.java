/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul_02;

/**
 *
 * @author LAB_TI
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Contoh_03_InputStreamToReaderDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Please enter your name: ");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);

            String name = bufReader.readLine();
            System.out.println("Pleased to meet you, "+name);
        }catch(IOException ioe){
            System.out.println("I/O error : "+ioe);
        }
    }
}
