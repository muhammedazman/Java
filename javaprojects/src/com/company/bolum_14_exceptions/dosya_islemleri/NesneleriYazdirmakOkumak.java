package com.company.bolum_14_exceptions.dosya_islemleri;

import java.io.*;
import java.util.ArrayList;

public class NesneleriYazdirmakOkumak {

    public static void main(String[] args) {

        dosyayaNesneYazdir();

        dosyayaNesneleriOku();

        // ArrayListi dosyaya yazdirmak
        ArrayList<Student> ogrenciStudentArrayList = new ArrayList<>();
        ogrenciStudentArrayList.add(new Student(9, "kkk", false));
        ogrenciStudentArrayList.add(new Student(19, "aaaa", false));

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenci_nesneleri_liste.dat")))){

            objectOutputStream.writeObject(ogrenciStudentArrayList);

        } catch (Exception e) {
            System.out.println(e);
        }

        // ArrayListi okumak
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenci_nesneleri_liste.dat")))){

            ArrayList<Student> ogrenciListesi = (ArrayList<Student>) objectInputStream.readObject();
            System.out.println("okunan ogrenci listesi: "+ ogrenciListesi);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void dosyayaNesneleriOku() {

        boolean dosyaSonu = false;
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenci_nesneleri.dat")))){

            while (!dosyaSonu) {
                try {
                    Student okunanNesne = (Student) objectInputStream.readObject();
                    System.out.println(okunanNesne);
                } catch (EOFException e) {
                    dosyaSonu = true;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void dosyayaNesneYazdir() {

        Student student1 = new Student(50, "muhammed", true);
        Student student2 = new Student(70, "hasan", false);
        Student student3 = new Student(40, "ali", true);

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenci_nesneleri.dat")))){
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Serializable ile bellegimizdeki nesneleri byte olarak dosyaya yazmaya olanak vermesi icin kullaniriz
class Student implements Serializable{

    int id;
    String isim;
    boolean aktif;
    private final long serialVersionUID = 1L;

    public Student(int id, String isim, boolean aktif) {
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
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}