package com.lgcns.exam.biz;

import com.lgcns.exam.Phone;
import com.lgcns.exam.SalesPerson;

public interface ISalesBiz {
	public void initializeVoid();
	public void printAllSalesPerson();
	public void printProductionList();
	public void printTotalProduction();
	public void addPhoneProduct(SalesPerson salesPerson, Phone phone);
	public SalesPerson searchSalesPersonByEmployeeNo(String employeeNo);
}
