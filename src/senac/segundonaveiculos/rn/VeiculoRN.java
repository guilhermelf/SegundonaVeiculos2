/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.rn;

import senac.segundonaveiculos.dao.VeiculoDAO;
import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.entidades.Vendedor;

/**
 *
 * @author 631310070
 */
public class VeiculoRN {
    
    private Veiculo veiculo;
    private VeiculoDAO veiculoDAO;

    
    public VeiculoRN() {
        this.veiculo = new Veiculo();
        this.veiculoDAO = new VeiculoDAO();
    }
    
    public Boolean salvar(Veiculo veiculo) {
        return veiculoDAO.salvar(veiculo);
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
        
    
}
