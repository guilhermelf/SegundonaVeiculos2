/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;
import java.util.List;
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

    public Cliente consultar(Integer id) {
        return clienteDAO.consultar(id);
    }
    
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }
    
    public void excluir(Cliente cliente) {
        clienteDAO.excluir(cliente);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } 

    public List<Cliente> listar() {
        return clienteDAO.listar();
    }
}