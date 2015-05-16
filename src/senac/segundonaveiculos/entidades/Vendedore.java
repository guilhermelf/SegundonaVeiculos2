/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 631310076
 */
@Entity
@Table(name = "vendedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendedore.findAll", query = "SELECT v FROM Vendedore v"),
    @NamedQuery(name = "Vendedore.findById", query = "SELECT v FROM Vendedore v WHERE v.id = :id"),
    @NamedQuery(name = "Vendedore.findByContaCorrente", query = "SELECT v FROM Vendedore v WHERE v.contaCorrente = :contaCorrente"),
    @NamedQuery(name = "Vendedore.findByEmail", query = "SELECT v FROM Vendedore v WHERE v.email = :email"),
    @NamedQuery(name = "Vendedore.findByEndereco", query = "SELECT v FROM Vendedore v WHERE v.endereco = :endereco"),
    @NamedQuery(name = "Vendedore.findByEscolaridade", query = "SELECT v FROM Vendedore v WHERE v.escolaridade = :escolaridade"),
    @NamedQuery(name = "Vendedore.findByNome", query = "SELECT v FROM Vendedore v WHERE v.nome = :nome"),
    @NamedQuery(name = "Vendedore.findBySalario", query = "SELECT v FROM Vendedore v WHERE v.salario = :salario"),
    @NamedQuery(name = "Vendedore.findByTelefone", query = "SELECT v FROM Vendedore v WHERE v.telefone = :telefone")})
public class Vendedore implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "conta_corrente")
    private String contaCorrente;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 255)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salario")
    private Float salario;
    @Size(max = 255)
    @Column(name = "telefone")
    private String telefone;
    @OneToMany(mappedBy = "idVendedor")
    private Collection<Venda> vendaCollection;

    public Vendedore() {
    }

    public Vendedore(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedore)) {
            return false;
        }
        Vendedore other = (Vendedore) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "senac.segundonaveiculos.entidades.Vendedore[ id=" + id + " ]";
    }
    
}
