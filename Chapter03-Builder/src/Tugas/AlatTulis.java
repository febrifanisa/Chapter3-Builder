package Tugas;
import java.security.AllPermission;
public class AlatTulis {
    private String nama, merek, warna, harga;

    public AlatTulis(){
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getharga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "AlatTulis"
                + "\n--------"
                + "\nNama = " + getNama()
                + "\nMerek = " + getMerek()
                + "\nwarna = " + getWarna()
                + "\nHarga = " + getharga();
    }
}
class AlatTulisBuilder {

    private AlatTulis alatTulis;

    public AlatTulisBuilder(){
        this(new AlatTulis());
    }

    public AlatTulisBuilder(AlatTulis alatTulis) {
        this.alatTulis = alatTulis;
    }
    public AlatTulisBuilder nama(String nama) {
        alatTulis.setNama(nama);
        return this;
    }

    public AlatTulisBuilder merek(String merek) {
        alatTulis.setMerek(merek);
        return this;
    }

    public AlatTulisBuilder warna(String warna) {
        alatTulis.setWarna(warna);
        return this;
    }

    public AlatTulisBuilder harga(String harga) {
        alatTulis.setHarga(harga);
        return this;
    }

    public AlatTulis getResult() {
        return alatTulis;
    }
}
class AlatTulisDirector {
    private static AlatTulisDirector director = null;

    private AlatTulisDirector() {}

    public static synchronized AlatTulisDirector getInstance() {
        if (director == null) {
            director = new AlatTulisDirector();
        }
        return director;
    }

    public AlatTulis buildpensil() {
        AlatTulisBuilder alatTulisBuilder = new AlatTulisBuilder();
        alatTulisBuilder.nama("Pensil");
        alatTulisBuilder.merek("Faber-Castell");
        alatTulisBuilder.warna("Hitam");
        alatTulisBuilder.harga("Rp.5000");

        return alatTulisBuilder.getResult();
    }

    public AlatTulis buildpulpen() {
        AlatTulisBuilder alatTulisBuilder = new AlatTulisBuilder();
        alatTulisBuilder.nama("Pulpen");
        alatTulisBuilder.merek("Pilot");
        alatTulisBuilder.warna("Biru");
        alatTulisBuilder.harga("Rp.3000");

        return alatTulisBuilder.getResult();
    }

    public AlatTulis buildsepidol() {
        AlatTulisBuilder alatTulisBuilder = new AlatTulisBuilder();
        AlatTulis tulis = alatTulisBuilder.nama("Spidol").warna("Merah").getResult();
        return tulis;
    }
}
