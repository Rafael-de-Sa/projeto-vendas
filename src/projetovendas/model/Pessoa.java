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
public class Pessoa implements IOperacao {

    private String nome;
    private String tipoPessoa;
    private String email;
    private int contador;
    protected Endereco endereco;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", tipo_pessoa=" + tipoPessoa + ", email=" + email + ", contador=" + contador + ", endereco=" + endereco + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_pessoa() {
        return tipoPessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipoPessoa = tipo_pessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public void cadastrar() {

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

}
