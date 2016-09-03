package meirs.topologymonitor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Meir Shalev on 27/08/16.
 */
@EnableAutoConfiguration
@ComponentScan
@RestController("/")
public class GraphController {

    public static final String GRAPH_QUERY = "MATCH (n1:NetworkNode)<-[r:PUBLISHES_TO]-(n2:NetworkNode) " +
            " RETURN n1.id as publisher, collect(n2.id) as subscribers " +
            " LIMIT {1}";

    //TODO: use the Dao class instead
    @Autowired
    JdbcTemplate template;

    @CrossOrigin
    @RequestMapping("/graph")
    public Map<String, Object> graph(@RequestParam(value = "limit",required = false) Integer limit) {
        Iterator<Map<String, Object>> result = template.queryForList(
                GRAPH_QUERY, limit == null ? 100 : limit).iterator();
        return toD3Format(result);
    }

    private Map<String, Object> toD3Format(Iterator<Map<String, Object>> result) {
        List<Map<String,Object>> nodes = new ArrayList<Map<String,Object>>();
        List<Map<String,Object>> rels= new ArrayList<Map<String,Object>>();
        int i=0;
        while (result.hasNext()) {
            Map<String, Object> row = result.next();
            nodes.add(map("id", row.get("publisher"), "label", "publisher"));
            int target=i;
            i++;
            for (Object name : (Collection) row.get("subscribers")) {
                Map<String, Object> actor = map("id", name, "label", "subscriber");
                int source = nodes.indexOf(actor);
                if (source == -1) {
                    nodes.add(actor);
                    source = i++;
                }
                rels.add(map("source",source,"target",target));
            }
        }
        return map("nodes", nodes, "links", rels);
    }

    private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
        Map<String, Object> result = new HashMap<String,Object>(2);
        result.put(key1,value1);
        result.put(key2,value2);
        return result;
    }

}
