package matematikaa;

public class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika matematika = new Matematika();
        // Memanggil method dari kelas Matematika
        int hasilPertambahan = matematika.pertambahan(20, 10);
        int hasilPengurangan = matematika.pengurangan(10, 5);
        int hasilPerkalian = matematika.perkalian(10, 3);
        double hasilPembagian = matematika.pembagian(21, 2);

        // Membuat objek Matematika2
        Matematika2 matematika2 = new Matematika2();
        // Memanggil method dari kelas Matematika2
        int hasilModulus = matematika2.modulus(20, 7);

        // Menampilkan hasil
        System.out.println("Hasil Pertambahan dari 20 + 10 = " + hasilPertambahan);
        System.out.println("Hasil Pengurangan dari 10 - 5 = " + hasilPengurangan);
        System.out.println("Hasil Perkalian dari 10 * 3 = " + hasilPerkalian);
        System.out.println("Hasil Pembagian dari 21 / 2 = " + hasilPembagian);
        System.out.println("Hasil Modulus dari 20 % 7 = " + hasilModulus);
    }
}