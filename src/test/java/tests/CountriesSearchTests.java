package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import steps.CountriesSearchSteps;

@RunWith(SerenityRunner.class)
public class CountriesSearchTests {
	
	@Steps
	CountriesSearchSteps countriesSearchSteps;

	@Test
	public void RetrieveWeatherForIrbid() {
		System.out.println("irbid");
		countriesSearchSteps = new CountriesSearchSteps();
		countriesSearchSteps.searchByCityName("Irbid");
		countriesSearchSteps.requestExecutedSuccessfully();
		countriesSearchSteps.verifyCityName("Irbid");
	}

}
