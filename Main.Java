public class Main {
    public static void main(String[] args) {
        // Membuat objek Siswa
        System.out.println("Masukan Data Siswa:");
        Siswa s = new Siswa();

        // Menampilkan informasi siswa
        System.out.println("\nInformasi Siswa:");
        System.out.println("Nama: " + s.getNama());
        System.out.println("Usia: " + s.getUsia());
        System.out.println("Nilai: " + s.getNilai());
        s.setUsia();
        s.setNilai();
    }
}