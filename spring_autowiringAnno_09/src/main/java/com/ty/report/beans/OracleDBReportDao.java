package com.ty.report.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.ty.report.ReportDao;

@Repository("oracleDB")
@Primary
public class OracleDBReportDao implements ReportDao {
	

	public OracleDBReportDao() {
		System.out.println("Oracle : Constructor");
	}

	@Override
	public void getReport() {
		System.out.println("Data getting from OracleDB");
		
	}

}
