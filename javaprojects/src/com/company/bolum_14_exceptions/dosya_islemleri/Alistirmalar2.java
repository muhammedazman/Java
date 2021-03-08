package com.company.bolum_14_exceptions.dosya_islemleri;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Alistirmalar2 {

    public static void main(String[] args) {

        ArrayList<MaasPersonel> maasPersonelArrayList = new ArrayList<>();

        readData(maasPersonelArrayList);

        writeData(maasPersonelArrayList);

    }

    private static void writeData(ArrayList<MaasPersonel> maasPersonelArrayList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("maas.txt"))){

            for (MaasPersonel maasPersonel:maasPersonelArrayList) {
                writer.write(maasPersonel.getIsim() + " "+ maasPersonel.getMaas());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readData(ArrayList<MaasPersonel>  maasPersonelArrayList) {
        try (BufferedReader reader = new BufferedReader(new FileReader("maas.txt"))){
            String okunanSatir = reader.readLine();

            while (okunanSatir!=null) {

                String[] satirList = okunanSatir.split(" ");
                MaasPersonel maasPersonel = new MaasPersonel(satirList[0],Integer.parseInt(satirList[1]));
                maasPersonelArrayList.add(maasPersonel);

                okunanSatir = reader.readLine();
            }
            Collections.sort(maasPersonelArrayList);
            System.out.println(maasPersonelArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MaasPersonel implements Comparable<MaasPersonel> {

    private String isim;
    private int maas;

    public MaasPersonel(String isim, int maas) {
        this.isim = isim;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public int getMaas() {
        return maas;
    }

    @Override
    public String toString() {
        return "MaasPersonel{" +
                "maas=" + maas +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(MaasPersonel o) {

        // Büyükten kücüge dogru siralamasini istiyoruz
        if (this.maas < o.maas) {
            return 1;
        } else if (this.maas > o.maas) {
            return -1;
        } else return 0;
    }
}
