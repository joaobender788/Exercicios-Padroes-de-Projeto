import java.util.Map;

public class AutoPolicyCreator extends PolicyCreator {
    @Override
    protected Apolice criarApolice(Map<String, Object> dados) {
        String numero = "AUTO-" + System.currentTimeMillis();
        String segurado = (String) dados.get("segurado");
        double valorFipe = (double) dados.get("valorFipe");
        int idadeCondutor = (int) dados.get("idadeCondutor");
        int tempoHabilitacao = (int) dados.get("tempoHabilitacao");
        double coberturaTerceiros = (double) dados.get("coberturaTerceiros");

        return new AutoPolicy(numero, segurado, valorFipe, idadeCondutor, tempoHabilitacao, coberturaTerceiros);
    }
}
