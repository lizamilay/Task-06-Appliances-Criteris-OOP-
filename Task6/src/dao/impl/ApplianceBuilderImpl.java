package dao.impl;

import bean.*;
import bean.criteria.Criteria;
import dao.ApplianceBuilder;

public class ApplianceBuilderImpl implements ApplianceBuilder {
    @Override
    public Appliance newAppliance(Criteria<String> criteria, String data) {
        String category = criteria.getGroupSearchName();
        switch(category){
            case("Oven"):{
                return new Oven(data);
            }
            case("Laptop"):{
                return new Laptop(data);
            }
            case("Refrigerator"):{
                return new Refrigerator(data);
            }
            case("Speakers"):{
                return new Speakers(data);
            }
            case("TabletPC"):{
                return new TabletPC(data);
            }
            case("VacuumCleaner"):{
                return new VacuumCleaner(data);
            }
        }
        return new Appliance();
    }
}
