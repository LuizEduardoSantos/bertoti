import java.util.LinkedList;
import java.util.List;

public class Locadora {

    private List<Filme> filmes;

    public Locadora() {
        filmes = new LinkedList<Filme>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> buscarFilme(Filme fil) {
        List<Filme> encontrados = new LinkedList<Filme>();

        for (Filme filme : filmes) {
            // Alto acoplamento:
            // if (filme.getTitulo().equals(fil.getTitulo()) &&
            //     filme.getDiretor().equals(fil.getDiretor()) &&
            //     filme.getGenero().equals(fil.getGenero())) {
            //     encontrados.add(filme);
            // }

            // Baixo acoplamento:
            if (filme.comparar(fil)) {
                encontrados.add(filme);
            }
        }

        return encontrados;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }
}
