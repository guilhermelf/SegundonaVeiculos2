/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senac.segundonaveiculos.util;

import java.util.List;

/**
 *
 * @author 631310070
 */
public interface ICrud<T> {
    public Boolean salvar(T bean);
    public void excluir(T bean);
    public List<T> listar();
    public T consultar(Integer id);  
}
