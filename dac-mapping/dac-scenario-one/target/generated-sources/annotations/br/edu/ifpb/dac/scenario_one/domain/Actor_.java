package br.edu.ifpb.dac.scenario_one.domain;

import br.edu.ifpb.dac.scenario_one.domain.Film;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T11:36:47")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile ListAttribute<Actor, Film> films;
    public static volatile SingularAttribute<Actor, Character> gender;
    public static volatile SingularAttribute<Actor, String> nationality;
    public static volatile SingularAttribute<Actor, String> name;
    public static volatile SingularAttribute<Actor, Integer> id;

}