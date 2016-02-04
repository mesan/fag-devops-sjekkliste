package no.mesan.clouddevops.rest;

import no.mesan.clouddevops.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/api/env")
public class EnvRestController {

    @Log
    @RequestMapping(method = GET)
    public Map<String, String> getEnv() {
       return System.getenv();
    }

}
