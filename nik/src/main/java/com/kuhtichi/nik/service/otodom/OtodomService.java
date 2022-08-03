package com.kuhtichi.nik.service.otodom;

import com.kuhtichi.nik.client.otodom.OtodomClient;
import com.kuhtichi.nik.domain.RealEstate;
import com.kuhtichi.nik.domain.RealEstateCriteria;
import com.kuhtichi.nik.service.AbstractCheapRealEstatesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OtodomService extends AbstractCheapRealEstatesService {

    @Autowired
    private OtodomClient otodomClient;

    @Override
    public List<RealEstate> getRawCheapRealEstates(RealEstateCriteria criteria) {
        return criteria;
    }
}
