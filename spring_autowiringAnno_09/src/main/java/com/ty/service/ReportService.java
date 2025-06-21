package com.ty.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ty.report.ReportDao;

@Service
public class ReportService {
	
	@Autowired
	@Qualifier("oracleDB")
	private ReportDao dao;
	
//	By default it IOC uses 0-param constructor to create object
//	if there is more then 1 param constructor it is mandatory to give Autowired annotation, else it is optional
//	public ReportService() {
	
//	}
	
//	@Autowired
//	public ReportService(ReportDao dao) {
//		System.out.println("Report Service : para- constructor");
//		this.dao = dao;
//	}
	
//	@Autowired
//	public void setDao(ReportDao dao) {
//		System.out.println("Setter methed called");
//		this.dao = dao;
//	}


	public void generateReport() {
		dao.getReport();
		System.out.println("Report Generated");
	}

}
