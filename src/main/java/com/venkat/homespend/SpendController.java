package com.venkat.homespend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("spend")
public class SpendController {

    @Autowired
    private LoanAmountService loanAmountService;

    @GetMapping(value = "{loanType}/monthly/emi", headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Loan getMonthlyEmi(@PathVariable String loanType) {
        return loanAmountService.getLoanAmount(loanType);
    }

}
