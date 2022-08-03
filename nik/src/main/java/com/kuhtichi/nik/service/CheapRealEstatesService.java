package com.kuhtichi.nik.service;

import com.kuhtichi.nik.domain.RealEstate;
import com.kuhtichi.nik.domain.RealEstateCriteria;

import java.util.List;

public interface CheapRealEstatesService {

    List<RealEstate> getCheapRealEstates(RealEstateCriteria criteria);
}
