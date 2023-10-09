public class Mobil { //Pembukaan kelas Mobil
    String warna; //Pendeklarasian atribut warna dengan
    //tipe data string
    int tahunProduksi; //Pendeklarasian atribut tahunProduksi
    // dengan tipe data int
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    } //deklarasi konstruktor dengan parameter atribut warna dan tahunProduksi
    public void info(){
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahunProduksi);
    } //deklarasi method info untuk menampilkan warna dan tahun produksi
} //Penutupan kelas mobil
