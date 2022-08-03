package com.kuhtichi.nik.service;

import com.kuhtichi.nik.domain.RealEstate;
import com.kuhtichi.nik.domain.RealEstateCriteria;

import java.util.List;

public abstract class AbstractCheapRealEstatesService implements CheapRealEstatesService {

    public abstract List<RealEstate> getRawCheapRealEstates(RealEstateCriteria criteria);

    @Override
    public List<RealEstate> getCheapRealEstates(RealEstateCriteria criteria) {
        return getRawCheapRealEstates(criteria).stream()
                .filter(r -> r.getArea() >= criteria.getMinArea())
                .filter(r -> r.getArea() <= criteria.getMaxArea())
                .filter(r -> r.getPrice() <= criteria.getMaxPrice())
                .filter(r -> r.getTypeOfRealEstate().toUpperCase().equals(criteria.getTypeOfRealEstate()))
                .filter(r -> r.getLocation().toUpperCase().equals(criteria.getLocation()))
                .toList();
    }
}
