public class Quadrato extends PoligonoRegolare {

    public Quadrato(float lato) {
        super(4, lato, (float)0.5);
    }
    
    @Override
    public float area(){
        return lato*lato;
    }
}
