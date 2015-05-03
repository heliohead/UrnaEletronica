package classes;

public class Eleitor {
    private String nome;
    private String titulo;
    private boolean votou;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the votou
     */
    public boolean isVotou() {
        return votou;
    }

    /**
     * @param votou the votou to set
     */
    public void setVotou(boolean votou) {
        this.votou = votou;
    }
}
