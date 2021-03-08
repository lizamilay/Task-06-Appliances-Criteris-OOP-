package service.impl;


import bean.Appliance;
import bean.criteria.Criteria;
import dao.DAOFactory;
import dao.ApplianceDAO;
import service.ApplianceService;
import service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
