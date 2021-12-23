package javaTwoTTList2;

import enums.Cargos;

public abstract class Funcionario {

    private String nome;
    private Cargos cargo;
    private Double salario;
    private Integer cargaHoraria;

    public Funcionario(String nome, Cargos cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, Cargos cargo, Double salario, Integer cargaHoraria) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public abstract Double pagarSalario(Double valor, Integer horasTrabalhadas);
    public abstract Double pagarSalario(Integer horasTrabalhadas);



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}

