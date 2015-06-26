/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import senac.segundonaveiculos.entidades.Veiculo;
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
    
    public void excluir() {
        veiculoRN.excluir(veiculo);
    }

    public void onRowEdit(RowEditEvent event) {        
        veiculoRN.salvar((Veiculo) event.getObject());
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public List<Veiculo> listar() {
        return veiculoRN.listar();
    }    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }   
}
