import java.util.ArrayList;
import java.util.Scanner;

public class TokoElektro {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Laptop> daftarLaptop = new ArrayList<>();
    static ArrayList<Tv> daftarTv = new ArrayList<>();
    static ArrayList<Kulkas> daftarKulkas = new ArrayList<>();
    static ArrayList<AC> daftarAC = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Manajemen Toko Elektronik ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Update Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> pilihProduk("lihat");
                case 2 -> pilihProduk("tambah");
                case 3 -> pilihProduk("update");
                case 4 -> pilihProduk("hapus");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }

    static void pilihProduk(String aksi) {
        int pilih;
        do {
            System.out.println("\nPilih Produk");
            System.out.println("1. Laptop");
            System.out.println("2. TV");
            System.out.println("3. Kulkas");
            System.out.println("4. AC");
            System.out.println("0. Kembali");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    if (aksi.equals("lihat")) tampilLaptop();
                    if (aksi.equals("tambah")) tambahLaptop();
                    if (aksi.equals("update")) updateLaptop();
                    if (aksi.equals("hapus")) hapusLaptop();
                }
                case 2 -> {
                    if (aksi.equals("lihat")) tampilTv();
                    if (aksi.equals("tambah")) tambahTv();
                    if (aksi.equals("update")) updateTv();
                    if (aksi.equals("hapus")) hapusTv();
                }
                case 3 -> {
                    if (aksi.equals("lihat")) tampilKulkas();
                    if (aksi.equals("tambah")) tambahKulkas();
                    if (aksi.equals("update")) updateKulkas();
                    if (aksi.equals("hapus")) hapusKulkas();
                }
                case 4 -> {
                    if (aksi.equals("lihat")) tampilAC();
                    if (aksi.equals("tambah")) tambahAC();
                    if (aksi.equals("update")) updateAC();
                    if (aksi.equals("hapus")) hapusAC();
                }
                default -> System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }

    static void tambahLaptop() {
        Laptop l = new Laptop();

        System.out.print("ID : ");
        l.setID(input.nextLine());

        System.out.print("Merk : ");
        l.setMerk(input.nextLine());

        System.out.print("Seri : ");
        l.setSeri(input.nextLine());

        System.out.print("RAM : ");
        l.setRAM(input.nextLine());

        System.out.print("Storage : ");
        l.setStorage(input.nextLine());

        System.out.print("Processor : ");
        l.setProcessor(input.nextLine());

        daftarLaptop.add(l);
    }

    static void tampilLaptop() {
        if (daftarLaptop.isEmpty()) {
            System.out.println("Data laptop kosong");
            return;
        }
        for (Laptop l : daftarLaptop) {
            l.tampilInfo();
        }
    }

    static void updateLaptop() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Laptop l : daftarLaptop) {
            if (l.getID().equals(id)) {
                System.out.print("Merk baru : ");
                l.setMerk(input.nextLine());
                System.out.print("Seri baru : ");
                l.setSeri(input.nextLine());
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void hapusLaptop() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Laptop l : daftarLaptop) {
            if (l.getID().equals(id)) {
                daftarLaptop.remove(l);
                System.out.println("Data dihapus");
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void tambahTv() {
        Tv t = new Tv();
        System.out.print("ID : ");
        t.setID(input.nextLine());

        System.out.print("Merk : ");
        t.setMerk(input.nextLine());

        System.out.print("Seri : ");
        t.setSeri(input.nextLine());

        System.out.print("Ukuran : ");
        t.setUkuran(input.nextLine());

        daftarTv.add(t);
    }

    static void tampilTv() {
        if (daftarTv.isEmpty()) {
            System.out.println("Data TV kosong");
            return;
        }
        for (Tv t : daftarTv) {
            t.tampilInfo();
        }
    }

    static void updateTv() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Tv t : daftarTv) {
            if (t.getID().equals(id)) {
                System.out.print("Merk baru : ");
                t.setMerk(input.nextLine());
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapusTv() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Tv t : daftarTv) {
            if (t.getID().equals(id)) {
                daftarTv.remove(t);
                System.out.println("Data dihapus");
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void tambahKulkas() {
        Kulkas k = new Kulkas();

        System.out.print("ID : ");
        k.setID(input.nextLine());

        System.out.print("Merk : ");
        k.setMerk(input.nextLine());

        System.out.print("Seri : ");
        k.setSeri(input.nextLine());

        System.out.print("Jumlah pintu : ");
        k.setPintu(input.nextInt());
        input.nextLine();

        daftarKulkas.add(k);
    }

    static void tampilKulkas() {
        if (daftarKulkas.isEmpty()) {
            System.out.println("Data kulkas kosong");
            return;
        }
        for (Kulkas k : daftarKulkas) {
            k.tampilInfo();
        }
    }

    static void updateKulkas() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Kulkas k : daftarKulkas) {
            if (k.getID().equals(id)) {
                System.out.print("Merk baru : ");
                k.setMerk(input.nextLine());
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapusKulkas() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (Kulkas k : daftarKulkas) {
            if (k.getID().equals(id)) {
                daftarKulkas.remove(k);
                System.out.println("Data dihapus");
                return;
            }
        }

        System.out.println("ID tidak ditemukan");
    }

    static void tambahAC() {
        AC a = new AC();

        System.out.print("ID : ");
        a.setID(input.nextLine());

        System.out.print("Merk : ");
        a.setMerk(input.nextLine());

        System.out.print("Seri : ");
        a.setSeri(input.nextLine());

        System.out.print("PK : ");
        a.setPk(input.nextInt());
        input.nextLine();

        daftarAC.add(a);
    }

    static void tampilAC() {
        if (daftarAC.isEmpty()) {
            System.out.println("Data AC kosong");
            return;
        }
        for (AC a : daftarAC) {
            a.tampilInfo();
        }
    }

    static void updateAC() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (AC a : daftarAC) {
            if (a.getID().equals(id)) {
                System.out.print("Merk baru : ");
                a.setMerk(input.nextLine());
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapusAC() {
        System.out.print("Masukkan ID : ");
        String id = input.nextLine();
        for (AC a : daftarAC) {
            if (a.getID().equals(id)) {
                daftarAC.remove(a);
                System.out.println("Data dihapus");
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }
}