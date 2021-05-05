package com.company;

public  class KLMMall  extends Discount{

    private float percentage;

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    @Override
    public float discountPercentage(){
        setPercentage(6.0F);
        return getPercentage();
    }

}
