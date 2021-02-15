package com.company.bolum_9_sorular;

public class SilSonra {

    public static void main(String[] args) {
        //ClassA classA = new ClassA();
        /*
        *   A statik blok
            A instance initialize blok
            Contructor A
        * */

        ClassB classB = new ClassB();
        /*
        //static sadece ilk seferde calistiriliyor; ikinci kere cagrildiginda calimiyor
        A statik blok
        B statick blok
        B static blok 2
        A instance initialize blok
        Contructor A
        B instance initialize blok
        Contructor B
         */
    }
}

class ClassA {

    static int a = 52;

    static {
        System.out.println("A statik blok");
    }

    //Instance Initialization bloks
    {
        System.out.println("A instance initialize blok");
    }

    public ClassA() {
        System.out.println("Contructor A");
    }
}

class ClassB extends ClassA {

    static {
        System.out.println("B statick blok");
    }

    static {
        System.out.println("B static blok 2");
    }

    //Instance Initialization bloks
    {
        System.out.println("B instance initialize blok");
    }

    public ClassB() {
        System.out.println("Contructor B");
    }
}