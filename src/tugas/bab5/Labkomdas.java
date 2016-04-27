package labkomdas;
public class Labkomdas {
    private static final int jaketA = 100000;
    private static final int jaketB = 125000;
    private static final int jaketC = 175000;
    private long totDana = 0;
    public long jaketA(int jlh) {
        if (jlh < 0) {
            System.out.println("Jumlah yang dimasukkans salah!");
            return 0;
        } else if (jlh >= 0 && jlh <= 100) {
            this.totDana += (jaketA * jlh);
            return totDana;
        } else if (jlh > 100) {
            this.totDana += ((jaketA - 5000)*jlh);
            return totDana;
        }
        return 0;
    }
    public long jaketB(int jlh) {
        if (jlh < 0) {
            System.out.println("Jumlah yang dimasukkans salah!");
            return 0;
        } else if (jlh >= 0 && jlh <= 100) {
            this.totDana += (jaketB * jlh);
            return totDana;
        } else if (jlh > 100) {
            this.totDana += ((jaketB - 5000)*jlh);
            return totDana;
        }
        return 0;
    }
    public long jaketC(int jlh) {
        if (jlh < 0) {
            System.out.println("Jumlah yang dimasukkans salah!");
            return 0;
        } else if (jlh >= 0 && jlh <= 100) {
            this.totDana += (jaketC * jlh);
            return totDana;
        } else if (jlh > 100) {
            this.totDana += ((jaketC - 15000)*jlh);
            return totDana;
        }
        return 0;
    }
    public void display(){
        System.out.println("Total biaya yang harus dibayar adalah " + this.totDana);
    }
}
