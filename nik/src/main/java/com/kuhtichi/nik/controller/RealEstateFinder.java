package com.kuhtichi.nik.controller;

import com.kuhtichi.nik.domain.RealEstate;
import com.kuhtichi.nik.domain.RealEstateCriteria;
import com.kuhtichi.nik.service.otodom.OtodomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RealEstateFinder {

    private OtodomService otodomService;

    @GetMapping(path = "/offers")
    public List<RealEstate> getRealEstates(RealEstateCriteria criteria) {
        return otodomService.getRawCheapRealEstates(criteria);
    }
}
