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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ImobMVCJPAPU");
        em = emf.createEntityManager();
    }

    @Override
    public void salvar(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultar(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
