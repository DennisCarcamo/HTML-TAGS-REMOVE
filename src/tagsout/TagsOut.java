/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsout;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author dejoc
 */
public class TagsOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "C:/Users/dejoc/Documents/NetBeansProjects/TagsOut/src/tagsout/file.txt";
        String text = "";
        String textClean = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
        System.out.println("*_*_*_*_*_*_*_*_*_* Codigo HTML *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println(text);
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");

        textClean = text.replaceAll("<.*?>", "");
        textClean = textClean.replaceAll("[\\r\\n]+", "\n");

        System.out.println("*_*_*_*_*_*_*_*_*_* Codigo HTML SIN TAGS *_*_*_*_*_*_*_*_*_*_*");
        System.out.println(textClean);
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

    }
}
