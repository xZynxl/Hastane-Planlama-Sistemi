public abstract class Kisi {
    private String adSoyad;
    private String tcKimlik;

    public Kisi(String adSoyad, String tcKimlik) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }
    public abstract void bilgiYazdir();
}