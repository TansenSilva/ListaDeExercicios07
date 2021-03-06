import java.util.ArrayList;
import java.util.List;

public class Chile extends Pais {

    private double densidade;
    List<String> paisesFronteira = new ArrayList<>();

    public Chile(String codigoIso, String nome, double populacao, double dimensaoKm2) {
        super(codigoIso, nome, populacao, dimensaoKm2);
    }

    @Override
    public void adicionarPaisesFronteira() {
        paisesFronteira.add("Argentina");
        paisesFronteira.add("Bolívia");
        paisesFronteira.add("Equador");

    }

    @Override
    public void fazFronteira(String nome) {
        if(this.paisesFronteira.contains(nome)){
            System.out.println(nome+" é vizinho(a) do Chile!");
        }else{
            System.out.println(nome+" não é vizinho(a) do Chile!");
        }
    }

    @Override
    public void mostraPaises() {
        System.out.println("Países que fazem fronteira:");
        for (String paisesFronteira : paisesFronteira) {
            System.out.println(paisesFronteira);
        }
    }

    @Override
    public void apresentarPais() {
        System.out.println("Dados do País");
        System.out.println("Código ISO: "+getCodigoIso());
        System.out.println("Nome: "+getNome());
        System.out.println("População: "+getPopulacao());
        System.out.println("Dimensão em Km²: "+getDimensaoKm2());

    }

    @Override
    public void calculoDensidade() {
        this.setDensidade(this.getPopulacao()/this.getDimensaoKm2());
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    @Override
    public List<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    @Override
    public void setPaisesFronteira(List<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }
}
