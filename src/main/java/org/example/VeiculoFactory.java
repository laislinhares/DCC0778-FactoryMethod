package org.example;

public class VeiculoFactory {
    public static IVeiculo obterVeiculo(String veiculo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Veiculo" + veiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Veiculo inexistente");
        }
        if (!(objeto instanceof IVeiculo)) {
            throw new IllegalArgumentException("Veiculo inválido");
        }
        return (IVeiculo) objeto;
    }
}
