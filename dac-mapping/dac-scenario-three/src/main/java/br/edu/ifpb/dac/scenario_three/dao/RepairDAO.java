package br.edu.ifpb.dac.scenario_three.dao;

import br.edu.ifpb.dac.scenario_three.domain.Repair;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepairDAO {

    EntityManager em;
    EntityManagerFactory emf;

    public RepairDAO() {
        emf = Persistence.createEntityManagerFactory("MAPPING_PU");
        em = emf.createEntityManager();
    }

    public void saveRepair(Repair repair) {
        em.getTransaction().begin();
        em.persist(repair);
        em.getTransaction().commit();
    }

    public void deleteRepair(Repair repair) {
        em.getTransaction().begin();
        em.remove(
                em.find(
                        Repair.class, 
                        repair.getId()
                )
        );
        em.getTransaction().commit();
    }

}
