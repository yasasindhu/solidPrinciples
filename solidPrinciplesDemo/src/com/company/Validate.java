package com.company;

public class Validate {
    public boolean productValidator(Product product){
        return(product.getName().length()>0 && product.getPrice()>0);

    }
}
