/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import projetovendas.interfaces.IOperacao;

/**
 *
 * @author rafae
 */
public class Cidade implements IOperacao {
    
    private String nome;
    private int codIbge;
    
    @Override
    public void cadastrar() {
        String insert = "insert into cidade(nome_cidade, codigo_ibge) "
                + "values ('" + getNome() + "', " + getCodibge() + ")";
        System.out.println(insert);
        BancoDeDados.listaCidades.add(this);
    }
    
    @Override
    public boolean alterar() {
        return false;
    }
    
    @Override
    public boolean excluir() {
        return false;
    }
    
    @Override
    public void cancelar() {
    }
    
    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", codibge=" + codIbge + '}';
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodibge() {
        return codIbge;
    }
    
    public void setCodibge(int codibge) {
        this.codIbge = codibge;
    }
    
}
