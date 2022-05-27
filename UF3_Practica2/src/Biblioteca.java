
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nom;

    private List<Copia> llibres;

    public Biblioteca(String nom) {
        this.nom = nom;
        this.llibres = new ArrayList();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Copia> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Copia> llibres) {
        this.llibres = llibres;
    }
    
    public List<Copia> getLlibresPrestats() {
        List<Copia> prestats = new ArrayList();
        for (Copia llibre : llibres) {
            if (llibre.getEstat().equalsIgnoreCase("prestat")) {
                prestats.add(llibre);
            }
        }
        return prestats;
    }

    public List<Copia> getLlibresReparacio() {
        List<Copia> reparacio = new ArrayList();
        for (Copia llibre : llibres) {
            if (llibre.getEstat().equalsIgnoreCase("reparacio")) {
                reparacio.add(llibre);
            }
        }
        return reparacio;
    }

    public List<Copia> getLlibresRetard() {
        List<Copia> retard = new ArrayList();
        for (Copia llibre : llibres) {
            if (llibre.getEstat().equalsIgnoreCase("retard")) {
                retard.add(llibre);
            }
        }
        return retard;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nom=" + nom + ", llibres=" + llibres + '}';
    }
}
