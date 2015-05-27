/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import java.util.List;
import senac.segundonaveiculos.dao.VendedorDAO;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.entidades.Vendedor;

/**
 *
 * @author 631310070
 */
public class VendedorRN {
 
    private Vendedor vendedor;
    private VendedorDAO vendedorDAO;
    
    public VendedorRN() {
        this.vendedor = new Vendedor();
        this.vendedorDAO = new VendedorDAO();
    }
    
    public Boolean salvar(Vendedor vendedor) {
        return vendedorDAO.salvar(vendedor);
    }

    public void excluir(Vendedor vendedor) {
        vendedorDAO.excluir(vendedor);
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public List<Vendedor> listar() {
        return vendedorDAO.listar();
    }    
    
}
