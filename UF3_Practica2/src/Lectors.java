
import java.util.List;

public class Lectors extends Persona {

    private int MAXIMLLIBRES = 3;

    private Object untitledField;

    private List<Copia> prestecs;

    public void agafarLlibre(Copia c) {
        if (prestecs.size()<3) {
            prestecs.add(c);
            c.setEstat("prestat");
        }
    }
    public void retornarLlibre(Copia c) {
        if (prestecs.size()>0) {
            prestecs.remove(c);
            c.setEstat("biblioteca");
        }
    }

    public Lectors(int MAXIMLLIBRES, Object untitledField, List<Copia> prestecs, String nom, String nacionalitat, String dataNaixement) {
        super(nom, nacionalitat, dataNaixement);
        this.MAXIMLLIBRES = MAXIMLLIBRES;
        this.untitledField = untitledField;
        this.prestecs = prestecs;
    }

    public int getMAXIMLLIBRES() {
        return MAXIMLLIBRES;
    }

    public void setMAXIMLLIBRES(int MAXIMLLIBRES) {
        this.MAXIMLLIBRES = MAXIMLLIBRES;
    }

    public Object getUntitledField() {
        return untitledField;
    }

    public void setUntitledField(Object untitledField) {
        this.untitledField = untitledField;
    }

    public List<Copia> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(List<Copia> prestecs) {
        this.prestecs = prestecs;
    }

    @Override
    public String toString() {
        return "Lectors{" + "MAXIMLLIBRES=" + MAXIMLLIBRES + ", untitledField=" + untitledField + ", prestecs=" + prestecs + '}';
    }
    
}
