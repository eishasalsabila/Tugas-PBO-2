public class Tas extends BaseTas{
    public String model;
    public String ukuran;

    public void infoBarang() {
        System.out.println("Tas merk : " + merk);
        System.out.println("Tas warna : " + warna);
        System.out.println("Tas harga : " + harga);
        System.out.println("Tas model : " + model);
        System.out.println("Tas ukuran : " + ukuran);
    }

    public void caraPerawatan() {
        System.out.println("Lap menggunakan krim khusus kulit Tas\n");
    }
    
}
