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
import senac.segundonaveiculos.entidades.Venda;
import senac.segundonaveiculos.util.ICrud;

/**
 *
 * @author 631310070
 */
public class VendaDAO implements ICrud<Venda>{
    
    private EntityManager em;

    public VendaDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegundonaVeiculos2PU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean salvar(Venda bean) {
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
    public void excluir(Venda bean) {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Venda> listar() {
        return em.createQuery("select v from Venda v order by v.id DESC").getResultList();
    }

    @Override
    public Venda consultar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
