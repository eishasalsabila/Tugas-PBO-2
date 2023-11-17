public class Main {
    public static void main(String[] args) {
        Dompet dompet_1 = new Dompet();
        System.out.println("-------- Dompet --------");
        dompet_1.merk = "Bonia";
        dompet_1.warna = "Hitam";
        dompet_1.harga = 1000000;
        dompet_1.untukJK = "Wanita";
        dompet_1.infoBarang();
        dompet_1.caraPembayaran();
        dompet_1.caraPerawatan();

        Tas tas_1 = new Tas();
        System.out.println("-------- Tas --------");
        tas_1.merk = "Bodypack";
        tas_1.warna = "Biru";
        tas_1.harga = 800000;
        tas_1.model = "Ransel";
        tas_1.ukuran = "Besar";
        tas_1.infoBarang();
        tas_1.caraPembayaran();
        tas_1.caraPerawatan();
    }
}
