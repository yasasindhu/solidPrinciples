package com.company;

public abstract  class ProductDelivery {

    private String trackingDetails;
    public String getTrackingDetails() {
        return trackingDetails;
    }



    public void setTrackingDetails(String trackingDetails) {
        this.trackingDetails = trackingDetails;
    }

    public String track(){
        setTrackingDetails("delivering product ");
        return getTrackingDetails();
    }
}
