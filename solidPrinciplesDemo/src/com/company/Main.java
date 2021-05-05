package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  product name:");
        String name=sc.next();
        System.out.println("Enter  product price:");
        float price=sc.nextFloat();
        System.out.println("Enter  product color:");
        String color=sc.next();
        System.out.println("Enter  product size:");
        String size=sc.next();

        Product product1=new Product(name,price,color,size);
        Validate validate=new Validate();
        if(validate.productValidator( product1)) {
            Display var = new Display();
            var.showProduct(product1);
        }
        else{
            System.out.println("Product details are incorrect ");
        }

        System.out.println("Enter 1 To get products from KLMMall");
        System.out.println("2 To get products from CMRMall");
        int mall_choice=sc.nextInt();
        if(mall_choice==1){
            Discount discount=new KLMMall();
            float discountAmount= discount.discountPercentage();
            System.out.println("discount sale is going on flat "+discountAmount+"% off");
            product1.setPrice(product1.getPrice()-(discountAmount* product1.getPrice())/100);
            System.out.println("Product price after discount is"+product1.getPrice());
        }
        else{
            Discount discount=new CMRMall();
            float discountAmount= discount.discountPercentage();
            System.out.println("discount sale is going on flat "+discountAmount+"% off");
            product1.setPrice(product1.getPrice()-(discountAmount* product1.getPrice())/100);
            System.out.println("Product price after discount is"+product1.getPrice());
        }
        System.out.println("Enter 1 To get your delivery via Hyderabad ");
        System.out.println("2 To get you delivery via bangalore");
        int locationVia=sc.nextInt();

        if(locationVia==1) {
            ProductDelivery productDelivery = new Hyderabad();
            System.out.println(productDelivery.track());
        }
        else{
            ProductDelivery productDelivery=new Bangalore();
            System.out.println(productDelivery.track());
        }
       System.out.println("Enter 1 To view category watch");
            System.out.println("Enter 2 To view category jewellery");
            int categoryType = sc.nextInt();
            if (categoryType == 1) {
                OnClickCategory click = new Watch();
                click.selectCategory();

            } else {
                OnClickCategory category = new Jewellery();
                System.out.println(category.selectCategory());
            }
        System.out.println("Enter 1 To view sort based on  reviews");
        System.out.println("Enter 2 To view sort based on price");
        int sortType = sc.nextInt();
        if (sortType == 1) {
            OnClickSort category = new ReviewSort();
            System.out.println(category.selectSort());
        } else {
            OnClickSort category = new PriceSort();
            System.out.println(category.selectSort());
        }

        System.out.println("Enter 1 To get your product price in $ ");
        System.out.println("Enter 2 To get you product price in ₹");
        int priceType=sc.nextInt();
        if(priceType==1) {
            MoneyConversion moneyConversion = new Dollar();
            System.out.print("Price of product is:" + product1.getPrice());
            PriceDisplay priceDisplay=new PriceDisplay();
            System.out.println(priceDisplay.conversion(moneyConversion));
        }
        else{
            MoneyConversion moneyConversion = new Rupee();
            System.out.print("Price of product is:" + product1.getPrice());
            PriceDisplay priceDisplay=new PriceDisplay();
            System.out.println(priceDisplay.conversion(moneyConversion));
        }
    }
}
