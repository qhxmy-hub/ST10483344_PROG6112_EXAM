/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Single Dimensional Array
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        
        //Two dimensional Array
        int[][] sales = new int [3][3];
        
        //Get sales informationm from the user 
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the number of sales for month"
                + (j + 1) + "for " + productNames[i]
                + " mattress: ");
            } 
        }
        
       //Product object
       Product product = new Product(productNames, sales);
       
       //PrintProduct object
       PrintProduct printer = new PrintProduct();
       
       //Display report
       System.out.print("\nPRODUCT SALES REPORT - 2026");
       System.out.print("************************************");
       printer.PrintTotalProductSales(product.GetTotalProductSold());
       printer.PrintAverageProductSales(product.GetAverageProductSold());
       printer.PrintMostPopularProduct(product.GetMostPopularProduct());
       
       input.close();
    }
}
