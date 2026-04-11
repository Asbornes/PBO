public class ProdukElektronik {
    private String ID;
    private String merk;
    private String seri;

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

    public void setData(String ID, String merk, String seri) {
        setID(ID);
        setMerk(merk);
        setSeri(seri);
    }

    public void setData(String ID, String merk) {
        setID(ID);
        setMerk(merk);
        this.seri = "Unknown";
    }

    public void tampilInfo() {
        System.out.println("\nID : " + ID);
        System.out.println("Merk : " + merk);
        System.out.println("Seri : " + seri);
    }
}