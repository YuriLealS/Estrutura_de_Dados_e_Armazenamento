public class Coordenador implements Funcionario {
    private String nome;
    private int qtdHoras;
    private double valorHora;

    public Coordenador(String nome, int qtdHoras, double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        double total = qtdHoras * valorHora;
        return total;
    }

    @Override
    public double getValorBonus() {
        double totalBonus = (qtdHoras * valorHora) * 1.3;
        return totalBonus;
    }
    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", qtdHoras=" + qtdHoras +
                ", valorHora=" + valorHora +
                '}';
    }
}
