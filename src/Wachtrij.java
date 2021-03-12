import java.util.HashMap;

public class Wachtrij {
    private HashMap<String, String> rij;

    // Maak een wachtrij van mensen
    public Wachtrij() {
        rij = new HashMap<>();
        rij.put("Lars", "WACHTEND");
        rij.put("Anne", "WACHTEND");
    }

    // Persoon toevoegen aan de wachtrij
    public void voegToe(String naam) {
        rij.put(naam, "WACHTEND");
    }


    // Status van WACHTEND naar BEDIEND veranderen
    public void bediend(String naam) {
        if (rij.containsKey(naam)) {
            rij.put(naam, "BEDIEND");
        } else {
            System.out.println("naam bestaat niet");
        }

        //       Alternatief
        //       if (rij.replace(naam, "BEDIEND") == null) {
        //       System.out.println("naam bestaat niet");
        //       }
        // testen of de naam wel degelijk voorkomt?
        // rij.replace(naam, "BEDIEND");
        // als uw key er reeds in staat, dan wordt de waarde overschreven
    }

    //Maak een overzicht van de bediende personen
    public void overzichtWachtenden() {
        System.out.println("De wachtende mensen");
        for (String naam : rij.keySet()) {
            if (rij.get(naam).equals("WACHTEND")) //rij.get(naam) = geeft de value = BEDIEND of WACHTEND
            {
                System.out.println(naam);
            }
        }
    }

    // Maak een overzicht van de wachtende personen
    public void overzichtBedienden() {
        System.out.println("De bediende mensen");
        for (String naam : rij.keySet()) {
            if (rij.get(naam).equals("BEDIEND")) //rij.get(naam) = geeft de value = BEDIEND of WACHTEND
            {
                System.out.println(naam);
            }
        }
    }

    // Tellen hoeveel wachtende en hoeveel bediende personen
    public void tellen() {
        int tellerW = 0;
        int tellerB = 0;
        for (String naam : rij.keySet()) {
            if (rij.get(naam).equals("WACHTEND")) //rij.get(naam) = geeft de value = BEDIEND of WACHTEND
            {
                tellerW++;
            } else {
                tellerB++;
            }
        }
        System.out.println("aantal wachtenden " + tellerW);
        System.out.println("aantal bedienden " + tellerB);
    }

    public String toString() {
        return "Wachtrij: " + rij;
    }
}


