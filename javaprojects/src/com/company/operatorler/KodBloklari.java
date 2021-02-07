package com.company.operatorler;

public class KodBloklari {

    public static void main(String[] args) {
        int seviye1Blok1 = 1;
        {
            System.out.println(seviye1Blok1);
            //System.out.println(seviye2Blok1);

            int seviye2Blok1 = 21;
            {
                System.out.println(seviye1Blok1);
                System.out.println(seviye2Blok1);
                //System.out.println(seviye3Blok1);

                int seviye3Blok1 = 31;
                {
                    System.out.println(seviye1Blok1);
                    System.out.println(seviye2Blok1);
                    System.out.println(seviye3Blok1);
                }
            }
        }

        int seviye1Blok2 = 12;
        {
            System.out.println(seviye1Blok1);
            System.out.println(seviye1Blok2);
        }
    }
}
