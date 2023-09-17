import org.example.IVeiculo;
import org.example.VeiculoFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoOnibusTest {

    @Test
    public void deveComprarOnibus() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Onibus");
        assertEquals("Onibus comprado!", veiculo.comprar());
    }

    @Test
    public void deveVenderOnibus() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Onibus");
        assertEquals("Onibus vendido!", veiculo.vender());
    }

    @Test
    public void deveCadastrarOnibus() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Onibus");
        assertEquals("Onibus cadastrado!", veiculo.cadastrar());
    }
}
