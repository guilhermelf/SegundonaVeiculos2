/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.rn.VeiculoRN;

/**
 *
 * @author 631310076
 */
@ManagedBean
@RequestScoped
public class VeiculoMB {

    private Veiculo veiculo;
    private VeiculoRN veiculoRN;
    private String mensagem = "";
    
    public VeiculoMB() {
        this.veiculo = new Veiculo();
        this.veiculoRN = new VeiculoRN();
    }

    public String salvar() {
        
        if(veiculoRN.salvar(veiculo)) {
           this.mensagem = "Veiculo cadastrado com sucesso!";
           this.veiculo = new Veiculo();
           RequestContext context = RequestContext.getCurrentInstance();
           context.execute("PF('dialog').show();");
           return null;
        } else {
           this.mensagem = "Erro ao cadastrar o veiculo.";          
           return null;
        }
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
