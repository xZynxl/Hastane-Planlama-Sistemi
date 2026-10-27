import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class HastaneTest {

    
    @Test
    public void testAcilHastaOlusturma() {
        Hasta hasta = HastaFactory.hastaOlustur("acil", "Ali Yılmaz", "12345678901");
        assertTrue(hasta instanceof AcilHasta);
    }


    @Test
    public void testAcilHastaSkoru() {
        Hasta hasta = HastaFactory.hastaOlustur("acil", "Ali Yılmaz", "12345678901");
        assertEquals(10, hasta.getAciliyetSkoru());
    }


    @Test
    public void testNormalHastaOlusturma() {
        Hasta hasta = HastaFactory.hastaOlustur("normal", "Ayşe Kaya", "10987654321");
        assertTrue(hasta instanceof NormalHasta);
    }


    @Test
    public void testNormalHastaSkoru() {
        Hasta hasta = HastaFactory.hastaOlustur("normal", "Ayşe Kaya", "10987654321");
        assertEquals(1, hasta.getAciliyetSkoru());
    }


    @Test
    public void testGecersizHastaTipi() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            HastaFactory.hastaOlustur("bilinmeyen", "Hata Test", "00000000000");
        });
        assertTrue(exception.getMessage().contains("Geçersiz hasta tipi"));
    }


    @Test
    public void testSiralamaAlgoritmasi() {
        Hasta h1 = HastaFactory.hastaOlustur("normal", "Normal 1", "111");
        Hasta h2 = HastaFactory.hastaOlustur("acil", "Acil 1", "222");
        Hasta h3 = HastaFactory.hastaOlustur("normal", "Normal 2", "333");

        List<Hasta> liste = Arrays.asList(h1, h2, h3);
        ISiralamaStratejisi siralama = new AciliyeteGoreSirala();
        List<Hasta> siraliListe = siralama.sirala(liste);

        assertEquals(10, siraliListe.get(0).getAciliyetSkoru());
    }

    @Test
    public void testAdSoyadKapsulleme() {
        Hasta hasta = HastaFactory.hastaOlustur("acil", "Fatma Şahin", "44444444444");
        assertEquals("Fatma Şahin", hasta.getAdSoyad());
    }

    @Test
    public void testTcKimlikKapsulleme() {
        Hasta hasta = HastaFactory.hastaOlustur("normal", "Mehmet Demir", "55555555555");
        assertEquals("55555555555", hasta.getTcKimlik());
    }
}