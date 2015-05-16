/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import senac.segundonaveiculos.dao.ClienteDAO;
import senac.segundonaveiculos.entidades.Cliente;

/**
 *
 * @author 631310070
 */
public class ClienteRN {
    
    private Cliente cliente;
    private ClienteDAO clienteDAO;

    public ClienteRN() {
        this.cliente = new Cliente();
        this.clienteDAO = new ClienteDAO();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}