package com.company;

public class Bangalore extends ProductDelivery{

    private String trackingDetails;
    @Override
    public String getTrackingDetails() {
        return trackingDetails;
    }
    @Override
    public void setTrackingDetails(String trackingDetails) {
        this.trackingDetails = trackingDetails;
    }

    @Override
    public String track(){
        setTrackingDetails("delivering product via Bangalore");
        return getTrackingDetails();
    }
}
