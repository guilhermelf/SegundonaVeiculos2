package senac.segundonaveiculos.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Clientes;
import senac.segundonaveiculos.entidades.Veiculos;
import senac.segundonaveiculos.entidades.Vendedores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-15T20:46:36")
@StaticMetamodel(Vendas.class)
public class Vendas_ { 

    public static volatile SingularAttribute<Vendas, Date> data;
    public static volatile SingularAttribute<Vendas, Clientes> idCliente;
    public static volatile SingularAttribute<Vendas, Float> precoFinal;
    public static volatile SingularAttribute<Vendas, Vendedores> idVendedor;
    public static volatile SingularAttribute<Vendas, Veiculos> idVeiculo;
    public static volatile SingularAttribute<Vendas, Integer> id;

}