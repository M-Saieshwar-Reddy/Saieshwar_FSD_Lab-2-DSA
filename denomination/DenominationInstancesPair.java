package com.gl.javafsd.dsa.denomination;

public class DenominationInstancesPair {
private int denominationValve;
private int noOfInstances;

public DenominationInstancesPair (
		int denominationValve,int noOfInstances) {
	this.denominationValve = denominationValve;
	this.noOfInstances = getNoOfInstances();
	
	
	
}


public int getDenominationValve() {
	return denominationValve;
}
public void setDenominationValve(int denominationValve) {
	this.denominationValve = denominationValve;
}
public int getNoOfInstances() {
	return noOfInstances;
}
public void setNoOfInstances(int noOfInstances) {
	this.noOfInstances = noOfInstances;
}

}
