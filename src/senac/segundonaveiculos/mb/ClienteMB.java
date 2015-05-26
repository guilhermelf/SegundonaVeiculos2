package senac.segundonaveiculos.mb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.rn.ClienteRN;

/**
 *
 * @author 631310076
 */

@RequestScoped
@ManagedBean
public class ClienteMB {
    private Cliente cliente;
    private ClienteRN clienteRN;
    private String mensagem = "";
    
    public ClienteMB() {
        cliente = new Cliente();
        clienteRN = new ClienteRN();
    }
    
    public String salvar() {
        
        if(clienteRN.salvar(cliente)) {
           this.mensagem = "Cliente cadastrado com sucesso!";
           this.cliente = new Cliente();
           RequestContext context = RequestContext.getCurrentInstance();
           context.execute("PF('dialog').show();");
           return null;
        } else {
           this.mensagem = "Erro ao cadastrar o cliente.";          
           return null;
        }
    }
    
    public void onRowEdit(RowEditEvent event) {        
        clienteRN.salvar((Cliente) event.getObject());
    }
    
    public void excluir() {
        clienteRN.excluir(cliente);
    }
    
    public List<Cliente> listar() {
        return clienteRN.listar();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }  

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }  
}
