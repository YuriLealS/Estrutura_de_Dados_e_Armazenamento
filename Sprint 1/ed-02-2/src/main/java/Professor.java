public class Professor extends Educador{
    public Professor(String nome, int qtdHoras, double valorHoraAula) {
        super(nome, qtdHoras, valorHoraAula);
    }

    @Override
    public double getValorBonus() {
        return 0;
    }

    @Override
    public double getValorBonus(Professor p) {
        double total = p.calculaSalario(p) * 1.1;
        return total;
    }

}
