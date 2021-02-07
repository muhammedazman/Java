package com.company.degiskenler;

public class VeriTipleri {
    public static void main(String[] args) {
        int integerDegiskenDEger = 10;
        double doubleDegiskenDegeri = 10.50;
        short shortVeriTipi = 32767;

        //Asagidaki Ifadeler tamsayi veri türlerinin özelliklerini yazdirir.
        System.out.println("BYTE En Kücük Degeri : "+ Byte.MIN_VALUE + " En Büyük Degeri: "+ Byte.MAX_VALUE + " Kac Bit: "+ Byte.SIZE);
        System.out.println("SHORT En Kücük Degeri : "+ Short.MIN_VALUE + " En Büyük Degeri: "+ Short.MAX_VALUE + " Kac Bit: "+ Short.SIZE);
        System.out.println("INTEGER En Kücük Degeri : "+ Integer.MIN_VALUE + " En Büyük Degeri: "+ Integer.MAX_VALUE + " Kac Bit: "+ Integer.SIZE);
        System.out.println("LONG En Kücük Degeri : "+ Long.MIN_VALUE + " En Büyük Degeri: "+ Long.MAX_VALUE + " Kac Bit: "+ Long.SIZE);

        //Asagidaki Ifadeler ondalikli veri türlerinin özelliklerini yazdirir.
        System.out.println("FLOAT En Kücük Degeri : "+ Float.MIN_VALUE + " En Büyük Degeri: "+ Float.MAX_VALUE + " Kac Bit: "+ Float.SIZE);
        System.out.println("DOUBLE En Kücük Degeri : "+ Double.MIN_VALUE + " En Büyük Degeri: "+ Double.MAX_VALUE + " Kac Bit: "+ Double.SIZE);

        char a = 'c';
        int integerDeger = a;
        System.out.println("c Harfinin char degeri: "+ a +" ASCII kodu ise: "+ integerDeger);

        boolean sonucTrue = true, sonucFalse = false;
        System.out.println("Boolen sonucTrue degeri: "+sonucTrue+ " sonucFalse: "+ sonucFalse);

    }
}
