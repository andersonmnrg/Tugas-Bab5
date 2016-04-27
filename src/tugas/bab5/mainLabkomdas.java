package labkomdas;
import java.util.Scanner;
public class mainLabkomdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Labkomdas lab = new Labkomdas();
        byte pil;
        System.out.println("=========================\n"
                +          "=      CV.LABKOMDAS     =\n"
                +          "=========================\n");
        System.out.println("|----|--------------|--------------|----------------------|\n"
                +          "| No | Nama Barang  | Harga/jaket  | Pembelian > 100 biji |\n"
                +          "|----|--------------|--------------|----------------------|\n"
                +          "| 1  | Jaket A      | Rp 100.000,- | Rp  95.000,-         |\n"
                +          "| 2  | Jaket B      | Rp 125.000,- | Rp 120.000,-         |\n"
                +          "| 3  | Jaket C      | Rp 175.000,- | Rp 160.000,-         |\n"
                +          "|----|--------------|--------------|----------------------|");
        do{
        System.out.print("No barang: ");
        byte no = sc.nextByte();
        System.out.print("Jumlah: ");
        int jlh = sc.nextInt();
        System.out.println("");
        switch(no){
            case 1:
                lab.jaketA(jlh);
                lab.display();
                break;
            case 2:
                lab.jaketB(jlh);
                lab.display();
                break;
            case 3:
                lab.jaketC(jlh);
                lab.display();
                break;
            default :
                System.out.println("Pilihan yang anda masukkan salah!");
                break;
        }
            System.out.print("Ingin belanja lagi? [1]ya   [0]tidak\n"
                    + "=> ");
            pil = sc.nextByte();
            if (pil == 0){
                System.out.println("Terima kasih telah berbelanja!");
            }
        }while(pil != 0);
    }
}
