public class Tag {
    private Eintrag Daten;
    private Tag NF;

    public Tag() {
    }

    Tag(Eintrag neu) {
        this.Daten = neu;
    }

    Tag(String marke, String modell, int leistung, int preis) {
        Eintrag neu = new Eintrag();
        this.Daten = neu;
    }

    public Eintrag getDaten() {
        return Daten;
    }

    public void setDaten(Eintrag Daten) {
        this.Daten = Daten;
    }

    public Tag getNF() {
        return NF;
    }

    public void setNF(Tag NF) {
        this.NF = NF;
    }

    @Override
    public String toString() {
        return Daten.toString();
    }
}
