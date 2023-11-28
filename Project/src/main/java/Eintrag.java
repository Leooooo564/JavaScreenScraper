public class Eintrag {
    private Eintrag NF;
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

    public Eintrag(int vonStunde, int bisStunde, String Klasse, String Vertretung, String Lehrkraft, String Art,
            String Fach, String Raum, String RaumAlt, String Hinweis) {
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

    public void setStunden(String eingabe){
        String onlyNumbers = eingabe.replaceAll("\\D", "");
        if (onlyNumbers.length() == 2) {
            int von = (int) onlyNumbers.charAt(0);
            int bis = (int) onlyNumbers.charAt(1);
            this.setVonStunde(von);
            this.setBisStunde(bis);
        }else if (onlyNumbers.length() == 1){
            vonStunde = Integer.parseInt(onlyNumbers);
        }else{
            System.out.println("Fehler bei der Stundenangabe");
        }
    }

    public int getVonStunde() {
        return vonStunde;
    }

    public void setVonStunde(int vonStunde) {
        this.vonStunde = vonStunde;
    }

    public int getBisStunde() {
        return bisStunde;
    }

    public void setBisStunde(int bisStunde) {
        this.bisStunde = bisStunde;
    }

    public String getKlasse() {
        return Klasse;
    }

    public void setKlasse(String klasse) {
        Klasse = klasse;
    }

    public String getVertretung() {
        return Vertretung;
    }

    public void setVertretung(String vertretung) {
        Vertretung = vertretung;
    }

    public String getLehrkraft() {
        return Lehrkraft;
    }

    public void setLehrkraft(String lehrkraft) {
        Lehrkraft = lehrkraft;
    }

    public String getArt() {
        return Art;
    }

    public void setArt(String art) {
        Art = art;
    }

    public String getFach() {
        return Fach;
    }

    public void setFach(String fach) {
        Fach = fach;
    }

    public String getRaum() {
        return Raum;
    }

    public void setRaum(String raum) {
        Raum = raum;
    }

    public String getRaumAlt() {
        return RaumAlt;
    }

    public void setRaumAlt(String raumAlt) {
        RaumAlt = raumAlt;
    }

    public String getHinweis() {
        return Hinweis;
    }

    public void setHinweis(String hinweis) {
        Hinweis = hinweis;
    }

    public String toString() {
        String dummy;
        dummy = super.toString();
        dummy = dummy + " " + String.valueOf(vonStunde) + " " + String.valueOf(bisStunde) + " " + Klasse + " "
                + Vertretung + " " + Lehrkraft + " " + Art + " " + Fach + " " + Raum + " " + RaumAlt + " " + Hinweis;
        return dummy;
    }

    public Eintrag getNF() {
        return NF;
    }

    public void setNF(Eintrag NF) {
        this.NF = NF;
    }
}