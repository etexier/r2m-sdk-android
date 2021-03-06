/**
 * File generated by Magnet rest2mobile 1.0 - Sep 23, 2014 1:53:45 PM
 * @see {@link http://developer.magnet.com}
 */

package com.magneteng.restbyexamples.google.model.beans;


/**
 * Generated from json example
{
  "lat" : 37.42364428029151,
  "lng" : -122.0827181197085
}

 */

public class Northeast {
  
  private Double lat;
  
  private Double lng;

  public Double getLat() {
    return lat;
  }
  public Double getLng() {
    return lng;
  }

  /**
  * Builder for Northeast
  **/
  public static class NortheastBuilder {
    private Northeast toBuild = new Northeast();

    public NortheastBuilder() {
    }

    public Northeast build() {
      return toBuild;
    }

    public NortheastBuilder lat(Double value) {
      toBuild.lat = value;
      return this;
    }
    public NortheastBuilder lng(Double value) {
      toBuild.lng = value;
      return this;
    }
  }
}
