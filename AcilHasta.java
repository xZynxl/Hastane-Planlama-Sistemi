public class AcilHasta extends Hasta {
    public AcilHasta(String adSoyad, String tcKimlik) {
        super(adSoyad, tcKimlik, 10); // Aciliyet skoru 10
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("[ACİL HASTA] " + getAdSoyad() + " - TC: " + getTcKimlik());
    }
}