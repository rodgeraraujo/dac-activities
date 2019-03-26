package br.edu.ifpb.dac.scenario_three.loader;

import br.edu.ifpb.dac.scenario_three.dao.RepairDAO;
import br.edu.ifpb.dac.scenario_three.db.IsDbExist;
import br.edu.ifpb.dac.scenario_three.domain.Address;
import br.edu.ifpb.dac.scenario_three.domain.Employee;
import br.edu.ifpb.dac.scenario_three.domain.Repair;
import br.edu.ifpb.dac.scenario_three.domain.Workshop;
import java.util.Date;

/**
 *
 * @author Rodger
 */
public class Loader {

    public static void main(String[] args) {
        // verify if DB exists
//        IsDbExist isDbExist = new IsDbExist(); 
//        isDbExist.createDb("dac_scenario_three");
        
        // intance DAO
        RepairDAO repairDAO = new RepairDAO();

        // new Employee
        Employee noOne = new Employee(
                "22.222.222-1",
                "111.111.111-2",
                "Head of Office",
                2.150f
        );

        // new Address
        Address address = new Address(
                "Street 1",
                "District 2",
                "City 3"
        );

        // instance Workshop with Address and Balance value
        Workshop workshop = new Workshop(
                address,
                6570f
        );

        // add the Employee to Workshop
        workshop.getEmployees().add(noOne);
        
        // instace a new Repair
        Repair newRepair = new Repair(150f, new Date(), noOne, workshop);;

        // call dao method to save new Repair
//        repairDAO.saveRepair(newRepair);

        // call dao method to find a especific repair
        Repair findRepair = repairDAO.findRepair(1);
        System.out.println(findRepair.toString());
        
        // call dao method to delete this Repair
//        repairDAO.deleteRepair(findRepair);
        System.out.println("<< FINISH >>");
        
    }
}
