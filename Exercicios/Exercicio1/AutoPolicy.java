import java.util.ArrayList;
import java.util.List;

public class AutoPolicy extends Apolice {
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacaoAnos;
    private double coberturaTerceiros;

    public AutoPolicy(String numero, String segurado, double valorFipe, int idadeCondutor, int tempoHabilitacaoAnos, double coberturaTerceiros) {
        super(numero, segurado);
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacaoAnos = tempoHabilitacaoAnos;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public double calcularPremio() {
        double premioMensalBase = (valorFipe * 0.08) / 12.0;
        double premioAnual = premioMensalBase * 12.0;
        
        if (idadeCondutor < 25) {
            premioAnual += premioAnual * 0.30;
        }
        if (tempoHabilitacaoAnos < 2) {
            premioAnual += premioAnual * 0.20;
        }
        return premioAnual / 12.0;
    }

    @Override
    public boolean validarCobertura() {
        return coberturaTerceiros >= 50000.00;
    }

    @Override
    public List<String> listarDocumentosExigidos() {
        List<String> docs = new ArrayList<>();
        docs.add("CNH");
        docs.add("CRLV");
        docs.add("Comprovante de residência");
        return docs;
    }
}
