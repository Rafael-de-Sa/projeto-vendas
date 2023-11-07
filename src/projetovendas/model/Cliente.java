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
public class Cliente extends Pessoa implements IOperacao, IPesquisar {

    private double renda;
    private int status;
    private String localDeTrabalho;
    private Pessoa pessoa;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Cliente{" + "renda=" + renda + ", status=" + status + ", localDeTrabalho=" + localDeTrabalho + ", pessoa=" + pessoa + '}';
    }

    @Override
    public Pessoa pesquisar() {
        return new Cliente();
    }

}
