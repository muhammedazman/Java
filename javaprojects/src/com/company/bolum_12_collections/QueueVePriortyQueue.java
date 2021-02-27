package com.company.bolum_12_collections;

import java.util.*;

public class QueueVePriortyQueue {

    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.offer(1);//eleman ekleme
        sayilar.offer(2);
        sayilar.offer(3);
        sayilar.offer(3);
        sayilar.offer(2);
        sayilar.add(2);//kullanilabilir ama hata firlatabilir.

        System.out.println(sayilar.peek());//ilk elemani gosterir ama silmez
        System.out.println(sayilar.poll());//ilk elemani gosterip siler
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());//eleman yoksa null degeri doner
        //System.out.println(sayilar.remove());//eleman yoksa hata firlatir

        PriorityQueue<String> isimler = new PriorityQueue<>();
        isimler.offer("can");
        isimler.offer("ayse");
        isimler.offer("beyhan");
        isimler.offer("beril");
        isimler.offer("emre");
        isimler.offer("ali");

        while(!isimler.isEmpty()) {
            System.out.println(isimler.poll());
        }

        Iterator<String> iterator = isimler.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //System.out.println(isimler);


        PriorityQueue<Ogrenci> ogrenciKuyruk = new PriorityQueue<>();
        ogrenciKuyruk.offer(new Ogrenci(1, 82));
        ogrenciKuyruk.offer(new Ogrenci(3, 70));
        ogrenciKuyruk.offer(new Ogrenci(2, 96));
        ogrenciKuyruk.offer(new Ogrenci(6, 12));
        ogrenciKuyruk.offer(new Ogrenci(5, 18));

        while (!ogrenciKuyruk.isEmpty()) {
            //poll ile kuyruktaki elemanlar siralanip en usteki cikarilir
            System.out.println(ogrenciKuyruk.poll());
        }
    }
}

class Ogrenci implements Comparable<Ogrenci>{

    int id;
    int notDegeri;

    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if (this.notDegeri > o.notDegeri) {
            return 1;
        } else if (this.notDegeri < o.notDegeri) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", notDegeri=" + notDegeri;
    }
}
