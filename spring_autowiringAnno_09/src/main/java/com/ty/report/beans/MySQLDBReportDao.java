package com.ty.report.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.ty.report.ReportDao;

@Repository("mySQLDb")
//@Primary ,we cannot give more then 1 primary annotation
public class MySQLDBReportDao implements ReportDao{
	

	public MySQLDBReportDao() {
		System.out.println("MysSQL : Constructor");
	}

	@Override
	public void getReport() {
		System.out.println("Data getting from MySQLDB");
		
	}

}
