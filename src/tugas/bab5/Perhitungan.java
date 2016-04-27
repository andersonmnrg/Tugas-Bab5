package perhitungan;
public class Perhitungan {
    public static void hitPenjumlahan(int nil1, int nil2) {
        int hasil = nil1 + nil2;
        System.out.println("Hasil : " + hasil);
    }
    public static void hitPengurangan(int nil1, int nil2) {
        int hasil = nil1 - nil2;
        System.out.println("Hasil : " + hasil);
    }
    public void hitPerkalian(int nil1, int nil2) {
        int hasil = nil1 * nil2;
        System.out.println("Hasil : " + hasil);
    }
    public void hitPembagian(double nil1, double nil2) {
        double hasil = nil1/nil2; 
        System.out.println("Hasil : " + hasil);
    }
    public void menyederhanakanPecahan(int pembilang, int penyebut) {
        if (pembilang > penyebut && pembilang % penyebut == 0) {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil : " + hasil);
        } else {
            int b = pembilang;
            int c = penyebut;
            while (c != 0) {
                int a = b % c;
                b = c;
                c = a;
            }
            pembilang /= b;
            penyebut /= b;
            System.out.println("Hasil : " + pembilang + "/" + penyebut);
        }
    }
}
