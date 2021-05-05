package com.company;

public class CMRMall extends Discount{
    private float percentage;

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    @Override
    public float discountPercentage(){
         setPercentage(5.0F);
        return getPercentage();
    }
}
