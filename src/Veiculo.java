public class Veiculo {
    // Definição de atributos da classe
    private int qtdPassageiros;
    private int capacidadeCombustivel;
    private double consumoQuilometrosPorLitro;

    public Veiculo(int qtdPassageiros,
                   int capacidadeCombustivel,
                   double consumoQuilometrosPorLitro) {
        this.qtdPassageiros = qtdPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoQuilometrosPorLitro = consumoQuilometrosPorLitro;
    }

    public Veiculo() {

    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoQuilometrosPorLitro() {
        return consumoQuilometrosPorLitro;
    }

    public void setConsumoQuilometrosPorLitro(double consumoQuilometrosPorLitro) {
        this.consumoQuilometrosPorLitro = consumoQuilometrosPorLitro;
    }

    public String ping() {
        return "pong";
    }

    public double alcanceVeiculo() {
        return consumoQuilometrosPorLitro * capacidadeCombustivel;
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
