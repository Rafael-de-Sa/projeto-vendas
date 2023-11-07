/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import projetovendas.interfaces.IOperacao;
import projetovendas.interfaces.IPesquisar;

/**
 *
 * @author rafae
 */
public class Funcionario extends Pessoa implements IPesquisar, IOperacao {

    private String cargo;
    private double comissao;
    private long dataAdmissao;
    private long dataDemissao;
    private String funcao;
    private int status;
    private Pessoa pessoa;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(long dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public long getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(long dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + ", comissao=" + comissao + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + ", funcao=" + funcao + ", status=" + status + ", pessoa=" + pessoa + '}';
    }

    @Override
    public Pessoa pesquisar() {
        return new Funcionario();
    }

}
