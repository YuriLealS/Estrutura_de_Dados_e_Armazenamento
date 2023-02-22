public abstract class Educador {
    private String nome;
    private int qtdHoras;
    private double valorHoraAula;

    public Educador(String nome, int qtdHoras, double valorHoraAula) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHoraAula = valorHoraAula;
    }

    public abstract double getValorBonus();
    public double calculaSalario(Educador e){
        double total = qtdHoras * valorHoraAula;
        return total;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Educador{" +
                "nome='" + nome + '\'' +
                ", qtdHoras=" + qtdHoras +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }

    public abstract double getValorBonus(Professor p);
}
