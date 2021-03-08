package dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import bean.Appliance;
import bean.criteria.Criteria;
import dao.ApplianceDAO;
import dao.ApplianceFilter;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String path = "resources/appliances.db";
		String line;


		List<Appliance> result = new ArrayList<>();

		ApplianceFilter appFilter = new ApplianceFilterImpl();

		try {

			File file = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {


				if (appFilter.filter(line, criteria)) {

					result.add(new Appliance(line));

				}

			}

		} catch (FileNotFoundException e) {

			System.out.println(e.getLocalizedMessage());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.isEmpty() ? null : result.get(0);
	}

}
