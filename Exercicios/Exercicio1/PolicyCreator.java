import java.util.Map;

public abstract class PolicyCreator {
    protected abstract Apolice criarApolice(Map<String, Object> dados);

    public final String processarContratacao(Map<String, Object> dados) {
        Apolice apolice = criarApolice(dados);
        
        if (!apolice.validarCobertura()) {
            throw new IllegalStateException("Contratação rejeitada: os requisitos mínimos de cobertura ou documentação não foram atendidos.");
        }
        
        return apolice.gerarResumo();
    }
}
