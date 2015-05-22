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
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.util.ICrud;

/**
 *
 * @author 631310070
 */
public class ClienteDAO implements ICrud<Cliente>{
    
    private EntityManager em;

    public ClienteDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegundonaVeiculos2PU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean salvar(Cliente bean) {
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
    public void excluir(Cliente bean) {
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
    }

    @Override
    public List<Cliente> listar() {
        return em.createQuery("select c from Cliente c order by c.nome").getResultList();
    }

    @Override
    public Cliente consultar(Integer id) {
        Cliente cliente = em.find(Cliente.class, id);
        
        return cliente;
    }
    
    
}
