import java.util.ArrayList;

public class Argentina extends Pais {

    private double densidade;
    ArrayList<String> paisesFronteira = new ArrayList<>();

    public Argentina(String codigoIso, String nome, double populacao, double dimensaoKm2) {
        super(codigoIso, nome, populacao, dimensaoKm2);
    }

    @Override
    public void adicionarPaisesFronteira() {
        paisesFronteira.add("Bolívia");
        paisesFronteira.add("Brasil");
        paisesFronteira.add("Paraguai");
        paisesFronteira.add("Uruguai");

    }

    @Override
    public void fazFronteira(String nome) {
        if(this.paisesFronteira.contains(nome)){
            System.out.println(nome+" é vizinho(a) da Argentina!");
        }else{
            System.out.println(nome+" não é vizinho(a) da Argentina!");
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
    public double calculoDensidade() {
        this.setDensidade(this.getPopulacao()/this.getDimensaoKm2());
        return getDensidade();
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    @Override
    public ArrayList<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    @Override
    public void setPaisesFronteira(ArrayList<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }
}
