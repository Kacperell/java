/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author kacperel
 */
public class Product {
        private int id;
        private String name;
        private String category;
        private double price;
    
    public Product(int id, String name,String category,double price) {
		        this.id = id;
		        this.name = name;
		        this.category = category;
		        this.price = price;
		
		    }
    
        public String getName() {
		        return name;
		    }
    
}
