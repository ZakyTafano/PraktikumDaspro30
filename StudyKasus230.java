import java.util.Scanner;

public class StudyKasus230 {
    public static void main(String[] args) {
        // Deklarasi semua variabel di awal sesuai modul kuliah
        Scanner input = new Scanner(System.in);
        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;
        int kekuranganDokumen;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = input.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = input.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Selamat! Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dana penghargaan tidak diberikan (hanya untuk Juara 1, 2, atau 3).");
                }
            } else {
                kekuranganDokumen = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kekuranganDokumen + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPendanaanPKM = input.nextInt();

            if (jumlahDokumen == 4) {
                if (statusPendanaanPKM == 1) {
                    System.out.println("Status : Selamat! Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dana penghargaan tidak diberikan (tim tidak lolos pendanaan).");
                }
            } else {
                kekuranganDokumen = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kekuranganDokumen + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }
    }
}