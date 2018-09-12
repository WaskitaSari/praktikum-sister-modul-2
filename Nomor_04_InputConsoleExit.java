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

public class Nomor_04_InputConsoleExit {
    public static void main(String[] args) {
        try{
            System.out.println("Masukkan text. Ketik 'exit' untuk keluar");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);

            String data = bufReader.readLine();

            for(int i=0; i<data.length(); i++){
                System.out.println("Anda menulis: "+data+"\n");
                if(data.equalsIgnoreCase("exit")){
                    System.out.println("Terima Kasih");
                    System.exit(0);
                }else{
                    String data2 = bufReader.readLine();
                    data=data2;
                }
            }
        }catch(IOException ioe){
            System.out.println("I/O error : "+ioe);
        }
    }
}
