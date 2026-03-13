import java.util.List;

public class Main {
    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        Filme f1 = new Filme("Titanic", "James Cameron", "Romance");
        Filme f2 = new Filme("Avatar", "James Cameron", "Ficcao");
        Filme f3 = new Filme("Titanic", "James Cameron", "Romance");

        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);

        List<Filme> resultado = locadora.buscarFilme(f3);

        System.out.println("Filmes encontrados: " + resultado.size());
    }
}
