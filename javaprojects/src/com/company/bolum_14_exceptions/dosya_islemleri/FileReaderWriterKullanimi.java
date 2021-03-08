package com.company.bolum_14_exceptions.dosya_islemleri;

import java.io.*;

public class FileReaderWriterKullanimi {

    public static void main(String[] args) {

        veriYazma();

        veriOkuma();
    }

    private static void veriOkuma() {
        try (BufferedReader reader = new BufferedReader(new FileReader("karakter.txt"))){
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void veriYazma() {
        // append true yapilirsa her calistirildiginda dosya syeniden olusturulmayacak
        try(BufferedWriter writer  = new BufferedWriter(new FileWriter("karakter.txt", true))) {
            writer.write("Merhaba");
            writer.newLine();
            writer.write("Ben Muhammed\n");
            writer.write("Dosya son\n\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
