package com.company.bolum_10_abstractinterface.access_modifier;

public class PrivateKullanimi {
    //Bir sinif private olamaz
    //private degisken ve metotlar sadece bulunduklari class icerisinden erisilebilirler
    //constructor lar private olamaz ve onu extend olarak da kullanamayiz
    //private ile inner class olusturulabilir
    private int a;

    private void metot(){

    }

    private PrivateKullanimi() {

    }

    private class InnerClass{

    }
}

/*
class Yenisinif() extends PrivateKullanimi{

}
*/
