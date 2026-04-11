public class AC extends ProdukElektronik {
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

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("PK : " + pk);
    }
}