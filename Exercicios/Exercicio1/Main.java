import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Testando Apólice Auto
        Map<String, Object> dadosAuto = Map.of(
            "segurado", "Carlos Silva",
            "valorFipe", 80000.00,
            "idadeCondutor", 23,
            "tempoHabilitacao", 1,
            "coberturaTerceiros", 60000.00
        );
        PolicyCreator creatorAuto = new AutoPolicyCreator();
        System.out.println(creatorAuto.processarContratacao(dadosAuto));
        System.out.println("\n");

        // Testando Apólice Residencial
        Map<String, Object> dadosRes = Map.of(
            "segurado", "Ana Souza",
            "valorImovel", 450000.00,
            "altoPadrao", true,
            "possuiDocumento", true
        );
        PolicyCreator creatorRes = new ResidentialPolicyCreator();
        System.out.println(creatorRes.processarContratacao(dadosRes));
        System.out.println("\n");

        // Testando Apólice Vida
        Map<String, Object> dadosVida = Map.of(
            "segurado", "Marcos Oliveira",
            "idadeSegurado", 40,
            "capitalSegurado", 600000.00,
            "fumante", false,
            "possuiAtestado", true
        );
        PolicyCreator creatorVida = new LifePolicyCreator();
        System.out.println(creatorVida.processarContratacao(dadosVida));
        System.out.println("\n");

        // Testando Apólice Viagem
        Map<String, Object> dadosViagem = Map.of(
            "segurado", "Beatriz Lima",
            "diasViagem", 10,
            "internacional", true,
            "coberturaMedica", 35000.00,
            "possuiPassaporte", true
        );
        PolicyCreator creatorViagem = new TravelPolicyCreator();
        System.out.println(creatorViagem.processarContratacao(dadosViagem));
    }
}
