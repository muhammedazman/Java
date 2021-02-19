package com.company.bolum_10_abstractinterface.access_modifier;

public class DefaultveyaPackage {

    //basina herhangi bir access ozelligi tanimlanmazsa bunlar default olur.
    //ayni package altindaki bütün class lar bu dosyaya erisebilir; ama farkli packagelerin altindaki java dosyalari erisemez
    int sayi = 5;
    void metot() {

    }

    class InnerClass{

    }
}

class Y extends DefaultveyaPackage{

    @Override
    void metot() {
        super.metot();
        System.out.println(sayi);
    }
}
