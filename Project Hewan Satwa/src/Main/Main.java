package Main;


import Model.*;
import java.util.Scanner;

public class Main {               
    public static Pet Cat, Dog, Bird;      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\n=============================");
            System.out.println("   Sistem Manajemen Hewan  ");
            System.out.println("=============================");
            System.out.println("1. Tambah hewan");
            System.out.println("2. Lihat daftar hewan");
            System.out.println("3. Pilih hewan & Aksi");
            System.out.println("0. Keluar\n");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            if (pilih == 1){ 
                tambahHewan(input);
            } else if (pilih == 2) {
                tampilkanDaftar();
            } else if (pilih == 3) {
                pilihDanAksi(input);
            } else if (pilih == 0) {
                System.out.println("Selesai.");
            } else {
                System.out.println("Menu tidak dikenal.");
            }
        } while (pilih != 0);
        input.close();
    }

    static void tambahHewan(Scanner in) {
        if (Cat != null && Dog != null && Bird != null) {
            System.out.println("Semua jenis sudah terisi."); 
            return;
        }
        
        System.out.println("[1] Kucing  [2] Anjing  [3] Burung");
        System.out.print("Jenis : "); int jenis = in.nextInt();

        if ((jenis == 1 && Cat != null) || 
           (jenis == 2 && Dog != null) || 
           (jenis == 3 && Bird != null)) {
            System.out.println("Data untuk jenis ini sudah ada."); 
            return;
        }

        System.out.print("Nama  : "); String nama = in.next();
        System.out.print("Umur  : "); int umur = in.nextInt();

        if (jenis == 1) { 
            Cat  = new Cat(nama, umur);  
            System.out.println("Berhasil: " + Cat); 
        } else if (jenis == 2) { 
            Dog  = new Dog(nama, umur);  
            System.out.println("Berhasil: " + Dog); 
        } else if (jenis == 3) { 
            Bird = new Bird(nama, umur); 
            System.out.println("Berhasil: " + Bird); 
        } else {
            System.out.println("Jenis tidak dikenal.");
        }
    }

    static void tampilkanDaftar() {
        System.out.println("\n=============================");
        System.out.println("        Daftar Hewan    ");
        System.out.println("=============================");
        if (Cat == null && Dog == null && Bird == null) { 
            System.out.println("Belum ada data."); 
        return; 
        }
        if (Cat  != null) System.out.println("1. " + Cat);
        if (Dog  != null) System.out.println("2. " + Dog);
        if (Bird != null) System.out.println("3. " + Bird);
    }

    static void pilihDanAksi(Scanner in) {
        if (Cat == null && Dog == null && Bird == null) { 
            System.out.println("Belum ada data."); 
        return; 
    }
        tampilkanDaftar();
        System.out.print("Pilih nomor hewan : "); 
        int no = in.nextInt();

        Pet target = null;
        if (no == 1){
            target = Cat;
        }else if (no == 2){
            target = Dog;
        } else if (no == 3) {
            target = Bird;
        }
        
        System.out.println("1) Makan  2) Tidur  3) Bersuara");
        System.out.print("Pilih aksi: "); 
        int a = in.nextInt();

        if (a == 1) {
            target.makan();
        }else if (a == 2) {
            target.tidur();
        } else if (a == 3) 
            System.out.println(target.Nama() + " bersuara " + target.suara());
          else System.out.println("Aksi tidak dikenal.");
    }
}
