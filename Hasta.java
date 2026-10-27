public abstract class Hasta extends Kisi {
    private int aciliyetSkoru;

    public Hasta(String adSoyad, String tcKimlik, int aciliyetSkoru) {
        super(adSoyad, tcKimlik);
        this.aciliyetSkoru = aciliyetSkoru;
    }

    public int getAciliyetSkoru() {
        return aciliyetSkoru;
    }
}