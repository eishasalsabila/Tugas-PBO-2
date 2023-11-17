public abstract class BaseTas {
    public String merk;
    public String warna;
    public double harga;

    public void caraPembayaran () {
        System.out.println("Cara Pembayaran dengan CASH / DEBIT BNI");
    }

    public abstract void infoBarang();

    public abstract void caraPerawatan();

    
}