public class Tag {
    private Eintrag TagWurzel;
    private Tag NF;

    public Tag() {
    }

    Tag(Eintrag neu) {
        this.TagWurzel = neu;
    }

    Tag(String marke, String modell, int leistung, int preis) {
        Eintrag neu = new Eintrag();
        this.TagWurzel = neu;
    }

    public Eintrag getTagWurzel() {
        return TagWurzel;
    }

    public void setTagWurzel(Eintrag Daten) {
        this.TagWurzel = Daten;
    }

    public Tag getNF() {
        return NF;
    }

    public void setNF(Tag NF) {
        this.NF = NF;
    }

    public void add(Eintrag neu) {
        if (this.TagWurzel == null) {
            this.TagWurzel = neu;
        } else {
            Eintrag aktuell = this.TagWurzel;
            while (aktuell.getNF() != null) {
                aktuell = aktuell.getNF();
            }
            aktuell.setNF(neu);
        }
    }

    public String toString() {
        String dummy = "";
        if (this.TagWurzel == null) {
            dummy = "Die Liste ist leer.";
        } else {
            Eintrag aktuell = this.TagWurzel;
            while (aktuell != null) {
                dummy = dummy + aktuell.toString() + "\n";
                aktuell = aktuell.getNF();
            }
        }
        return dummy;
    }

    public Eintrag getVG(Eintrag zusuchen) {
        Eintrag aktuell = this.TagWurzel;
        while (aktuell.getNF() != zusuchen && aktuell.getNF() != null) {
            aktuell = aktuell.getNF();
        }
        return (aktuell);
    }

    public void tauschen(Eintrag a, Eintrag b) {
        if (a != b) {

            if (a != this.getTagWurzel() && b != this.getTagWurzel()) {
                Eintrag tmp = b;
                this.getVG(b).setNF(a);
                this.getVG(a).setNF(tmp);
                tmp = b.getNF();
                b.setNF(a.getNF());
                a.setNF(tmp);
            } else {
                if (b == this.getTagWurzel()) {
                    Eintrag tmp = b;
                    b = a;
                    a = tmp;
                }
                Eintrag tmp = b;
                this.getVG(b).setNF(a);
                this.setTagWurzel(tmp);
                tmp = b.getNF();
                b.setNF(a.getNF());
                a.setNF(tmp);
            }
        }
    }

    public Eintrag letzterEintrag() {
        Eintrag aktuell = this.getTagWurzel();
        while (aktuell.getNF() != null) {
            aktuell = aktuell.getNF();
        }
        return aktuell;
    }

    public Eintrag loeschen(Eintrag del) {
        Eintrag VG = this.getVG(del);
        Eintrag NF = del.getNF();
        Eintrag rtn = null;
        if (del != null) {
            if (del == this.getTagWurzel()) {
                this.setTagWurzel(NF);
            } else {
                VG.setNF(NF);
            }
            rtn = NF;
        }
        return rtn;
    }

    // public void bubblesort() {
    // boolean unsorted = true;
    // if (this.getTagWurzel() != null) {
    // while (unsorted) {
    // unsorted = false;
    // Tag aktuell = this.getTagWurzel();
    // while (aktuell.getNF() != null) {
    // if (aktuell.getDaten().getPreis() > aktuell.getNF().getDaten().getPreis()) {
    // tauschen(aktuell, aktuell.getNF());
    // unsorted = true;
    // } else {
    // aktuell = aktuell.getNF();
    // }
    // }
    // }
    // }
    // }
}
