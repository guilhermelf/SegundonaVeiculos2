package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Venda;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-25T20:01:35")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T10:05:25")
>>>>>>> d66391db86d988def994737d13b789f93cede9c7
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile SingularAttribute<Vendedor, Integer> id;
    public static volatile SingularAttribute<Vendedor, Float> salario;
    public static volatile SingularAttribute<Vendedor, String> email;
    public static volatile SingularAttribute<Vendedor, String> escolaridade;
    public static volatile SingularAttribute<Vendedor, String> contaCorrente;
    public static volatile SingularAttribute<Vendedor, String> telefone;
    public static volatile SingularAttribute<Vendedor, String> nome;
    public static volatile SingularAttribute<Vendedor, String> senha;
    public static volatile CollectionAttribute<Vendedor, Venda> vendaCollection;
    public static volatile SingularAttribute<Vendedor, String> endereco;

}