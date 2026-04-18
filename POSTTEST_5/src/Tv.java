public class Tv extends ProdukElektronik implements Elektronik {
    private String ukuran;

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        if (ukuran == null || ukuran.isEmpty()) {
            System.out.println("Ukuran tidak boleh kosong.");
            this.ukuran = "Unknown";
        } else {
            this.ukuran = ukuran;
        }
    }

    public void nyalakan() {
        System.out.println("TV dinyalakan");
    }

    public void matikan() {
        System.out.println("TV dimatikan");
    }

    public void tampilInfo() {
        System.out.println("\nID : " + getID());
        System.out.println("Merk : " + getMerk());
        System.out.println("Seri : " + getSeri());
        System.out.println("Ukuran : " + ukuran);
    }
}