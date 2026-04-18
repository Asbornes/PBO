public class Laptop extends ProdukElektronik implements Elektronik {
    private String RAM;
    private String storage;
    private String processor;

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

    public void nyalakan() {
        System.out.println("Laptop dinyalakan");
    }

    public void matikan() {
        System.out.println("Laptop dimatikan");
    }

    public void tampilInfo() {
        System.out.println("\nID : " + getID());
        System.out.println("Merk : " + getMerk());
        System.out.println("Seri : " + getSeri());
        System.out.println("RAM : " + RAM);
        System.out.println("Storage : " + storage);
        System.out.println("Processor : " + processor);
    }
}