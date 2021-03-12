package com.company.bolum_16_threads;

public class OncelikVermeJoinIntterrupt {

    public static void main(String[] args) {
        TekSayiSay tekSayiSay1 = new TekSayiSay("1");// CYAN
        TekSayiSay tekSayiSay2 = new TekSayiSay("2");// RED
        tekSayiSay1.setPriority(Thread.MIN_PRIORITY);
        tekSayiSay1.start();
        //tekSayiSay2.setPriority(Thread.MAX_PRIORITY);
        //tekSayiSay2.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    if (i==2) {
                        try {
                            tekSayiSay1.join(5000);//5 sn bekleyecek
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    if (i%2 == 0) {
                        System.out.println(ThreadRenkler.Magenta +" "+ i+" öncelik: " + Thread.currentThread().getPriority());

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            //e.printStackTrace();
                            return;
                        }
                    }
                }
            }
        }.start();
    }
}


class TekSayiSay extends Thread {
    String isim;
    String renk;

    public TekSayiSay(String name) {
        super(name);
        this.isim = name;

        if (name.equals("1")) {
            renk = ThreadRenkler.Cyan;
        } else renk = ThreadRenkler.Red;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if (i==20) {
                // ilgili thread icin InterruptedException hatasi firlatiyor
                interrupt();
            }

            if (i%2 != 0) {
                System.out.println(renk +" "+ i+" öncelik: " + Thread.currentThread().getPriority());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    return;
                }
            }
        }
    }
}