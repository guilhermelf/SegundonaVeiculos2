/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.util.ICrud;

/**
 *
 * @author 631310070
 */
public class VeiculoDAO implements ICrud<Veiculo>{
    
    private EntityManager em;

    public VeiculoDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegundonaVeiculos2PU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean salvar(Veiculo bean) {
        try {
            em.getTransaction().begin();
            em.merge(bean);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void excluir(Veiculo bean) {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Veiculo> listar() {
        return em.createQuery("select v from Veiculo v order by v.nome").getResultList();
    }

    @Override
    public Veiculo consultar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
