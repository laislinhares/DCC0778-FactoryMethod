import org.example.IVeiculo;
import org.example.VeiculoFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoFactoryTest {
    @Test
    public void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            IVeiculo veiculo = VeiculoFactory.obterVeiculo("Navio");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IVeiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo inválido", e.getMessage());
        }
    }
}
