/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
    @NamedQuery(name = "Veiculos.findAll", query = "SELECT v FROM Veiculos v"),
    @NamedQuery(name = "Veiculos.findById", query = "SELECT v FROM Veiculos v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculos.findByNome", query = "SELECT v FROM Veiculos v WHERE v.nome = :nome"),
    @NamedQuery(name = "Veiculos.findByMarca", query = "SELECT v FROM Veiculos v WHERE v.marca = :marca"),
    @NamedQuery(name = "Veiculos.findByAno", query = "SELECT v FROM Veiculos v WHERE v.ano = :ano"),
    @NamedQuery(name = "Veiculos.findByPortas", query = "SELECT v FROM Veiculos v WHERE v.portas = :portas"),
    @NamedQuery(name = "Veiculos.findByCor", query = "SELECT v FROM Veiculos v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculos.findByPreco", query = "SELECT v FROM Veiculos v WHERE v.preco = :preco"),
    @NamedQuery(name = "Veiculos.findByValvulas", query = "SELECT v FROM Veiculos v WHERE v.valvulas = :valvulas"),
    @NamedQuery(name = "Veiculos.findByMotor", query = "SELECT v FROM Veiculos v WHERE v.motor = :motor")})
public class Veiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @NotNull
    @Column(name = "portas")
    private int portas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preco")
    private float preco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valvulas")
    private int valvulas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "motor")
    private String motor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVeiculo")
    private Collection<Vendas> vendasCollection;

    public Veiculos() {
    }

    public Veiculos(Integer id) {
        this.id = id;
    }

    public Veiculos(Integer id, String nome, String marca, String ano, int portas, String cor, float preco, int valvulas, String motor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.portas = portas;
        this.cor = cor;
        this.preco = preco;
        this.valvulas = valvulas;
        this.motor = motor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @XmlTransient
    public Collection<Vendas> getVendasCollection() {
        return vendasCollection;
    }

    public void setVendasCollection(Collection<Vendas> vendasCollection) {
        this.vendasCollection = vendasCollection;
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
        if (!(object instanceof Veiculos)) {
            return false;
        }
        Veiculos other = (Veiculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conf.Veiculos[ id=" + id + " ]";
    }
    
}
