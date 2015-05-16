package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Vendas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-15T20:46:36")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Integer> telefone;
    public static volatile SingularAttribute<Clientes, Integer> endereco;
    public static volatile SingularAttribute<Clientes, String> rg;
    public static volatile SingularAttribute<Clientes, String> cpf;
    public static volatile SingularAttribute<Clientes, Integer> nome;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> cnh;
    public static volatile SingularAttribute<Clientes, Integer> email;
    public static volatile CollectionAttribute<Clientes, Vendas> vendasCollection;

}