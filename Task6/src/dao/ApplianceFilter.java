package dao;

import bean.criteria.Criteria;

public interface ApplianceFilter {
   <E> boolean filter(String data, Criteria<E> criteria);
}
