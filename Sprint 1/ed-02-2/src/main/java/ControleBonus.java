import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List <Educador> educadores;

    public ControleBonus() {
        educadores = new ArrayList<>();
    }

    public void addEducador(Educador e){
        educadores.add(e);
    }

    public void exibeEducador(){
        System.out.println(educadores);
    }

    public double calculaBonus(){
        double total = 0.0;
        for (Educador e : educadores){
            total += e.calculaSalario(e);
        }
        System.out.println(total);
        return total;
    }
}
