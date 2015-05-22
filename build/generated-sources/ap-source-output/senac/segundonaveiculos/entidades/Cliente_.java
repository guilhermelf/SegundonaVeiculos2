package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-22T20:14:40")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> cnh;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, Integer> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> rg;
    public static volatile CollectionAttribute<Cliente, Venda> vendaCollection;
    public static volatile SingularAttribute<Cliente, String> endereco;

}