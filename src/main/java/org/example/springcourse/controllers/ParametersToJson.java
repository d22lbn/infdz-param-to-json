package org.example.springcourse.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ParametersToJson {
    @GetMapping(value = "/param", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getParameters(@RequestParam(value = "a", required = false) Integer a,
                                           @RequestParam(value = "b", required = false) Integer b) {
        int sum = ((a != null) ? a : 0) + ((b != null) ? b : 0);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("sum", sum);
        return ResponseEntity.ok(map);
    }
}
