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
public class Compras implements IOperacao {

    private int data;
    private int hora;
    private int produtosComprados;
    private int valorTotal;
    private int status;
    private Fornecedor fornacedor;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(int produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Fornecedor getFornacedor() {
        return fornacedor;
    }

    public void setFornacedor(Fornecedor fornacedor) {
        this.fornacedor = fornacedor;
    }

    @Override
    public String toString() {
        return "Compras{" + "data=" + data + ", hora=" + hora + ", produtosComprados=" + produtosComprados + ", valorTotal=" + valorTotal + ", status=" + status + ", fornacedor=" + fornacedor + '}';
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
