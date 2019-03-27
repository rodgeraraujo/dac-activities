package br.edu.ifpb.dac.scenario_one.domain;

import br.edu.ifpb.dac.scenario_one.domain.Actor;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T11:36:47")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile ListAttribute<Film, Actor> actors;
    public static volatile SingularAttribute<Film, String> director;
    public static volatile SingularAttribute<Film, String> genre;
    public static volatile SingularAttribute<Film, List> rating;
    public static volatile SingularAttribute<Film, Integer> id;
    public static volatile SingularAttribute<Film, String> title;
    public static volatile SingularAttribute<Film, Date> releaseYear;
    public static volatile SingularAttribute<Film, List> pairs;

}