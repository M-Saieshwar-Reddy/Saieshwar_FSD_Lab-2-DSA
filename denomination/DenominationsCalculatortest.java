package com.gl.javafsd.dsa.denomination;

import java.util.List;

public class DenominationsCalculatortest {
	public static void main(String[] args) {
		genericScenario	(new int [] {123,18,12,5},158);
		genericScenario	(new int [] {78,60,25,12,5},128);
	
}	


 static void genericScenario(int []denominations,int paymentAmount) {
	DenominationsCalculator calculator=
			new DenominationsCalculator(denominations,paymentAmount);
	
	
Result result=	calculator.calculate();
boolean exactPaymentAchieved=result.isExactPaymentAchievedOrNot();

	System.out.println("Exact Payment is Avhieved");
	List <DenominationInstancesPair> list=result.getDenominationInstancesList();
for(DenominationInstancesPair pair:list) {
	int denominationValve =pair.getDenominationValve();
	
	int noOfInstances=pair.getNoOfInstances();
	System.out.println("Denomination Valve is"+denominationValve+",Number of Instances"+noOfInstances);
	
}
}else {System.out.println("Exact payment cannot be achieved");
}
}











