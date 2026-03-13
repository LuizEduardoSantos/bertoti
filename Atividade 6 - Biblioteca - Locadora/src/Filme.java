public class Filme {

    private String titulo;
    private String diretor;
    private String genero;

    public Filme(String titulo, String diretor, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
    }

    public boolean comparar(Filme filme) {
        if (this.titulo.equals(filme.titulo) &&
                this.diretor.equals(filme.diretor) &&
                this.genero.equals(filme.genero)) {
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }
}