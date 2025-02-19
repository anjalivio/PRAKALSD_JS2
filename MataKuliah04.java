public class MataKuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah04() {
    }
    public MataKuliah04(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi : " + sks);
    }
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("jam telah diubah menjadi : " + jumlahJam);
    }
    public void kurangiJam(int kgjam) {
        if(kgjam > jumlahJam){
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam yang tersisa tidak cukup");
        }else{
            jumlahJam -= kgjam;
        }
    }
}