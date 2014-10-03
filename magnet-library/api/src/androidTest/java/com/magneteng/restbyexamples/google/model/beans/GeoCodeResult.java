/**
 * File generated by Magnet rest2mobile 1.0 - Sep 23, 2014 1:53:45 PM
 * @see {@link http://developer.magnet.com}
 */

package com.magneteng.restbyexamples.google.model.beans;

import java.util.List;

/**
 * Generated from json example
{
  "results" : [ {
    "address_components" : [ {
      "long_name" : "1600",
      "short_name" : "1600",
      "types" : [ "street_number" ]
    }, {
      "long_name" : "AmphitheatreParkway",
      "short_name" : "AmphitheatrePkwy",
      "types" : [ "route" ]
    }, {
      "long_name" : "MountainView",
      "short_name" : "MountainView",
      "types" : [ "locality", "political" ]
    }, {
      "long_name" : "SantaClaraCounty",
      "short_name" : "SantaClaraCounty",
      "types" : [ "administrative_area_level_2", "political" ]
    }, {
      "long_name" : "California",
        ...

 */

public class GeoCodeResult {
  
  private List<Result> results;
  
  private String status;

  public List<Result> getResults() {
    return results;
  }
  public String getStatus() {
    return status;
  }

  /**
  * Builder for GeoCodeResult
  **/
  public static class GeoCodeResultBuilder {
    private GeoCodeResult toBuild = new GeoCodeResult();

    public GeoCodeResultBuilder() {
    }

    public GeoCodeResult build() {
      return toBuild;
    }

    public GeoCodeResultBuilder results(List<Result> value) {
      toBuild.results = value;
      return this;
    }
    public GeoCodeResultBuilder status(String value) {
      toBuild.status = value;
      return this;
    }
  }
}
