
public class Main {
    public static void main(String[] args) {


        Chile chile = new Chile("CHI","Chile",19552.443,756.950);
        Argentina argentina = new Argentina("ARG","Argentina",47327.407,2780.000);
        chile.apresentarPais();
        chile.adicionarPaisesFronteira();
        chile.mostraPaises();
        chile.calculoDensidade();
        chile.fazFronteira("Bolívia");
        chile.fazFronteira("China");
        chile.fazFronteira("Equador");
        System.out.printf("A Desidade Populacional do Chile é de %.2f hab/Km²\n",chile.getDensidade());
        System.out.println();
        argentina.apresentarPais();
        argentina.adicionarPaisesFronteira();
        argentina.mostraPaises();
        argentina.calculoDensidade();
        System.out.printf("A Desidade Populacional da Argentina é de %.2f hab/Km²\n",argentina.getDensidade());
        argentina.fazFronteira("Bolívia");
        argentina.fazFronteira("China");
        argentina.fazFronteira("Paraguai");


    }
}
