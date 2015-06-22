package no.mesan.clouddevops.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/health")
public class HealthRestController {

    @Value("${pom.artifactId}")
    private String artifactId;

    @Value("${pom.version}")
    private String version;

    @Value("${pom.buildTime}")
    private String buildTime;

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, String> getHealth() {
        Map<String, String> values = new HashMap<String, String>();
        values.put("artifactId", artifactId);
        values.put("version", version);
        values.put("buildTime", buildTime);
        return values;
    }

}
