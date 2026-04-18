public class Kulkas extends ProdukElektronik implements Elektronik {
    private int pintu;

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        if (pintu <= 0) {
            System.out.println("Jumlah pintu tidak boleh 0 atau negatif.");
            this.pintu = 1;
        } else {
            this.pintu = pintu;
        }
    }

    public void nyalakan() {
        System.out.println("Kulkas dinyalakan");
    }

    public void matikan() {
        System.out.println("Kulkas dimatikan");
    }

    public void tampilInfo() {
        System.out.println("\nID : " + getID());
        System.out.println("Merk : " + getMerk());
        System.out.println("Seri : " + getSeri());
        System.out.println("Pintu : " + pintu);
    }
}