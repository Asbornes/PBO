public class Tv extends ProdukElektronik {
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

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Ukuran : " + ukuran);
    }
}