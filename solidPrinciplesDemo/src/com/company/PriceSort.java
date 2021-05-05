package com.company;

public class PriceSort implements OnClickSort{
    private String sortCriteria;

    public String getSortCriteria() {
        return sortCriteria;
    }

    public void setSortCriteria(String sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    @Override
    public String selectSort(){
       setSortCriteria( "products are sorted based on price from range low to high");
        return  getSortCriteria();
    }
}
