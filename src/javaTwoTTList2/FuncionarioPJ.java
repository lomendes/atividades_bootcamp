package javaTwoTTList2;

import enums.Cargos;

public class FuncionarioPJ extends Funcionario{


    public FuncionarioPJ(String nome, Cargos cargo, Double salario, Integer cargaHoraria) {
        super(nome, cargo, salario, cargaHoraria);
    }

    @Override
    public Double pagarSalario(Double valor, Integer horasTrabalhadas) {
        return null;
    }

    @Override
    public Double pagarSalario(Integer horasTrabalhadas) {

        int horasAPagar = (this.getCargaHoraria() - (this.getCargaHoraria() - horasTrabalhadas));
        return  (this.getSalario() / this.getCargaHoraria()) * horasAPagar;
    }
}
