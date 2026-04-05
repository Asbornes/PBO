public class Laptop extends ProdukElektronik {
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
}