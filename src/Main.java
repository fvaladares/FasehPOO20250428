//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Ponto de parteida para a execução do programa
    public static void main(String[] args) {
        int variavelQualquer = 10;
        int variavelQualquerDois;
        Veiculo carroUm = new Veiculo();
        Veiculo carroDois = new Veiculo();

        variavelQualquerDois = 0; // inicialização da variável.

        System.out.println("Valor da variavelQualquer = " + variavelQualquer);
        System.out.println("Valor da variavelQualquerDois = " + variavelQualquerDois);

        System.out.println();

        carroUm.capacidadeCombustivel = 45;
        carroUm.qtdPassageiros = 5;
        carroUm.consumoQuilometrosPorLitro = 13;

        System.out.println("Valor do carroUm = " + carroUm);
        System.out.println("Valor do carroDois = " + carroDois);

        System.out.println();

        variavelQualquerDois = variavelQualquer;
        variavelQualquer = 20;

        carroDois = carroUm;

        System.out.println("Valor da variavelQualquer = " + variavelQualquer);
        System.out.println("Valor da variavelQualquerDois = " + variavelQualquerDois);

        System.out.println();

        System.out.println("Valor do carroUm = " + carroUm);
        System.out.println("Valor do carroDois = " + carroDois);

        System.out.println();

        carroDois.consumoQuilometrosPorLitro = 17;

        System.out.println();

        System.out.println("Valor do carroUm = " + carroUm);
        System.out.println("Valor do carroDois = " + carroDois);

        System.out.println();

    }
}