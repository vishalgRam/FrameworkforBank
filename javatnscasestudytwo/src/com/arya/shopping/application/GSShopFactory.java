package com.arya.shopping.application;

import com.arya.shopping.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		return new GSPrimeAcc(accNo, accNm, charges, isprime);
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
	}


}