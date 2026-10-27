import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AciliyeteGoreSirala implements ISiralamaStratejisi {
    @Override
    public List<Hasta> sirala(List<Hasta> hastalar) {
        List<Hasta> siraliListe = new ArrayList<>(hastalar);
        siraliListe.sort(Comparator.comparingInt(Hasta::getAciliyetSkoru).reversed());
        return siraliListe;
    }
}