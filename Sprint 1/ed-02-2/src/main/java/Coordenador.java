import java.nio.charset.CoderResult;

public class Coordenador extends Educador {

    private int qtdHorasCoord;
    private double valorHoraCoord;
    public double getValorBonus(Coordenador c) {
        double total = (qtdHorasCoord * valorHoraCoord) * 1.3;
        return total;
    }

    @Override
    public double getValorBonus(Professor p) {
        return 0;
    }

    public Coordenador(String nome, int qtdHoras, double valorHoraAula, int qtdHorasCoord, double valorHoraCoord) {
        super(nome, qtdHoras, valorHoraAula);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    @Override
    public double getValorBonus() {
        return 0;
    }
}
