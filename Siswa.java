import java.util.Scanner;

public class Siswa {
    private String nama;
    private int usia;
    private double nilai;

    // Konstruktor untuk menerima input pengguna
    public Siswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan usia: ");
        this.usia = scanner.nextInt();
        System.out.print("Masukkan nilai: ");
        this.nilai = scanner.nextDouble();
    }


    public String getNama() {
        return nama;
    }
    
    public int getUsia() {
        return usia;
    }
    public void setUsia() {
        if (usia > 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia harus lebih dari 0. Usia diatur ke default 0.");
        }
    }
    public double getNilai() {
        return nilai;
    }
    public void setNilai() {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada antara 0 dan 100. Nilai diatur ke default 0.");
            }
        }
}
