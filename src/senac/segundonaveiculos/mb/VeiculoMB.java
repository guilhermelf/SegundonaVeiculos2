/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.rn.VeiculoRN;

/**
 *
 * @author 631310076
 */
public class VeiculoMB {

    private Veiculo veiculo;
    private VeiculoRN veiculoRN;
    
    public VeiculoMB() {
        this.veiculo = new Veiculo();
        this.veiculoRN = new VeiculoRN();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
}
