package senac.segundonaveiculos.mb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.rn.ClienteRN;

/**
 *
 * @author 631310076
 */
@ManagedBean
@RequestScoped
public class ClienteMB {
    private Cliente cliente;
    private ClienteRN clienteRN;

    public ClienteMB(Cliente cliente) {
        this.cliente = new Cliente();
        this.clienteRN = new ClienteRN();
    }

<<<<<<< HEAD
    public void salvar() {
        this.clienteRN.salvar(this.cliente);
    }
    
=======
>>>>>>> 545873b70f7c0fa5df5060c32a4a031a9b0c89ba
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
