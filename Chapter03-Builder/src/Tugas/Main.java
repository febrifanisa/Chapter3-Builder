package Tugas;

public class Main{
    public static void main(String[] args) {
        //AlatTulis.java
        // Build AlatTulis dengan setters
        AlatTulis alattulis1 = new AlatTulis();
        alattulis1.setNama("Pensil");
        alattulis1.setMerek("Faber-Castell");
        alattulis1.setWarna("Hitam");
        alattulis1.setHarga("Rp.5000");
        System.out.println("Alat Tulis Pertama :\n" + alattulis1.toString());

        // Build AlatTulis Dengan AlatTulisBuilder using fluent interface
        AlatTulis alattulis2 = new AlatTulisBuilder()
                .nama("Pulpen")
                .merek(null)
                .warna("Biru")
                .harga("Rp.3000")
                .getResult();
        System.out.println("\nAlat Tulis Kedua:\n" + alattulis2.toString());

        // Dengan Builder AlatTulisDirector
        AlatTulisDirector alatTulisDirector = AlatTulisDirector.getInstance();
        AlatTulis buildsepidol = alatTulisDirector.buildsepidol();
        System.out.println("\nAlat Tulis Ketiga");
        System.out.println(buildsepidol);
        System.out.println("\n\n");
    }
}

