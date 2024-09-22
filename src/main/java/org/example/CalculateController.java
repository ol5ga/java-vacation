package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@RestController
@RequiredArgsConstructor
@Validated
public class CalculateController {

    private final CalculateService service;

    @GetMapping("/calculate")
    @ResponseStatus(code = HttpStatus.OK)
    public Double getPayment (@RequestParam double salary,@Valid @RequestParam @Min(1) @Max(30) int days){
        return service.getPayment(salary, days);
    }
}
