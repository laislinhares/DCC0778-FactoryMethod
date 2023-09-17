import org.example.IVeiculo;
import org.example.VeiculoFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoCarroTest {

    @Test
    public void deveComprarCarro() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Carro");
        assertEquals("Carro comprado!", veiculo.comprar());
    }

    @Test
    public void deveVenderCarro() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Carro");
        assertEquals("Carro vendido!", veiculo.vender());
    }

    @Test
    public void deveCadastrarCarro() {
        IVeiculo veiculo = VeiculoFactory.obterVeiculo("Carro");
        assertEquals("Carro cadastrado!", veiculo.cadastrar());
    }
}
