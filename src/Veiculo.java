public class Veiculo {
    // Definição de atributos da classe
    int qtdPassageiros;
    int capacidadeCombustivel;
    double consumoQuilometrosPorLitro;

    public String ping() {
        return "pong";
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "qtdPassageiros=" + qtdPassageiros +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", consumoQuilometrosPorLitro=" + consumoQuilometrosPorLitro +
                '}';
    }
}
