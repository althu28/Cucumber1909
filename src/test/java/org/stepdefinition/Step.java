package org.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.base.BaseClass;
import org.pojo.Pojo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends BaseClass {
	
	Pojo p;;

	@When("user have to enter the film name and click the enter button for first drop down name suggestion")
	public void user_have_to_enter_the_film_name_and_click_the_enter_button_for_first_drop_down_name_suggestion() throws IOException, AWTException {
	    
		p=new Pojo();
		
		acSendkeys(p.searchbar, excel("C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\Excel\\Fb.xlsx",
				"details", 2, 0));
		
		robDown();
		robEnter();
		
	}

	@When("user have to scroll down and scroll up")
	public void user_have_to_scroll_down_and_scroll_up() {
	    
		
		
	}

	@When("user have to take screenshot for the film")
	public void user_have_to_take_screenshot_for_the_film() {
	    
		
	}

	@When("user have to get the film name, synopsis and director name")
	public void user_have_to_get_the_film_name_synopsis_and_director_name() {
	    
		
		
	}

	@Then("user have to close the Imdb tab")
	public void user_have_to_close_the_Imdb_tab() {
	    
		System.out.println("HUSSAIN ADDED THE CODE!");
		
	}
	
}
