/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.*;

/**
 *
 * @author rafae
 */
public class Cliente extends Pessoa implements IPesquisa {

    private double renda;
    private int status;
    private String localDeTrabalho;
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

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

    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
