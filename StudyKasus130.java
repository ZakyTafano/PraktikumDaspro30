import java.util.Scanner;

public class StudyKasus130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.print("Masukkan Jumlah Cup : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan Uang Bayar : ");
        uangBayar = sc.nextInt();

         totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = (int) (totalHarga * 0.10);
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
        }

    }
}
