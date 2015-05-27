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
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.rn.VendedorRN;

/**
 *
 * @author 631310076
 */
@ManagedBean
@RequestScoped
public class VendedorMB {

    private Vendedor vendedor;
    private VendedorRN vendedorRN;
    private String mensagem = "";
    
    public String salvar() {
        
        if(vendedorRN.salvar(vendedor)) {
           this.mensagem = "Vendedor cadastrado com sucesso!";
           this.vendedor = new Vendedor();
           RequestContext context = RequestContext.getCurrentInstance();
           context.execute("PF('dialog').show();");
           return null;
        } else {
           this.mensagem = "Erro ao cadastrar o vendedor.";          
           return null;
        }
    }
    
    public void onRowEdit(RowEditEvent event) {        
        vendedorRN.salvar((Vendedor) event.getObject());
    }
    
    public void excluir() {
        vendedorRN.excluir(vendedor);
    }
    
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
    
    public List<Vendedor> listar() {
        return vendedorRN.listar();
    }    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
