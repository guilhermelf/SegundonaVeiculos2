/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import senac.segundonaveiculos.entidades.Venda;
import senac.segundonaveiculos.rn.VeiculoRN;
import senac.segundonaveiculos.rn.VendaRN;

/**
 *
 * @author 631310076
 */
public class VendaMB {

    private Venda venda;
    private VendaRN vendaRN;

    public VendaMB() {
        this.venda = new Venda();
        this.vendaRN = new VendaRN();
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
}
