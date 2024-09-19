package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateReport(String jasonpath) {
		
		File f=new File("C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\All Reports\\jvm");
		
		Configuration c=new Configuration(f,"IMDB APPLICATION");
		
		c.addClassifications("TESTER NAME :", "Sheik Althaf Hussain");
		c.addClassifications("WINDOWS :", "11");
		c.addClassifications("IDE", "ECLIPSE");
		
		
		List l=new ArrayList<>();
		l.add(jasonpath);
		
		ReportBuilder r=new ReportBuilder(l,c);
		r.generateReports();

	}

}
