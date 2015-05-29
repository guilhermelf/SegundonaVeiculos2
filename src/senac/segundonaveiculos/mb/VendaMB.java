/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.mb;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.entidades.Venda;
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.rn.ClienteRN;
import senac.segundonaveiculos.rn.VeiculoRN;
import senac.segundonaveiculos.rn.VendaRN;

/**
 *
 * @author 631310076
 */
@ManagedBean
@ViewScoped
public class VendaMB {

    private Integer idCliente;
    private Integer idVeiculo;
    private Venda venda;
    private VendaRN vendaRN;
    private String mensagem;

    public VendaMB() {
        this.venda = new Venda();
        this.vendaRN = new VendaRN();
    }

    public void salvar() {
        venda.setCliente(new ClienteRN().consultar(idCliente));
        venda.setVeiculo(new VeiculoRN().consultar(idVeiculo));

        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        venda.setVendedor((Vendedor) sessao.getAttribute("usuario"));
        venda.setPrecoFinal(venda.getVeiculo().getPreco());

        if (vendaRN.salvar(venda)) {
            this.mensagem = "Venda efetuada com sucesso!";
            this.venda = new Venda();

            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('dialog').show();");
        } else {
            this.mensagem = "Erro ao cadastrar o veiculo.";
        }
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void onRowEdit(RowEditEvent event) {
        vendaRN.salvar((Venda) event.getObject());
    }

    public void excluir() {
        vendaRN.excluir(venda);
    }

    public List<Venda> listar() {
        return vendaRN.listar();
    }

}
