public class Tv {

    private String ID;
    private String merk;
    private String seri;
    private String ukuran;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if (ID == null || ID.isEmpty()) {
            System.out.println("ID tidak boleh kosong.");
            this.ID = "UNKNOWN";
        } else {
            this.ID = ID;
        }
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        if (merk == null || merk.isEmpty()) {
            System.out.println("Merk tidak boleh kosong.");
            this.merk = "Unknown";
        } else {
            this.merk = merk;
        }
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        if (seri == null || seri.isEmpty()) {
            System.out.println("Seri tidak boleh kosong.");
            this.seri = "Unknown";
        } else {
            this.seri = seri;
        }
    }

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
}