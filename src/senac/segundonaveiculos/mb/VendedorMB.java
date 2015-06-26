/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
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
    
    public void deslogar() {

        try {
            HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            sessao.invalidate();
            System.out.println("--------------------------");
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(VendedorMB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String logar() {
        Vendedor logado = new VendedorRN().logar(vendedor);
        
        if(logado != null) {
            HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            
            sessao.setAttribute("usuario", logado);
            
            return "principal?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Usuário e/ou senha incorreto(s)!",
                            "Tente novamente.")); 
            
            return "";
        }
    }
    
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
