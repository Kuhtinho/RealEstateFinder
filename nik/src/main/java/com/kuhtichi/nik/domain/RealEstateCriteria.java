package com.kuhtichi.nik.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateCriteria {

    public static final double DEFAULT_MAX_PRICE = 100000.0;
    public static final String DEFAULT_LOCATION = "WARSZAWA";
    public static final String DEFAULT_TYPE_OF_REAL_ESTATE = "DZIAŁKI";
    public static final double DEFAULT_MIN_AREA = 200.0;
    public static final double DEFAULT_MAX_AREA = 1000.0;

    private double maxPrice = DEFAULT_MAX_PRICE;
    private String location = DEFAULT_LOCATION;
    private String typeOfRealEstate = DEFAULT_TYPE_OF_REAL_ESTATE;
    private double minArea = DEFAULT_MIN_AREA;
    private double maxArea = DEFAULT_MAX_AREA;

}
