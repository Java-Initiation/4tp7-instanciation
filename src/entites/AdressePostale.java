package entites;

public class AdressePostale {
    private String rue;
    private int rueNumero;
    private int codePostal;
    private String ville;
    public AdressePostale(String rue, int rueNumero, int codePostal, String ville) {
        this.rue = rue;
        this.rueNumero = rueNumero;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public int getRueNumero() {
        return rueNumero;
    }
    public void setRueNumero(int rueNumero) {
        this.rueNumero = rueNumero;
    }
    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "rue='" + rue + '\'' +
                ", rueNumero=" + rueNumero +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}