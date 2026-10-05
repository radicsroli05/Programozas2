package labor5;

public class Csaszar {
    private String nev;
    private int szul_ev;

    public Csaszar(String nev, int szul_ev) {
        this.nev = nev;
        this.szul_ev = szul_ev;
    }

    public Csaszar() {
    }

    public String getNev() {
        return nev;
    }

    public int getSzul_ev() {
        return szul_ev;
    }

    @Override
    public String toString() {
        return this.nev + " (" + this.szul_ev + ")";
    }
}