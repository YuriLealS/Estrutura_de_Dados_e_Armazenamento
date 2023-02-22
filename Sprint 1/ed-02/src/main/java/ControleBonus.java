import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List <Funcionario> funcionarios;

    public ControleBonus() {
       funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    public void exibeFuncionario(){
        System.out.println(funcionarios);
    }
    public double calculaTotalBonus(){
        double total = 0.0;
        for (Funcionario f: funcionarios) {
            total += f.getValorBonus();
        }
        System.out.println(total);
        return total;
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "funcionarios=" + funcionarios +
                '}';
    }
}
