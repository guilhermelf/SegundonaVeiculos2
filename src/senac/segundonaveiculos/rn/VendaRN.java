/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import java.util.List;
import senac.segundonaveiculos.dao.VendaDAO;
import senac.segundonaveiculos.entidades.Cliente;
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
    
    public boolean salvar(Venda venda) {
        return vendaDAO.salvar(venda);
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Venda> listar() {
        return vendaDAO.listar();
    }
    
    public void excluir(Venda venda) {
        vendaDAO.excluir(venda);
    }
    
}
