package com.lucasambrosi.app.api.v1;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InterestRateApi {

    @ApiOperation("Create a new customer with their interest rate.")
    @PostMapping
    public ResponseEntity<?> insertInterestRate() {
        return ResponseEntity.ok().build();
    }
}
