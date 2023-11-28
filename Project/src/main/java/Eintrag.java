public class Eintrag {
    private int vonStunde;
    private int bisStunde;
    private String Klasse;
    private String Vertretung;
    private String Lehrkraft;
    private String Art;
    private String Fach;
    private String Raum;
    private String RaumAlt;
    private String Hinweis;

    public Eintrag() {
    }

    public Eintrag(int vonStunde, int bisStunde, String Klasse, String Vertretung, String Lehrkraft, String Art, String Fach, String Raum, String RaumAlt, String Hinweis) {
        this.vonStunde = vonStunde;
        this.bisStunde = bisStunde;
        this.Klasse = Klasse;
        this.Vertretung = Vertretung;
        this.Lehrkraft = Lehrkraft;
        this.Art = Art;
        this.Fach = Fach;
        this.Raum = Raum;
        this.RaumAlt = RaumAlt;
        this.Hinweis = Hinweis;
        
    }

    public String toString() {
        String dummy;
        dummy = super.toString();
        dummy = dummy + " " + String.valueOf(vonStunde) + " " + String.valueOf(bisStunde) + " " + Klasse + " " + Vertretung + " " + Lehrkraft + " " + Art + " " + Fach + " " + Raum + " " + RaumAlt + " " + Hinweis;
        return dummy;
    }
}