/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Classes.*;

/**
 *
 * @author rafae
 */
public class main {

    public static void main(String[] args) {
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Cafezal");
        cidade1.setCodibge(154);

        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setLogradouro("1245");
        enderecoCliente.setCidade(cidade1);
        enderecoCliente.setBairro("Zona I");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Rafael");
        pessoa1.setTipo_pessoa("2");
        pessoa1.setEmail("email@email.com");
        pessoa1.setContador(33);
        pessoa1.setEndereco(enderecoCliente);

        Cliente cliente1 = new Cliente();
        cliente1.setRenda(1542.25);
        cliente1.setStatus(1);
        cliente1.setLocalDeTrabalho("Logo Ali");
        cliente1.setPessoa(pessoa1);

        Endereco enderecoFornecedor = new Endereco();
        enderecoFornecedor.setLogradouro("1243");
        enderecoFornecedor.setCidade(cidade1);
        enderecoFornecedor.setBairro("Zona IV");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Rael");
        pessoa2.setTipo_pessoa("P");
        pessoa2.setEmail("email2@email.com");
        pessoa2.setContador(32);
        pessoa2.setEndereco(enderecoFornecedor);

        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setStatus(true);
        fornecedor1.setPessoa(pessoa2);
    }
}
