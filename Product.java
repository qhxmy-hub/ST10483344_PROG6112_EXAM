/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    //Declaring the Arrays
    private String[] productNames;
    private int [][] sales;

    //Constructors
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }
    //Calculate the total products solds
    @Override
    public int GetTotalProductSold() {
       int total = 0;
       
       for(int i = 0; i < sales.length; i++){
           
           for (int j = 0; j < sales[i].length; j++) {
               
               total += sales[i][j];
           }
       }
       return total;
    }

    //Calculate average products sold
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        
        int numberOfSales = sales.length * sales[0].length;
        
        return (double) total / numberOfSales;
    }

    //Finding the most popular product
    @Override
    public String GetMostPopularProduct() {
        
        int highestSales = 0;
        String popularProduct = "";
        
        for (int i = 0; i < sales.length; i++){
            int productTotal = 0;
            
            for (int j = 0; j < sales[j].length;j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > highestSales) {
                
                highestSales = productTotal;
                
                popularProduct = productNames[i];
            }
        }
          return popularProduct;
    }
}
