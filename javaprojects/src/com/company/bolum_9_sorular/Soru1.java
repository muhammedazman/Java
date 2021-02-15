package com.company.bolum_9_sorular;

import com.company.oop_giris.Ogrenci;

import java.util.ArrayList;

public class Soru1 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Ogrenci ogr1 = new Ogrenci(10, "Muhammed");
        Ogrenci ogr2 = new Ogrenci(20, "Hasan");
        Ogrenci ogr3 = new Ogrenci(30, "Ayse");
        Ogrenci ogr4 = new Ogrenci(40, "Ali");
        myStack.push(ogr1);
        myStack.push(ogr2);
        myStack.push(ogr3);
        myStack.push(ogr4);
        myStack.yazdir();

        myStack.pop();
        System.out.println(myStack.kacElemanVar() + " tane eleman var");
        System.out.println(myStack.bosMu());
        System.out.println(myStack.elemanGoster());
        myStack.yazdir();
    }
}

class MyStack{

    private ArrayList<Object> liste;

    public MyStack() {
        liste = new ArrayList<>();
    }

    public int kacElemanVar(){
        return liste.size();
    }

    public boolean bosMu() {
        if(liste.size()>0){
            return false;
        } else return true;
        //return liste.isEmpty();
    }

    public Object elemanGoster() {
        return liste.get(kacElemanVar()-1);
    }

    public Object pop() {
        if(liste.size()>0){
            Object geriyeDondurulecekEleman = liste.get(kacElemanVar() - 1);
            liste.remove(kacElemanVar() - 1);
            return geriyeDondurulecekEleman;
        } else {
            System.out.println("Yiginda eleman bulunmamaktadir");
            return null;
        }
    }

    public void push(Object obj) {
        liste.add(obj);
    }

    public void yazdir() {
        System.out.println("Yigin icerigi");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(i + " indexte: " + liste.get(i));
        }
    }

}
