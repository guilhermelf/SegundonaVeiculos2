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
import senac.segundonaveiculos.entidades.Vendedor;
import senac.segundonaveiculos.util.ICrud;

/**
 *
 * @author 631310070
 */
public class VendedorDAO implements ICrud<Vendedor> {

    private EntityManager em;

    public VendedorDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ImobMVCJPAPU");
        em = emf.createEntityManager();
    }

    @Override
    public void salvar(Vendedor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Vendedor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendedor> listar(Vendedor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendedor consultar(Vendedor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
