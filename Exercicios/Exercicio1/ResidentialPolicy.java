import java.util.ArrayList;
import java.util.List;

public class ResidentialPolicy extends Apolice {
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiDocumentoLocacaoOuEscritura;

    public ResidentialPolicy(String numero, String segurado, double valorImovel, boolean altoPadrao, boolean possuiDocumentoLocacaoOuEscritura) {
        super(numero, segurado);
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiDocumentoLocacaoOuEscritura = possuiDocumentoLocacaoOuEscritura;
    }

    @Override
    public double calcularPremio() {
        double premioAnual = valorImovel * 0.015;
        if (altoPadrao) {
            premioAnual += premioAnual * 0.25;
        }
        return premioAnual / 12.0;
    }

    @Override
    public boolean validarCobertura() {
        return possuiDocumentoLocacaoOuEscritura;
    }

    @Override
    public List<String> listarDocumentosExigidos() {
        List<String> docs = new ArrayList<>();
        docs.add("Escritura ou contrato de locação");
        docs.add("Comprovante de residência");
        return docs;
    }
}