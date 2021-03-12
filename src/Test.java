public class Test {
    public static void main(String[] args) {
        Wachtrij wachtrij = new Wachtrij();
        wachtrij.voegToe("Marc");
        wachtrij.voegToe("Jos");
        System.out.println(wachtrij);  // rij = rij.Tostring()
        wachtrij.bediend("Joris");
        wachtrij.bediend("Lars");
        System.out.println(wachtrij);
        wachtrij.overzichtBedienden();
        wachtrij.overzichtWachtenden();
        wachtrij.tellen();
    }
}


