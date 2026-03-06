import java.util.List;
import java.util.LinkedList;

public class LojaRacao {

    private List<Racao> racoes = new LinkedList<Racao>();

    public void cadastrarRacao(Racao racao) {
        racoes.add(racao);
    }

    public List<Racao> buscarRacaoNome(String nome) {
        List<Racao> encontrados = new LinkedList<Racao>();

        for (Racao racao : racoes) {
            if (racao.getNome().equals(nome)) {
                encontrados.add(racao);
            }
        }

        return encontrados;
    }

    public List<Racao> getRacoes() {
        return racoes;
    }
}