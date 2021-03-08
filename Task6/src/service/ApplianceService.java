package service;

import bean.Appliance;
import bean.criteria.Criteria;


public interface ApplianceService {	
	
	<E> Appliance find(Criteria<E> criteria);
	
}
