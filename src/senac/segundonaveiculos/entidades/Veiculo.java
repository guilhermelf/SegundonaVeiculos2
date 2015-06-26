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
@Table(name = "veiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculo.findByAno", query = "SELECT v FROM Veiculo v WHERE v.ano = :ano"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculo.findByMarca", query = "SELECT v FROM Veiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Veiculo.findByMotor", query = "SELECT v FROM Veiculo v WHERE v.motor = :motor"),
    @NamedQuery(name = "Veiculo.findByNome", query = "SELECT v FROM Veiculo v WHERE v.nome = :nome"),
    @NamedQuery(name = "Veiculo.findByPortas", query = "SELECT v FROM Veiculo v WHERE v.portas = :portas"),
    @NamedQuery(name = "Veiculo.findByPreco", query = "SELECT v FROM Veiculo v WHERE v.preco = :preco"),
    @NamedQuery(name = "Veiculo.findByValvulas", query = "SELECT v FROM Veiculo v WHERE v.valvulas = :valvulas")})
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "ano")
    private String ano;
    @Size(max = 255)
    @Column(name = "cor")
    private String cor;
    @Size(max = 255)
    @Column(name = "marca")
    private String marca;
    @Size(max = 255)
    @Column(name = "motor")
    private String motor;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Column(name = "portas")
    private Integer portas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Float preco;
    @Column(name = "valvulas")
    private Integer valvulas;
    @OneToMany(mappedBy = "Veiculo")
    private Collection<Venda> vendaCollection;

    public Veiculo() {
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getValvulas() {
        return valvulas;
    }

    public void setValvulas(Integer valvulas) {
        this.valvulas = valvulas;
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "senac.segundonaveiculos.entidades.Veiculo[ id=" + id + " ]";
    }
    
}
