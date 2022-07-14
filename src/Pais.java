import java.util.ArrayList;
import java.util.List;

public abstract class Pais {

    private String codigoIso;
    private String nome;
    private double populacao;
    private double dimensaoKm2;

    List<String> paisesFronteira = new ArrayList<>();

    public Pais(String codigoIso, String nome, double populacao, double dimensaoKm2) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoKm2 = dimensaoKm2;
    }
    public abstract void adicionarPaisesFronteira ();

    public abstract void fazFronteira(String nome);

    public abstract void mostraPaises();

    public abstract void apresentarPais();

    public abstract void calculoDensidade();

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoKm2() {
        return dimensaoKm2;
    }

    public void setDimensaoKm2(double dimensaoKm2) {
        this.dimensaoKm2 = dimensaoKm2;
    }

    public List<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(List<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }
}
