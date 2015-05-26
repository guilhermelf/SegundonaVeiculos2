/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.rn.VendedorRN;

/**
 *
 * @author 631310076
 */
@ManagedBean
@RequestScoped
public class VendedorMB {

    private VendedorRN vendedorRN;
    private Vendedor vendedor;

    public VendedorMB() {
        this.vendedor = new Vendedor();
        this.vendedorRN = new VendedorRN();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}
