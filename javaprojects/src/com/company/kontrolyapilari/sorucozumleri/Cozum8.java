package com.company.kontrolyapilari.sorucozumleri;

import java.util.Scanner;

public class Cozum8 {

    /*
      x>0, y<0 ise f(x,y) = 4x+2y+4
      x>0, y=0 ise f(x,y) = 2x-y+3
      x<0, y>0 ise f(x,y) = 3x+4y+3
    */
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("x degerini giriniz");
        int x = tara.nextInt();

        System.out.println("y degerini giriniz");
        int y = tara.nextInt();

        int sonuc = 0;
        if (x > 0 && y < 0) { sonuc = 4*x + 2*y + 4; }
        else if (x > 0 && y == 0) { sonuc = 2*x - y+3; }
        else if (x < 0 && y > 0) { sonuc = 3*x + 4*y +3; }

        System.out.println("Sonuc = " + sonuc);
    }
}
