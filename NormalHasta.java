public class NormalHasta extends Hasta {
    public NormalHasta(String adSoyad, String tcKimlik) {
        super(adSoyad, tcKimlik, 1); // Aciliyet skoru 1
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("[NORMAL HASTA] " + getAdSoyad() + " - TC: " + getTcKimlik());
    }
}