package senac.segundonaveiculos.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import senac.segundonaveiculos.entidades.Vendas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-15T20:46:36")
@StaticMetamodel(Veiculos.class)
public class Veiculos_ { 

    public static volatile SingularAttribute<Veiculos, Float> preco;
    public static volatile SingularAttribute<Veiculos, String> marca;
    public static volatile SingularAttribute<Veiculos, String> motor;
    public static volatile SingularAttribute<Veiculos, String> ano;
    public static volatile SingularAttribute<Veiculos, Integer> portas;
    public static volatile SingularAttribute<Veiculos, Integer> valvulas;
    public static volatile SingularAttribute<Veiculos, String> cor;
    public static volatile SingularAttribute<Veiculos, String> nome;
    public static volatile SingularAttribute<Veiculos, Integer> id;
    public static volatile CollectionAttribute<Veiculos, Vendas> vendasCollection;

}