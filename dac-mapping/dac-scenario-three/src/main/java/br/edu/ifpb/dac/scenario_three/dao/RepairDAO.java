package br.edu.ifpb.dac.scenario_three.dao;

import br.edu.ifpb.dac.scenario_three.domain.Repair;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepairDAO {

    EntityManager em;
    EntityManagerFactory emf;

    public RepairDAO() {
        emf = Persistence.createEntityManagerFactory("databases");
        em = emf.createEntityManager();
    }

    public void saveRepair(Repair repair) {
        em.getTransaction().begin();
        em.persist(repair);
        em.getTransaction().commit();
    }

    public void deleteRepair(Repair repair) {
        em.getTransaction().begin();
//        em.remove(
//                em.find(
//                        Repair.class,
//                        repair.getId()
//                )
//        );
        em.remove(
                findRepair(repair.getId())
        );
        em.getTransaction().commit();
    }

    public Repair findRepair(int id) {
        em.getTransaction().begin();
        Repair repair = em.find(
                Repair.class,
                id
        );
        em.getTransaction().commit();
        return repair;
    }

}
