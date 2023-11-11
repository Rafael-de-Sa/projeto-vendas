/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.controller;

import projetovendas.interfaces.IOperacao;
import projetovendas.model.Cidade;

/**
 *
 * @author rafae
 */
public class CidadeController implements IOperacao {

    private Cidade cidade;

    @Override
    public void cadastrar() {
        cidade.cadastrar();
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        cidade = null;
        return false;
    }

    @Override
    public void cancelar() {
        cidade.cancelar();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
