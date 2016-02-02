public class FiguraQuadrato extends Quadrato implements Figura {

    private String nome;

    public FiguraQuadrato(float lato, String nome) {
        super(lato);
        this.nome = nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
