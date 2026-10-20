import java.util.Map;

public class TravelPolicyCreator extends PolicyCreator {
    @Override
    protected Apolice criarApolice(Map<String, Object> dados) {
        String numero = "VIA-" + System.currentTimeMillis();
        String segurado = (String) dados.get("segurado");
        int diasViagem = (int) dados.get("diasViagem");
        boolean internacional = (boolean) dados.get("internacional");
        double coberturaMedica = (double) dados.get("coberturaMedica");
        boolean possuiPassaporte = (boolean) dados.get("possuiPassaporte");

        return new TravelPolicy(numero, segurado, diasViagem, internacional, coberturaMedica, possuiPassaporte);
    }
}
