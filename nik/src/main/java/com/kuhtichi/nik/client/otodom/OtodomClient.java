package com.kuhtichi.nik.client.otodom;

import com.kuhtichi.nik.domain.RealEstate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class OtodomClient {

    private static String API_URL = "https://www.otodom.pl";

    private final RestTemplate restTemplate;

    public OtodomClient(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<RealEstate> getRealEstates(double maxPrice, String location, String typeOfRealEstate, double minArea, double maxArea) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(API_URL);
        uriBuilder.queryParam("Mieszkania", typeOfRealEstate);
        uriBuilder.queryParam("Wybierz z listy lub wpisz miejscowość", location);
        uriBuilder.queryParam("Cena maksymalna", maxPrice);
        uriBuilder.queryParam("Powierzchnia od", minArea);
        uriBuilder.queryParam("Powierzchnia do", maxArea);

        OtodomRealEstateSearchResponse response = restTemplate.getForObject(uriBuilder.build().encode().toUri(), OtodomRealEstateSearchResponse.class);

        return response.getAdList();
    }
}
