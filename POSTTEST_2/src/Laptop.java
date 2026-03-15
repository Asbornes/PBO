public class Laptop {

    private String ID;
    private String merk;
    private String seri;
    private String RAM;
    private String storage;
    private String processor;

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

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        if (RAM == null || RAM.isEmpty()) {
            System.out.println("RAM tidak boleh kosong.");
            this.RAM = "Unknown";
        } else {
            this.RAM = RAM;
        }
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        if (storage == null || storage.isEmpty()) {
            System.out.println("Storage tidak boleh kosong.");
            this.storage = "Unknown";
        } else {
            this.storage = storage;
        }
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        if (processor == null || processor.isEmpty()) {
            System.out.println("Processor tidak boleh kosong.");
            this.processor = "Unknown";
        } else {
            this.processor = processor;
        }
    }
}