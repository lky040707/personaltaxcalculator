package com.example.personaltaxcalculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TaxCalculationService {
    @WebMethod
    double calculateTax(double income);
}
