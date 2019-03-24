package br.edu.ifpb.dac.scenario_one.domain;

import br.edu.ifpb.dac.scenario_one.domain.Event;
import br.edu.ifpb.dac.scenario_one.domain.Film;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-23T21:39:11")
@StaticMetamodel(Rating.class)
 class Rating_ { 

    public static volatile SingularAttribute<Rating, Integer> id_film;
    public static volatile SingularAttribute<Rating, Integer> rating;
    public static volatile SingularAttribute<Rating, Integer> id_event;
    public static volatile SingularAttribute<Rating, Film> film;
    public static volatile SingularAttribute<Rating, Event> event;

}