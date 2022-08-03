package com.kuhtichi.nik.client.otodom;

import com.kuhtichi.nik.client.otodom.ad.Ad;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OtodomRealEstateSearchResponse {

    private int total;

    private List<Ad> adList = null;


}
