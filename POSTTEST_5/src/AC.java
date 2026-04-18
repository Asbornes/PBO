public class AC extends ProdukElektronik implements Elektronik {
    private int pk;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        if (pk <= 0) {
            System.out.println("PK tidak boleh 0 atau negatif.");
            this.pk = 1;
        } else {
            this.pk = pk;
        }
    }

    public void nyalakan() {
        System.out.println("AC dinyalakan");
    }

    public void matikan() {
        System.out.println("AC dimatikan");
    }

    public void tampilInfo() {
        System.out.println("\nID : " + getID());
        System.out.println("Merk : " + getMerk());
        System.out.println("Seri : " + getSeri());
        System.out.println("PK : " + pk);
    }
}