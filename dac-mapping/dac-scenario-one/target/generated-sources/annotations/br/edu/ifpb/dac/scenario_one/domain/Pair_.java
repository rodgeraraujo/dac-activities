package br.edu.ifpb.dac.scenario_one.domain;

import br.edu.ifpb.dac.scenario_one.domain.Actor;
import br.edu.ifpb.dac.scenario_one.domain.Film;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-25T18:53:34")
@StaticMetamodel(Pair.class)
 class Pair_ { 

    public static volatile SingularAttribute<Pair, Actor> actor2;
    public static volatile SingularAttribute<Pair, Actor> actor1;
    public static volatile SingularAttribute<Pair, Integer> id_film;
    public static volatile SingularAttribute<Pair, Integer> id_actor1;
    public static volatile SingularAttribute<Pair, Integer> id_actor2;
    public static volatile SingularAttribute<Pair, Film> film;

}