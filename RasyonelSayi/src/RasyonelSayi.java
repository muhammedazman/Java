public class RasyonelSayi {

    private int pay;
    private int payda;

    public RasyonelSayi(){
        pay=0;
        payda=1;
    }

    public RasyonelSayi(int pay, int payda){
        int ebob = ebobBul(pay, payda);
        this.pay = (payda > 0 ? 1:-1) * (pay/ebob);
        this.payda = Math.abs(payda)/ebob;
    }

    private int ebobBul(int pay, int payda) {

        int payMutlakDeger = Math.abs(pay);
        int paydaMutlakDeger = Math.abs(payda);
        int ebob=1;

        for (int i = 1; i <= payMutlakDeger && i <= paydaMutlakDeger; i++) {
            if(payMutlakDeger % i == 0 && paydaMutlakDeger % i == 0){
                ebob = i;
            }
        }

        return ebob;
    }

    @Override
    public String toString() {
        if(payda==1){
            return pay + "";
        } else {
            return pay + "/" + payda;
        }
    }
}
