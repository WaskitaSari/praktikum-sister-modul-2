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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Contoh_01_FileInputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       InputStream fileInput = new FileInputStream("d:/B_16650052/document.txt");
       int data = fileInput.read();
       while(data!=-1){
           System.out.print((char)data);
           data=fileInput.read();
       }
       fileInput.close();
    }

}
