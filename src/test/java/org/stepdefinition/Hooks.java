package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order = 1)
	public void bef3() {
		
		System.out.println("OPENING BEFORE 3 METHOD:");
		
		launch();
		siteGet("https://www.imdb.com/?ref_=nv_home");

	}
	
	@Before(order = 2)
	public void bef2() {
		
		System.out.println("OPENING BEFORE 2 METHOD:");
		
		toMax();

	}
	
	
	@Before(order = 3)
	public void bef1() {
		
		System.out.println("OPENING BEFORE 1 METHOD:");
		
		toWait();
	}
	
	
	@After
	public void aft3() {
		
		
		System.out.println("CLASS HAS BEEN ENDED!");
		
		
	}
	

}
