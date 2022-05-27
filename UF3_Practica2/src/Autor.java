public class Autor extends Persona {

    public Autor(String nom, String nacionalitat, String dataNaixement) {
        super(nom, nacionalitat, dataNaixement);
    }

    @Override
    public String toString() {
        return "Autor{" + '}';
    }
    
}
