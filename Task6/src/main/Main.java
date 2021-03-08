package main;

import static bean.criteria.SearchCriteria.*;

import bean.Appliance;
import bean.criteria.Criteria;
import service.ApplianceService;
import service.ServiceFactory;

public class Main {
    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>();
        criteriaOven.add(Oven.CAPACITY, 32);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria<Oven>();
        criteriaOven.add(Oven.HEIGHT, 45);
        criteriaOven.add(Oven.DEPTH, 60);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
        criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

        appliance = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliance);
    }
}
