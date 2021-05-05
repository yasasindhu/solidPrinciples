package com.company;

 class Watch implements OnClickCategory{
     private String category;

     @Override
    public String selectCategory(){
         setCategory("currently you are having a look at watches");
         return getCategory();
    }
     public void setCategory(String category) {
         this.category = category;
     }

     public String getCategory() {
         return category;
     }

 }
