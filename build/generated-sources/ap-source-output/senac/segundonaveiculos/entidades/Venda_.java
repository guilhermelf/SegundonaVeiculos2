package senac.segundonaveiculos.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.entidades.Vendedor;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-25T20:01:35")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T10:05:25")
>>>>>>> d66391db86d988def994737d13b789f93cede9c7
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, Vendedor> vendedor;
    public static volatile SingularAttribute<Venda, Cliente> cliente;
    public static volatile SingularAttribute<Venda, Date> data;
    public static volatile SingularAttribute<Venda, Veiculo> veiculo;
    public static volatile SingularAttribute<Venda, Float> precoFinal;

}