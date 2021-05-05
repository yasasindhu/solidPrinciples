package com.company;

public class ReviewSort implements OnClickSort{
    private String sortCriteria;

    public String getSortCriteria() {
        return sortCriteria;
    }

    public void setSortCriteria(String sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    @Override
    public String selectSort(){
        setSortCriteria( "products are sorted based on reviews");
        return  getSortCriteria();
    }
}
