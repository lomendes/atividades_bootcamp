package javaTwoTTList2;

import enums.Cargos;

public class FuncionarioCLT extends  Funcionario {

    private final static Double valorMetas = 1000.0;
    private Double bonificacao;
    private Integer horasDescansoRemunerada;
    private Integer metasBatidas = 0;

    public FuncionarioCLT(String nome, Cargos cargo, Double salario) {
        super(nome, cargo, salario);
    }

    public FuncionarioCLT(String nome, Cargos cargo, Double salario, Double bonificacao, Integer metasBatidas) {
        super(nome, cargo, salario);
        this.bonificacao = bonificacao;
        this.metasBatidas = metasBatidas;
    }

    public FuncionarioCLT(String nome, Cargos cargo, Double salario, Integer cargaHoraria, Double bonificacao, Integer horasDescansoRemunerada) {
        super(nome, cargo, salario, cargaHoraria);
        this.bonificacao = bonificacao;
        this.horasDescansoRemunerada = horasDescansoRemunerada;
    }

    public Integer getMetasBatidas() {
        return metasBatidas;
    }

    public void setMetasBatidas(Integer metasBatidas) {
        this.metasBatidas = metasBatidas;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Integer getHorasDescansoRemunerada() {
        return horasDescansoRemunerada;
    }

    public void setHorasDescansoRemunerada(Integer horasDescansoRemunerada) {
        this.horasDescansoRemunerada = horasDescansoRemunerada;
    }

    @Override
    public Double pagarSalario(Double valor, Integer horasTrabalhadas) {
        if (this.getCargo() == Cargos.DIRETOR){
            double bonificacaoDiretor = valor*0.03;
            return 15000.0 + bonificacaoDiretor;
        } else {
         int totalCargaHoraria =   this.getCargaHoraria() + this.getHorasDescansoRemunerada();
         int horasAPagar = (this.getCargaHoraria() - (this.getCargaHoraria() - horasTrabalhadas)) + this.getHorasDescansoRemunerada();

         Double valorBonificacao =(valor * this.getMetasBatidas()) * this.getBonificacao()/100;
         Double salarioApagar = (this.getSalario() / totalCargaHoraria) * horasAPagar;

         return salarioApagar + valorBonificacao;
        }
    }

    @Override
    public Double pagarSalario(Integer horasTrabalhadas) {
        // Nao precisa implementar, pq CLT nao eh calculado por hr trabalhada
        return null;
    }
}


