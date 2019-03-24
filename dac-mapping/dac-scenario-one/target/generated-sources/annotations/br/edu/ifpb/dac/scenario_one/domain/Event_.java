package br.edu.ifpb.dac.scenario_one.domain;

import br.edu.ifpb.dac.scenario_one.domain.Rating;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-23T21:39:11")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Integer> eventYear;
    public static volatile ListAttribute<Event, Rating> ratings;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, String> place;

}