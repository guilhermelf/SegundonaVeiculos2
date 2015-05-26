package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-22T16:06:00")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Integer> id;
    public static volatile SingularAttribute<Veiculo, Float> preco;
    public static volatile SingularAttribute<Veiculo, String> cor;
    public static volatile SingularAttribute<Veiculo, Integer> valvulas;
    public static volatile SingularAttribute<Veiculo, String> motor;
    public static volatile SingularAttribute<Veiculo, Integer> portas;
    public static volatile SingularAttribute<Veiculo, String> ano;
    public static volatile SingularAttribute<Veiculo, String> marca;
    public static volatile SingularAttribute<Veiculo, String> nome;
    public static volatile CollectionAttribute<Veiculo, Venda> vendaCollection;

}