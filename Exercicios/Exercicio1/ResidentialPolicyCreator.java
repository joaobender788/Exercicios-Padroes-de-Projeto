import java.util.Map;

public class ResidentialPolicyCreator extends PolicyCreator {
    @Override
    protected Apolice criarApolice(Map<String, Object> dados) {
        String numero = "RES-" + System.currentTimeMillis();
        String segurado = (String) dados.get("segurado");
        double valorImovel = (double) dados.get("valorImovel");
        boolean altoPadrao = (boolean) dados.get("altoPadrao");
        boolean possuiDocumento = (boolean) dados.get("possuiDocumento");

        return new ResidentialPolicy(numero, segurado, valorImovel, altoPadrao, possuiDocumento);
    }
}
