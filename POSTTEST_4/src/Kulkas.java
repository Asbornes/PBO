public class Kulkas extends ProdukElektronik {
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

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Pintu : " + pintu);
    }
}