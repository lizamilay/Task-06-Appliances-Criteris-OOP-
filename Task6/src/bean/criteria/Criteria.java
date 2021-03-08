package bean.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

    private E groupSearchName;
    private Map<E, Object> criteria = new HashMap<E, Object>();

    public E getGroupSearchName() {
        return groupSearchName;
    }

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<E, Object> getCriteria() {
        return criteria;
    }

    public void setCriteria(Map<E, Object> criteria) {
        this.criteria = criteria;
    }



}
