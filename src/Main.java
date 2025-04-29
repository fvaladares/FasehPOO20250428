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

        fusca.setQtdPassageiros(10);
        fusca.setConsumoQuilometrosPorLitro(25);
        fusca.setCapacidadeCombustivel(50);

        kombi = new Veiculo(10,
                45,
                15);

        System.out.println(fusca);
        System.out.println("+++++++++++");
        System.out.println("Fusca: " + fusca.getQtdPassageiros() +
                " passageiros");
        System.out.println("Kombi: " + kombi.getConsumoQuilometrosPorLitro() +
                " Km/L");

        System.out.println("----------");
        System.out.println("ping...");
        System.out.println(kombi.ping());

        distanciaMaxima = fusca.alcanceVeiculo();

        System.out.println("O fusca ainda pode percorrer " +
                distanciaMaxima + "KM.");
    }
}