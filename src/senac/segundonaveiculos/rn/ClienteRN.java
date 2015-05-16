/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

<<<<<<< HEAD
=======
import senac.segundonaveiculos.dao.ClienteDAO;
>>>>>>> 545873b70f7c0fa5df5060c32a4a031a9b0c89ba
import senac.segundonaveiculos.entidades.Cliente;

/**
 *
 * @author 631310070
 */
public class ClienteRN {
<<<<<<< HEAD
    private Cliente cliente;

    public void salvar(Cliente cliente) {

    }  
}
=======
    
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
>>>>>>> 545873b70f7c0fa5df5060c32a4a031a9b0c89ba
