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
public class Vendas implements IOperacao {

    private long data;
    private long hora;
    private int produtosVendidos;
    private double valorTotal;
    private int status;
    private Cliente cliente;

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public long getHora() {
        return hora;
    }

    public void setHora(long hora) {
        this.hora = hora;
    }

    public int getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(int produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vendas{" + "data=" + data + ", hora=" + hora + ", produtosVendidos=" + produtosVendidos + ", valorTotal=" + valorTotal + ", status=" + status + ", cliente=" + cliente + '}';
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
