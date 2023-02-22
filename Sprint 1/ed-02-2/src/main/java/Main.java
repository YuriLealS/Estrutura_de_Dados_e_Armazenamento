public class Main {

    public static void main(String[] args) {
        Professor p = new Professor("Yuri", 200, 20.00);
        Coordenador c = new Coordenador("Yuri", 200, 20.00, 20,30.00);
        ControleBonus cb = new ControleBonus();

        cb.addEducador(p);
        cb.addEducador(c);
        cb.exibeEducador();
        cb.calculaBonus();
    }
}
