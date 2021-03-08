package dao;

import bean.Appliance;
import bean.criteria.Criteria;

public interface ApplianceBuilder {
    Appliance newAppliance(Criteria<String> criteria, String info);

}
