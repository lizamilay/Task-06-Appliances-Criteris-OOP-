package dao.impl;

import bean.criteria.Criteria;
import dao.ApplianceFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceFilterImpl  implements ApplianceFilter {

    @Override
    public <E> boolean filter(String data, Criteria<E> criteria) {
        List<Pattern> patterns = new ArrayList<Pattern>();
        Matcher matcher;
        String info;

        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
            info ="[\\s+,]"+entry.getKey() + "=" + entry.getValue()+"[\\s+,]";
            patterns.add(Pattern.compile(info, Pattern.CASE_INSENSITIVE));
        }

        for (Pattern pattern : patterns) {
            matcher = pattern.matcher(data);

            if(!matcher.find()) {
                return false;
            }
        }
        return true;
    }
}
