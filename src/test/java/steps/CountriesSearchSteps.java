package steps;

import static org.hamcrest.Matchers.is;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CountriesSearchSteps {
	
	private String appid = "6bf00437067eef59318fa59952204379";
	private String serviceURL = "http://api.openweathermap.org/data/2.5/weather?" + "appid=" + appid + "&q=";
	private Response response;
	
	@Step
	public void searchByCityName(String city) {
		response = SerenityRest.when().get(serviceURL + city);
	}
	
	@Step
	public void requestExecutedSuccessfully() {
		response.then().statusCode(200);
	}
	
	@Step
	public void verifyCityName(String thisCity) {
		response.then().body("name", is(thisCity));
	}
	

}
