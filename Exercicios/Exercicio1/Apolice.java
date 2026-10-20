import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Apolice {
    protected String numero;
    protected String segurado;
    protected LocalDate dataEmissao;

    public Apolice(String numero, String segurado) {
        this.numero = numero;
        this.segurado = segurado;
        this.dataEmissao = LocalDate.now();
    }

    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract List<String> listarDocumentosExigidos();

    public String gerarResumo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("=== RESUMO DA APÓLICE ===\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Segurado: ").append(segurado).append("\n");
        sb.append("Data de Emissão: ").append(dataEmissao.format(formatter)).append("\n");
        sb.append(String.format("Prêmio Calculado: R$ %.2f\n", calcularPremio()));
        sb.append("Documentos Exigidos:\n");
        for (String doc : listarDocumentosExigidos()) {
            sb.append(" - ").append(doc).append("\n");
        }
        sb.append("==========================");
        return sb.toString();
    }

    public String getNumero() { return numero; }
    public String getSegurado() { return segurado; }
    public LocalDate getDataEmissao() { return dataEmissao; }
}
