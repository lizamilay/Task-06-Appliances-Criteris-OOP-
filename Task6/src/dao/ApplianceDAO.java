package dao;

import bean.Appliance;
import bean.criteria.Criteria;

public interface ApplianceDAO {

	 <E> Appliance find(Criteria<E> criteria) ;
}
