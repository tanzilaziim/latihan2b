public class MobilKonstruktor { //Pembukaan kelas MobilKonstrukor
    public static void main(String[] args) { //Pembukaan main
        Mobil mobilku = new Mobil("Merah", 2003);
        //Pembuatan objek dengan menggunakan konstruktor dimana
        //warna diisi merah dan tahunProduksi diisi 2003
        mobilku.info(); //pemanggilan method info dengan objek mobilku
    } //Penutup bagian main
} //Penutup kelas MobilKonstruktor