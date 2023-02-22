public class Main {
    public static void main(String[] args) {
        Coordenador c = new Coordenador("Yuri", 100, 20.00);
        Professor p = new Professor("João", 100, 20.00);
        ControleBonus cb = new ControleBonus();

        cb.addFuncionario(c);
        cb.addFuncionario(p);
        cb.exibeFuncionario();
        cb.calculaTotalBonus();
    }
}
