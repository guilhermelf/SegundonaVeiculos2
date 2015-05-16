package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Vendas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-15T20:46:36")
@StaticMetamodel(Vendedores.class)
public class Vendedores_ { 

    public static volatile SingularAttribute<Vendedores, String> telefone;
    public static volatile SingularAttribute<Vendedores, String> endereco;
    public static volatile SingularAttribute<Vendedores, Float> salario;
    public static volatile SingularAttribute<Vendedores, String> contaCorrente;
    public static volatile SingularAttribute<Vendedores, String> nome;
    public static volatile SingularAttribute<Vendedores, Integer> id;
    public static volatile SingularAttribute<Vendedores, String> escolaridade;
    public static volatile SingularAttribute<Vendedores, String> email;
    public static volatile CollectionAttribute<Vendedores, Vendas> vendasCollection;

}