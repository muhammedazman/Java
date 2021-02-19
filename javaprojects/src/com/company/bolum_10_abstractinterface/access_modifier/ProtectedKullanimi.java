package com.company.bolum_10_abstractinterface.access_modifier;

public class ProtectedKullanimi {
    //default ile tek farki sudur; farkli bir paketten publi olarak tanimladigim metotlarin atindaki yerlere erisilebilir
    //pakete ozgu + sizin sinifinizdan kalitilmissa kullanabilirim
    //sadece kalitim (extend) olarak kullanimina izin vardir (farkli paketler)
    protected int protectedSayi;
    protected void protectedMetot(){

    }

    protected class InnerClass{

    }
}

class G extends ProtectedKullanimi{

    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(protectedSayi);
    }
}
