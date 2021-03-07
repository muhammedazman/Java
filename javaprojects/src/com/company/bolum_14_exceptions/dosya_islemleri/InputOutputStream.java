package com.company.bolum_14_exceptions.dosya_islemleri;

import java.io.*;
import java.util.ArrayList;

public class InputOutputStream {

    public static void main(String[] args) {

        dosyayaYaz();

        dosyadanOku();
    }

    private static void dosyadanOku() {
        DataInputStream dataInputStream = null;
        DataInputStream dataInputStream1 = null;
        ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>();

        // bu kullanim ile finally blogunu kullanmamiza gerek kalmiyor. (AutoCloseable)
        try (DataInputStream dataInputStreamAutoClose = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")))){
            int id = dataInputStreamAutoClose.readInt();
            String isim = dataInputStreamAutoClose.readUTF();
            boolean aktif = dataInputStreamAutoClose.readBoolean();

            Ogrenci ogr = new Ogrenci(id, isim, aktif);
            System.out.println(ogr.getId());
            System.out.println(ogr.getIsim());
            System.out.println(ogr.isAktif());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));
            Ogrenci okunanOgrenci1;
            Ogrenci okunanOgrenci2;

            int id = dataInputStream.readInt();
            String isim = dataInputStream.readUTF();
            boolean aktif = dataInputStream.readBoolean();

            okunanOgrenci1 = new Ogrenci(id, isim, aktif);
            System.out.println(okunanOgrenci1.getId());
            System.out.println(okunanOgrenci1.getIsim());
            System.out.println(okunanOgrenci1.isAktif());

            int id2 = dataInputStream.readInt();
            String isim2 = dataInputStream.readUTF();
            boolean aktif2 = dataInputStream.readBoolean();

            okunanOgrenci2 = new Ogrenci(id2, isim2, aktif2);
            System.out.println(okunanOgrenci2.getId());
            System.out.println(okunanOgrenci2.getIsim());
            System.out.println(okunanOgrenci2.isAktif());

            dataInputStream1 = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));
            Ogrenci okunanOgrenci;
            boolean dosyaSonu = false;
            while (!dosyaSonu) {
                try {
                    int id3 = dataInputStream1.readInt();
                    String isim3= dataInputStream1.readUTF();
                    boolean aktif3 = dataInputStream1.readBoolean();

                    okunanOgrenci = new Ogrenci(id3, isim3, aktif3);
                    System.out.println(okunanOgrenci);
                    ogrenciArrayList.add(okunanOgrenci);
                } catch (EOFException e) {
                    System.out.println("dosya sonuna gelindi");
                    dosyaSonu = true;
                }
            }
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (dataInputStream1 != null) {
                try {
                    dataInputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Ogrenci ArrayList Size: "+ogrenciArrayList.size());
    }

    private static void dosyayaYaz() {

        DataOutputStream dataOutputStream = null;

        Ogrenci ogrenci1 = new Ogrenci(1, "muhammed", false);
        Ogrenci ogrenci2 = new Ogrenci(2, "hasan", true);

        try {
            dataOutputStream =
                    new DataOutputStream(
                            new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")));
            dataOutputStream.writeInt(ogrenci1.id);
            dataOutputStream.writeUTF(ogrenci1.isim);
            dataOutputStream.writeBoolean(ogrenci1.aktif);

            dataOutputStream.writeInt(ogrenci2.id);
            dataOutputStream.writeUTF(ogrenci2.isim);
            dataOutputStream.writeBoolean(ogrenci2.aktif);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Ogrenci {

    int id;
    String isim;
    boolean aktif;

    public Ogrenci(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public boolean isAktif() {
        return aktif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}