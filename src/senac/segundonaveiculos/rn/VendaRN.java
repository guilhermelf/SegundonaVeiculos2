/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import senac.segundonaveiculos.dao.VendaDAO;
import senac.segundonaveiculos.entidades.Venda;

/**
 *
 * @author 631310070
 */
public class VendaRN {
 
    private Venda venda;
    private VendaDAO vendaDAO;

    public VendaRN() {
        this.venda = new Venda();
        this.vendaDAO = new VendaDAO();
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
