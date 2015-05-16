/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import senac.segundonaveiculos.dao.VendedorDAO;
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
}
