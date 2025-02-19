public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen = "AFP";
        dosen1.nama = "Adevian Fairuz Pratama, S.ST, M.Eng";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2008;
        dosen1.bidangKeahlian = "Pengembangan Perangkat Lunak";

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                          Informasi Dosen ");
        System.out.println("--------------------------------------------------------------------------");
        dosen1.tampilInformasi();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                          Update Dosen ");
        System.out.println("--------------------------------------------------------------------------");
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja Dosen : " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Matematika Lanjut");

        Dosen04 dosen2 = new Dosen04("HP", "Hendra Pradipta, SE., M.Sc.", false, 2005, "Basis Data");

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("                          Informasi Dosen ");
        System.out.println("--------------------------------------------------------------------------");
        dosen2.tampilInformasi();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                          Update Dosen");
        System.out.println("--------------------------------------------------------------------------");
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja Dosen : " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Analisa Proses Bisnis\n");

    }
}