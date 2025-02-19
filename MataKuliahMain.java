public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("------------------------");
        System.out.println("Informasi Mata Kuliah 1:");
        System.out.println("------------------------");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(0);

        MataKuliah04 mk2 = new MataKuliah04("MK002", "Basis Data", 2, 6);

        System.out.println("\n-------------------------");
        System.out.println("Informasi Mata Kuliah 2:");
        System.out.println("-------------------------");
        mk2.tampilInformasi();

        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(0);
    }
}