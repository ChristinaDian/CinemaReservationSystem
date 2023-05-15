package uni.pu.fmi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateScheduleSteps {
    private CreateScheduleModel scheduleModel;
    @Given("Отваряме екрана за добавяне на нова прожекция")
    public void openSchedulePage() {
this.scheduleModel = new CreateScheduleModel();
    }
    @When("Избираме кино от списък: {string}")
    public void chooseCinema(String cinema) {
        scheduleModel.addCinema(cinema);
    }
    @When("Избираме филм от списък: {string}")
    public void chooseMovie(String movie) {
scheduleModel.addMovie(movie);
    }
    @When("Избираме старт на прожекцията: {string}")
    public void chooseStart(String startTime) {
scheduleModel.addStartTime(startTime);
    }
    @When("Избираме зала: {string}")
    public void chooseHall(String hall) {
        scheduleModel.addHall(hall);

    }
    @When("Натискаме бутона за създаване на нова прожекция")
    public void clickCreateButton() {
        scheduleModel.clickButton();
    }
    @Then("Виждаме съобщение на екрана: {string}")
    public void checkExpectedMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, scheduleModel.getMessage());
    }

}
