package org.company;

import btsarmy.org.MyAim;

public class EmpDet
{
	public void empName() {
		System.out.println("karthi");

	}
	public void empRoll() {
		// TODO Auto-generated method stub
		System.out.println("52");

	}

public static void main(String[] args) {
	EmpDet e=new EmpDet();
	e.empRoll();
	e.empName();


	CompanyInfo c=new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();

MyAim a=new MyAim();

a.tripKorea();
a.attenConcert();
a.meetBias();
a.kindNapMission();

}

}
