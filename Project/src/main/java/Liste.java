public class Liste {

    private Tag Wurzel;

    Liste() {
    }

    Liste(Tag Wurzel) {
        this.Wurzel = Wurzel;
    }

    public Tag getWurzel() {
        return Wurzel;
    }

    public void setWurzel(Tag Wurzel) {
        this.Wurzel = Wurzel;
    }

    public void add(Tag neu) {
        if (this.Wurzel == null) {
            this.Wurzel = neu;
        } else {
            Tag aktuell = this.Wurzel;
            while (aktuell.getNF() != null) {
                aktuell = aktuell.getNF();
            }
            aktuell.setNF(neu);
        }
    }

    public String toString() {
        String dummy = "";
        if (this.Wurzel == null) {
            dummy = "Die Liste ist leer.";
        } else {
            Tag aktuell = this.Wurzel;
            while (aktuell != null) {
                dummy = dummy + aktuell.toString() + "\n";
                aktuell = aktuell.getNF();
            }
        }
        return dummy;
    }

    public Tag getVG(Tag zusuchen) {
        Tag aktuell = this.Wurzel;
        while (aktuell.getNF() != zusuchen && aktuell.getNF() != null) {
            aktuell = aktuell.getNF();
        }
        return (aktuell);
    }

    public void tauschen(Tag a, Tag b) {
        if (a != b) {

            if (a != this.getWurzel() && b != this.getWurzel()) {
                Tag tmp = b;
                this.getVG(b).setNF(a);
                this.getVG(a).setNF(tmp);
                tmp = b.getNF();
                b.setNF(a.getNF());
                a.setNF(tmp);
            } else {
                if (b == this.getWurzel()) {
                    Tag tmp = b;
                    b = a;
                    a = tmp;
                }
                Tag tmp = b;
                this.getVG(b).setNF(a);
                this.setWurzel(tmp);
                tmp = b.getNF();
                b.setNF(a.getNF());
                a.setNF(tmp);
            }
        }
    }

    public Tag letzterTag() {
        Tag aktuell = this.getWurzel();
        while (aktuell.getNF() != null) {
            aktuell = aktuell.getNF();
        }
        return aktuell;
    }

    public Tag loeschen(Tag del) {
        Tag VG = this.getVG(del);
        Tag NF = del.getNF();
        Tag rtn = null;
        if (del != null) {
            if (del == this.getWurzel()) {
                this.setWurzel(NF);
            } else {
                VG.setNF(NF);
            }
            rtn = NF;
        }
        return rtn;
    }

    // public void bubblesort() {
    //     boolean unsorted = true;
    //     if (this.getWurzel() != null) {
    //         while (unsorted) {
    //             unsorted = false;
    //             Tag aktuell = this.getWurzel();
    //             while (aktuell.getNF() != null) {
    //                 if (aktuell.getDaten().getPreis() > aktuell.getNF().getDaten().getPreis()) {
    //                     tauschen(aktuell, aktuell.getNF());
    //                     unsorted = true;
    //                 } else {
    //                     aktuell = aktuell.getNF();
    //                 }
    //             }
    //         }
    //     }
    // }
}