import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class Teste {

    @Test
    void test() {
        LojaRacao loja = new LojaRacao();

        loja.cadastrarRacao(new Racao("Racao Premium", "Pedigree"));

        assertEquals(loja.getRacoes().size(), 1);

        List<Racao> encontrados = loja.buscarRacaoNome("Racao Premium");

        assertEquals(encontrados.get(0).getMarca(), "Pedigree");
    }
}