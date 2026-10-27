import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IVeriKayit dosyaSistemi = new DosyaIslemleri("hastane_kayitlari.txt");

        List<Hasta> beklemeSalonu = new ArrayList<>();


        beklemeSalonu.add(HastaFactory.hastaOlustur("normal", "İrem Yılmaz", "11111111111"));
        beklemeSalonu.add(HastaFactory.hastaOlustur("acil", "Abuzer Kömürcü", "22222222222"));
        beklemeSalonu.add(HastaFactory.hastaOlustur("normal", "Mehmet Karahanlı", "33333333333"));


        ISiralamaStratejisi siralama = new AciliyeteGoreSirala();
        List<Hasta> siraliHastalar = siralama.sirala(beklemeSalonu);

        System.out.println("=== MUAYENE SIRASI ===");

        for (Hasta hasta : siraliHastalar) {
            hasta.bilgiYazdir();
            dosyaSistemi.kaydet(hasta.getAdSoyad() + " muayene sırasına eklendi.");
        }
    }
}