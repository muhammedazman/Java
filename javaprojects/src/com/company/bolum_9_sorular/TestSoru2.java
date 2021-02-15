package com.company.bolum_9_sorular;

public class TestSoru2 {
    public static void main(String[] args) {
        CSinifi c = new CSinifi();
        /*
        1
        2
        3
         */
    }
}

class ASinifi {
    {
        System.out.println(1);
    }
}

class BSinifi extends ASinifi {
    {
        System.out.println(2);
    }
}

class CSinifi extends BSinifi {
    {
        System.out.println(3);
    }
}
