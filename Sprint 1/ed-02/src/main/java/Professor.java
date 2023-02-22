public class Professor implements Funcionario {
    private String nome;
    private int qtdHorasProf;
    private double valorHoraProf;

    @Override
    public double calculaSalario() {
        double total = qtdHorasProf * valorHoraProf;
        return total;
    }

    @Override
    public double getValorBonus() {
        double totalBonus = (qtdHorasProf * valorHoraProf) * 1.1;
        return totalBonus;
    }

    public Professor(String nome, int qtdHorasProf, double valorHoraProf) {
        this.nome = nome;
        this.qtdHorasProf = qtdHorasProf;
        this.valorHoraProf = valorHoraProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdHorasProf() {
        return qtdHorasProf;
    }

    public void setQtdHorasProf(int qtdHorasProf) {
        this.qtdHorasProf = qtdHorasProf;
    }

    public double getValorHoraProf() {
        return valorHoraProf;
    }

    public void setValorHoraProf(double valorHoraProf) {
        this.valorHoraProf = valorHoraProf;
    }
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", qtdHorasProf=" + qtdHorasProf +
                ", valorHoraProf=" + valorHoraProf +
                '}';
    }
}
