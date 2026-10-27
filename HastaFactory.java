public class HastaFactory {
    public static Hasta hastaOlustur(String tip, String adSoyad, String tcKimlik) {
        if (tip.equalsIgnoreCase("acil")) {
            return new AcilHasta(adSoyad, tcKimlik);
        } else if (tip.equalsIgnoreCase("normal")) {
            return new NormalHasta(adSoyad, tcKimlik);
        }
        throw new IllegalArgumentException("Geçersiz hasta tipi: " + tip);
    }
}