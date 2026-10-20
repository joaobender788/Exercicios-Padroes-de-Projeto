import java.util.ArrayList;
import java.util.List;

public class LifePolicy extends Apolice {
    private int idadeSegurado;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiAtestadoMedico;

    public LifePolicy(String numero, String segurado, int idadeSegurado, double capitalSegurado, boolean fumante, boolean possuiAtestadoMedico) {
        super(numero, segurado);
        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    public double calcularPremio() {
        double premioMensal = (idadeSegurado * 12.0) + (capitalSegurado * 0.002);
        if (fumante) {
            premioMensal += premioMensal * 0.50;
        }
        return premioMensal;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500000.00) {
            return possuiAtestadoMedico;
        }
        return true;
    }

    @Override
    public List<String> listarDocumentosExigidos() {
        List<String> docs = new ArrayList<>();
        docs.add("Documento de identidade");
        docs.add("CPF");
        if (capitalSegurado > 500000.00) {
            docs.add("Atestado médico");
        }
        return docs;
    }
}
