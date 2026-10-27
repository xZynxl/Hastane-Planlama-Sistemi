import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DosyaIslemleri implements IVeriKayit {
    private String dosyaAdi;

    public DosyaIslemleri(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    @Override
    public void kaydet(String veri) {
        try (PrintWriter out = new PrintWriter(new FileWriter(dosyaAdi, true))) {
            out.println(veri);
            System.out.println("-> Sisteme Kaydedildi: " + veri);
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}