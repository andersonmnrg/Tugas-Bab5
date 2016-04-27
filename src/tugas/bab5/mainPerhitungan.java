package perhitungan;
import java.util.Scanner;
public class mainPerhitungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perhitungan hit = new Perhitungan();
        byte pil;
        System.out.println("==========================\n"
                + "=       PERHITUNGAN      =\n"
                + "==========================\n");
        do {
            System.out.println("1. Penjumlahan\n"
                    + "2. Pengurangan\n"
                    + "3. Perkalian\n"
                    + "4. Pembagian\n"
                    + "5. Menyederhanakan Pecahan\n"
                    + "0. Keluar");
            System.out.print("Pilihan: ");
            pil = sc.nextByte();
            switch (pil) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Angka pertama: ");
                    int nil1 = sc.nextInt();
                    System.out.print("Angka kedua: ");
                    int nil2 = sc.nextInt();
                    Perhitungan.hitPenjumlahan(nil1, nil2);
                    break;
                case 2:
                    System.out.print("Angka pertama: ");
                    nil1 = sc.nextInt();
                    System.out.print("Angka kedua: ");
                    nil2 = sc.nextInt();
                    Perhitungan.hitPengurangan(nil1, nil2);
                    break;
                case 3:
                    System.out.print("Angka pertama: ");
                    nil1 = sc.nextInt();
                    System.out.print("Angka kedua: ");
                    nil2 = sc.nextInt();
                    hit.hitPerkalian(nil1, nil2);
                    break;
                case 4:
                    System.out.print("Angka pertama: ");
                    double nila = sc.nextDouble();
                    System.out.print("Angka kedua: ");
                    double nilb = sc.nextDouble();
                    hit.hitPembagian(nila, nilb);
                    break;
                case 5:
                    System.out.print("Angka Pembilang: ");
                    nil1 = sc.nextInt();
                    System.out.print("Angka penyebut: ");
                    nil2 = sc.nextInt();
                    hit.menyederhanakanPecahan(nil1, nil2);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
                    break;
            }
            System.out.print("\nLakukan perhitungan lagi? [1] Ya   [0] Tidak\n"
                    + "=> ");
            pil = sc.nextByte();
        } while (pil != 0);
        if (pil == 0) {
            System.out.println("\nTerima Kasih!");
        }
    }
}
