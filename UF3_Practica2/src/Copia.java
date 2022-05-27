public class Copia {

    private int id;

    private String nom;

    private String tipus;

    private String editorial;

    private int any;

    private Autor autor;

    private String estat;

    public Copia(int id, String nom, String tipus, String editorial, int any, Autor autor, String estat) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
        this.estat = estat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        if (estat.equalsIgnoreCase("prestat")||estat.equalsIgnoreCase("reparacio")||estat.equalsIgnoreCase("retard")||estat.equalsIgnoreCase("biblioteca")){
            this.estat = estat;
        }
    }

    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", nom=" + nom + ", tipus=" + tipus + ", editorial=" + editorial + ", any=" + any + ", autor=" + autor + ", estat=" + estat + '}';
    }
    
    
}
