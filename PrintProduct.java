/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    //Print total product sales
    public void PrintTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }
    
    //Print average product sales
    public void PrintAverageProductSales(double average) {
        System.out.println("AVERAGE PRODUCT SALES: " + String.format("%.0f", average));
    }
    
    //Print most popular product
    public void PrintMostPopularProduct(String product) {
        System.out.println("MOST POPULAR PRODUCT: " + product);
    }
    
}
