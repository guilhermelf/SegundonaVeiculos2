/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.util.ICrud;

/**
 *
 * @author 631310070
 */
public class VendedorDAO implements ICrud<Vendedor> {

    private EntityManager em;

    public VendedorDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegundonaVeiculos2PU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean salvar(Vendedor bean) {
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
    public void excluir(Vendedor bean) {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Vendedor> listar() {
        return em.createQuery("select v from Vendedor v order by v.nome").getResultList();
    }

    @Override
    public Vendedor consultar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vendedor logar(Vendedor vendedor) {
        try {
            Query query = em.createQuery("select v from Vendedor v where v.email = :email and v.senha = :senha");
            query.setParameter("email", vendedor.getEmail());
            query.setParameter("senha", vendedor.getSenha());

            return (Vendedor) query.getSingleResult();
        
        } catch (NoResultException e) {
            return null;
        }
    }

}
