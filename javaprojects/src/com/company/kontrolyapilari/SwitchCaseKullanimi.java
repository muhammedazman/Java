package com.company.kontrolyapilari;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {
        int haftaninKacinciGunu = 3;

        //if version
        if(haftaninKacinciGunu == 1) {
            System.out.println("Pazartesi");
        }else if(haftaninKacinciGunu == 2) {
            System.out.println("Sali");
        }else if(haftaninKacinciGunu == 3) {
            System.out.println("Carsamba");
        }

        //switch case version
        switch (haftaninKacinciGunu) {
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Sali"); break;
            case 3: System.out.println("Carsamba"); break;
            default: System.out.println("Yanlis bir gun degeri girildi");
        }
    }
}
