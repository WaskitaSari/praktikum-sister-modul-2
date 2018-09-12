/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul_02;

/**
 *
 * @author LAB_TI
 */
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Contoh_05_ImageInputStreamDemo {
    public static void main(String[] args) {
        Image image = null;
        try{
            File sourceImage = new File("d:/B_16650052/Penguins.jpg");
            image = ImageIO.read(sourceImage);

            InputStream is = new BufferedInputStream(new FileInputStream("d:/B_16650052/Penguins.jpg"));
            image = ImageIO.read(is);
        }catch(IOException e){
            System.out.println(e);
        }

        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
