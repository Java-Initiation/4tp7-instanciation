import entites.AdressePostale;
import entites.Personne;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale adressePostale = new AdressePostale("rue Machin", 3, 75000, "Paris");
        Personne personne = new Personne("dupond", "henry", adressePostale);

        System.out.println(personne);

    }

}
