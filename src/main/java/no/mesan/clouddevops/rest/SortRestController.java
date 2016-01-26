package no.mesan.clouddevops.rest;

import no.mesan.clouddevops.factories.ArrayFactory;
import no.mesan.clouddevops.service.ArraySorter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/api/sort")
public class SortRestController {

    @RequestMapping(value = "/{arraySize}", method = GET)
    public int[] sort(@PathVariable final int arraySize) {
        int[] array = ArrayFactory.create(arraySize, arraySize);

        ArraySorter.sort(array);

        return array;
    }
}