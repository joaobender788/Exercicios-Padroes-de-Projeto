import java.util.ArrayList;
import java.util.List;

public class TravelPolicy extends Apolice {
    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistenciaMedicaUSD;
    private boolean possuiPassaporte;

    public TravelPolicy(String numero, String segurado, int diasViagem, boolean internacional, double coberturaAssistenciaMedicaUSD, boolean possuiPassaporte) {
        super(numero, segurado);
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.coberturaAssistenciaMedicaUSD = coberturaAssistenciaMedicaUSD;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public double calcularPremio() {
        double premio = diasViagem * 15.00;
        if (internacional) {
            premio += 100.00;
        }
        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (internacional) {
            return coberturaAssistenciaMedicaUSD >= 30000.00 && possuiPassaporte;
        }
        return true;
    }

    @Override
    public List<String> listarDocumentosExigidos() {
        List<String> docs = new ArrayList<>();
        docs.add("Itinerário de viagem");
        if (internacional) {
            docs.add("Passaporte");
        }
        return docs;
    }
}
