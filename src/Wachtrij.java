import java.util.HashMap;

public class Wachtrij {
    private HashMap<String, String> rij;

    // Maak een wachtrij van mensen
    public Wachtrij() {
        rij = new HashMap<>();
        rij.put("Lars", "WACHTEND");
        rij.put("Anne", "WACHTEND");
        //...
    }

    // Persoon toevoegen aan de wachtrij
    public void voegToe(String naam) {

    }


    // Status van WACHTEND naar BEDIEND veranderen
    public void bediend(String naam) {

    }

    //Maak een overzicht van de bediende personen
    public void overzichtWachtenden() {

    }

    // Maak een overzicht van de wachtende personen
    public void overzichtBedienden() {
    }

    // Tellen hoeveel wachtende en hoeveel bediende personen
    public void tellen() {
        int tellerW = 0;
        int tellerB = 0;
    }

    public String toString() {
        return "Wachtrij: " + rij;
    }
}


