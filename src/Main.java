
import enums.Cargos;
import javaTwoTTList2.FuncionarioCLT;
import javaTwoTTList2.FuncionarioPJ;

public class Main {

    public static void main(String[] args){
        FuncionarioCLT funcionarioCLT1 = new FuncionarioCLT("André", Cargos.GERENTE, 6000.0, 36, 12.5, 4);
        funcionarioCLT1.setMetasBatidas(3);

        FuncionarioCLT funcionarioCLT2 = new FuncionarioCLT("Lorraine", Cargos.DIRETOR, 15000.0);

        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Bia", Cargos.TECNICO, 3200.0, 40);

        System.out.println(funcionarioCLT1.pagarSalario(1000.0, 36));
        System.out.println(funcionarioCLT2.pagarSalario(100000.0, 0));
        System.out.println(funcionarioPJ.pagarSalario(40));

    }
}
