package com.company.bolum_12_collections;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColectionsYardimciSinifi {

    public static void main(String[] args) {

        Student student1 = new Student(1, "abdullah");
        Student student2 = new Student(9, "sinem");
        Student student3 = new Student(5, "ezgi");

        ArrayList<Student> ogrenciler = new ArrayList<>();
        ogrenciler.add(student1);
        ogrenciler.add(student2);
        ogrenciler.add(student3);

        Student enBuyukOgrenci = Collections.max(ogrenciler, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.isim.compareTo(o2.isim) < 0)
                    return -1;
                else if (o1.isim.compareTo(o2.isim) > 0)
                    return 1;
                else return 0;
            }
        });

        System.out.println("Max ögrenci: "+ enBuyukOgrenci);

        Student enKucukOgrenci = Collections.min(ogrenciler);
        System.out.println(enKucukOgrenci);

        System.out.println("siralamadan önce: " + ogrenciler);

        // büyükten kücüge siralama
        Collections.sort(ogrenciler, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.id < o2.id) {
                    return 1;
                } else if (o1.id > o2.id) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println("siralamadan sonra: " + ogrenciler);

        Collections.shuffle(ogrenciler);
        System.out.println("karistirildiktan sonra: " + ogrenciler);

        // bulursa 0 veya pozitif deger, bulumazsa negati deger donduruyor
        // binary search islemi icin ana kosul, elemanlarin sirali olmasi gerekir. Yoksa hatali sonuc verir
        // Comparator metodu ile siralama yaptigmiz icin islem sonucu dogru gelmektedir.
        int sonuc = Collections.binarySearch(ogrenciler, student1);
        System.out.println("binary search sonuc: "+sonuc);

        // yapitgimiz islemi ters sirada yazdirir
        Collections.reverse(ogrenciler);
        System.out.println("reverse: "+ogrenciler);

        // Destination ile Source size degerleri ayni veya daha fazla kayit satirina sahip olamasi gereikir
        ArrayList<Student> yedekOgrenci = new ArrayList<>();
        yedekOgrenci.add(new Student(0, null));
        yedekOgrenci.add(new Student(0, null));
        yedekOgrenci.add(new Student(0, null));
        yedekOgrenci.add(new Student(2, "asd"));
        Collections.copy(yedekOgrenci,ogrenciler);
        System.out.println("yedek ogrenci: " + yedekOgrenci);
    }
}


class Student implements Comparable<Student>{

    int id;
    String isim;

    public Student(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.isim.compareTo(o.isim) < 0) {
            return -1;
        }else if (this.isim.compareTo(o.isim) > 0) {
            return 1;
        }else return 0;
    }
}