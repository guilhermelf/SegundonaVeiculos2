package senac.segundonaveiculos.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Cliente;
import senac.segundonaveiculos.entidades.Veiculo;
import senac.segundonaveiculos.entidades.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-25T20:01:35")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Date> data;
    public static volatile SingularAttribute<Venda, Cliente> idCliente;
    public static volatile SingularAttribute<Venda, Float> precoFinal;
    public static volatile SingularAttribute<Venda, Vendedor> idVendedor;
    public static volatile SingularAttribute<Venda, Veiculo> idVeiculo;
    public static volatile SingularAttribute<Venda, Integer> id;

}