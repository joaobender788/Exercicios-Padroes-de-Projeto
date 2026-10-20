import java.util.Map;

public class LifePolicyCreator extends PolicyCreator {
    @Override
    protected Apolice criarApolice(Map<String, Object> dados) {
        String numero = "VID-" + System.currentTimeMillis();
        String segurado = (String) dados.get("segurado");
        int idadeSegurado = (int) dados.get("idadeSegurado");
        double capitalSegurado = (double) dados.get("capitalSegurado");
        boolean fumante = (boolean) dados.get("fumante");
        boolean possuiAtestado = (boolean) dados.get("possuiAtestado");

        return new LifePolicy(numero, segurado, idadeSegurado, capitalSegurado, fumante, possuiAtestado);
    }
}
