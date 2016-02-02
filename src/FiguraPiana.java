public class FiguraPiana implements Figura {

    private String nome;

    public FiguraPiana(String nome) {
        this.nome = nome;
    }

    public FiguraPiana() {
        nome = null;
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
