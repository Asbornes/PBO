import java.util.ArrayList;
import java.util.Scanner;

class Laptop{
    String ID;
    String merk;
    String seri;
    String RAM;
    String storage;
    String processor;
}

class Tv{
    String ID;
    String merk;
    String seri;
    String ukuran;
}

class Kulkas{
    String ID;
    String merk;
    String seri;
    int pintu;
}

class AC{
    String ID;
    String merk;
    String seri;
    int pk;
}

public class TokoElektro {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Laptop> daftarLaptop = new ArrayList<>();
    static ArrayList<Tv> daftarTv = new ArrayList<>();
    static ArrayList<Kulkas> daftarKulkas = new ArrayList<>();
    static ArrayList<AC> daftarAC = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do{
            System.out.println("\n=== Manajemen Toko alat elektronik ===");
            System.out.println("1. Lihat produk");
            System.out.println("2. Tambah produk");
            System.out.println("3. Update produk");
            System.out.println("4. Hapus produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch(pilihan){
                case 1 -> pilihProduk("lihat");
                case 2 -> pilihProduk("tambah");
                case 3 -> pilihProduk("update");
                case 4 -> pilihProduk("hapus");
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak tersedia");
            }
        }while(pilihan != 0);
    }

    static boolean cekID(String id){
        for(Laptop l : daftarLaptop){
            if(l.ID.equals(id)) return true;
        }
        for(Tv t : daftarTv){
            if(t.ID.equals(id)) return true;
        }
        for(Kulkas k : daftarKulkas){
            if(k.ID.equals(id)) return true;
        }
        for(AC a : daftarAC){
            if(a.ID.equals(id)) return true;
        }
        return false;
    }

    static String inputID(){
        String id;
        while(true){
            System.out.print("ID : ");
            id = input.nextLine();
            if(!cekID(id)){
                return id;
            }
            System.out.println("ID sudah digunakan! Masukkan ID lain.");
        }
    }

    static void pilihProduk(String aksi){
        int pilih;
        do{
            System.out.println("\nPilih produk yang ingin di " + aksi + ":");
            System.out.println("1. Laptop");
            System.out.println("2. TV");
            System.out.println("3. Kulkas");
            System.out.println("4. AC");
            System.out.println("0. Kembali");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch(pilih){
                case 1 -> {
                    if(aksi.equals("lihat")) tampilLaptop();
                    if(aksi.equals("tambah")) tambahLaptop();
                    if(aksi.equals("update")) updateLaptop();
                    if(aksi.equals("hapus")) hapusLaptop();
                }

                case 2 -> {
                    if(aksi.equals("lihat")) tampilTv();
                    if(aksi.equals("tambah")) tambahTv();
                    if(aksi.equals("update")) updateTv();
                    if(aksi.equals("hapus")) hapusTv();
                }

                case 3 -> {
                    if(aksi.equals("lihat")) tampilKulkas();
                    if(aksi.equals("tambah")) tambahKulkas();
                    if(aksi.equals("update")) updateKulkas();
                    if(aksi.equals("hapus")) hapusKulkas();
                }

                case 4 -> {
                    if(aksi.equals("lihat")) tampilAC();
                    if(aksi.equals("tambah")) tambahAC();
                    if(aksi.equals("update")) updateAC();
                    if(aksi.equals("hapus")) hapusAC();
                }

                case 0 -> System.out.println("Kembali ke menu utama");
                default -> System.out.println("Pilihan tidak tersedia");
            }

        }while(pilih != 0);
    }

    static void tambahLaptop(){
        Laptop l = new Laptop();
        l.ID = inputID();

        System.out.print("Merk : ");
        l.merk = input.nextLine();

        System.out.print("Seri : ");
        l.seri = input.nextLine();

        System.out.print("RAM : ");
        l.RAM = input.nextLine();

        System.out.print("Storage : ");
        l.storage = input.nextLine();

        System.out.print("Processor : ");
        l.processor = input.nextLine();

        daftarLaptop.add(l);
    }

    static void tampilLaptop(){
        if(daftarLaptop.isEmpty()){
            System.out.println("Data laptop kosong");
            return;
        }
        for(Laptop l : daftarLaptop){
            System.out.println("\nID : " + l.ID);
            System.out.println("Merk : " + l.merk);
            System.out.println("Seri : " + l.seri);
            System.out.println("RAM : " + l.RAM);
            System.out.println("Storage : " + l.storage);
            System.out.println("Processor : " + l.processor);
        }
    }

    static void updateLaptop(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Laptop l : daftarLaptop){
            if(l.ID.equals(id)){
                System.out.print("Merk baru : ");
                l.merk = input.nextLine();

                System.out.print("Seri baru : ");
                l.seri = input.nextLine();

                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapusLaptop(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Laptop l : daftarLaptop){
            if(l.ID.equals(id)){
                daftarLaptop.remove(l);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void tambahTv(){
        Tv t = new Tv();
        t.ID = inputID();

        System.out.print("Merk : ");
        t.merk = input.nextLine();

        System.out.print("Seri : ");
        t.seri = input.nextLine();

        System.out.print("Ukuran : ");
        t.ukuran = input.nextLine();

        daftarTv.add(t);
    }

    static void tampilTv(){
        if(daftarTv.isEmpty()){
            System.out.println("Data TV kosong");
            return;
        }
        for(Tv t : daftarTv){
            System.out.println("\nID : " + t.ID);
            System.out.println("Merk : " + t.merk);
            System.out.println("Seri : " + t.seri);
            System.out.println("Ukuran : " + t.ukuran);
        }
    }

    static void updateTv(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Tv t : daftarTv){
            if(t.ID.equals(id)){

                System.out.print("Merk baru : ");
                t.merk = input.nextLine();

                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void hapusTv(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Tv t : daftarTv){
            if(t.ID.equals(id)){
                daftarTv.remove(t);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void tambahKulkas(){
        Kulkas k = new Kulkas();
        k.ID = inputID();

        System.out.print("Merk : ");
        k.merk = input.nextLine();

        System.out.print("Seri : ");
        k.seri = input.nextLine();

        System.out.print("Jumlah pintu : ");
        k.pintu = input.nextInt();
        input.nextLine();

        daftarKulkas.add(k);
    }

    static void tampilKulkas(){
        if(daftarKulkas.isEmpty()){
            System.out.println("Data kulkas kosong");
            return;
        }
        for(Kulkas k : daftarKulkas){
            System.out.println("\nID : " + k.ID);
            System.out.println("Merk : " + k.merk);
            System.out.println("Seri : " + k.seri);
            System.out.println("Pintu : " + k.pintu);
        }
    }

    static void updateKulkas(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Kulkas k : daftarKulkas){
            if(k.ID.equals(id)){
                System.out.print("Merk baru : ");
                k.merk = input.nextLine();
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void hapusKulkas(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(Kulkas k : daftarKulkas){
            if(k.ID.equals(id)){
                daftarKulkas.remove(k);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void tambahAC(){
        AC a = new AC();
        a.ID = inputID();

        System.out.print("Merk : ");
        a.merk = input.nextLine();

        System.out.print("Seri : ");
        a.seri = input.nextLine();

        System.out.print("PK : ");
        a.pk = input.nextInt();
        input.nextLine();

        daftarAC.add(a);
    }

    static void tampilAC(){
        if(daftarAC.isEmpty()){
            System.out.println("Data AC kosong");
            return;
        }
        for(AC a : daftarAC){
            System.out.println("\nID : " + a.ID);
            System.out.println("Merk : " + a.merk);
            System.out.println("Seri : " + a.seri);
            System.out.println("PK : " + a.pk);
        }
    }

    static void updateAC(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(AC a : daftarAC){
            if(a.ID.equals(id)){
                System.out.print("Merk baru : ");
                a.merk = input.nextLine();
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapusAC(){
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for(AC a : daftarAC){
            if(a.ID.equals(id)){
                daftarAC.remove(a);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }
}