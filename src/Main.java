//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Ponto de parteida para a execução do programa
    public static void main(String[] args) {
        // Criação de um objeto do tipo Veiculo
        // Veiculo = fusca; -> declaração de variável
        // fusca = new Veiculo; -> Cria a instância (objeto)
        Veiculo fusca = new Veiculo();
        Veiculo kombi; // Declaração de váriavel do tipo Veiculo (Kombi não existe);
        double distanciaMaxima; // Informa a distância máxima que pode ser percorrida com o combustível

        kombi = new Veiculo(); // Criação do objeto

        fusca.qtdPassageiros = 10;
        fusca.consumoQuilometrosPorLitro = 25;
        fusca.capacidadeCombustivel = 50;

        kombi.qtdPassageiros = 10;
        kombi.consumoQuilometrosPorLitro = 15;
        kombi.capacidadeCombustivel = 50;

        System.out.println(fusca);
        System.out.println("+++++++++++");
        System.out.println("Fusca: " + fusca.qtdPassageiros +
                " passageiros");
        System.out.println("Kombi: " + kombi.consumoQuilometrosPorLitro +
                " Km/L");

        System.out.println("----------");
        System.out.println("ping...");
        System.out.println(kombi.ping());

        distanciaMaxima = fusca.capacidadeCombustivel * fusca.consumoQuilometrosPorLitro;

        System.out.println("O fusca ainda pode percorrer " +
                distanciaMaxima + "KM.");



    }
}