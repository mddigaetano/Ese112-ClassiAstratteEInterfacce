public abstract class PoligonoRegolare {

    protected final int N_LATI;

    protected final float lato;

    protected final float N_FISSO;

    public PoligonoRegolare(int nLati, float lato, float nFisso) {
        this.N_LATI = nLati;
        this.lato = lato;
        this.N_FISSO = nFisso;
    }

    public float area() {
        return (this.perimetro()*this.apotema()) / 2;
    }

    public float perimetro() {
        return lato*N_LATI;
    }

    protected final float apotema() {
        return lato*N_FISSO;
    }
}
