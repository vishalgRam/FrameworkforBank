package com.arya.shopping;

import com.arya.shopping.application.GSShopFactory;
import com.arya.shopping.framework.ShopFactory;
import com.arya.shopping.framework.ShopAcc;

public class App {
   public static void main(String[] args) {
	   ShopFactory factory = new GSShopFactory();
	   ShopAcc normalAccount = factory.getNewNormalAcc(151, "Sachin", 2500, 105);
	   
	   normalAccount.bookProduct(20);
	   normalAccount.items(2);
	   
	   System.out.println(normalAccount);
	    
	   ShopAcc PrimeAccount = factory.getNewPrimeAcc(152, "Adi", 2750, true);
	   
	   System.out.println(PrimeAccount);
	   
   }
}