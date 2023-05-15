package uni.pu.fmi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReservationSteps {
    private ReservationModel reservationModel;

    @Given("Отваряме екрана за резервация на място в системата")
    public void openReservationPage() {
        this.reservationModel = new ReservationModel();
    }

    @When("Въвеждаме име: {string}")
    public void addUsername(String username) {
        reservationModel.addUsername(username);
    }

    @When("Избираме кино: {string}")
    public void chooseCinema(String cinema) {
        reservationModel.addCinema(cinema);
    }

    @When("Избираме филм: {string}")
    public void chooseMovie(String movie) {
        reservationModel.addMovie(movie);
    }

    @When("Избираме начало на прожекцията: {string}")
    public void chooseStartTime(String startTime) {
        reservationModel.addStartTime(startTime);
    }

    @When("Сравняваме времето на регистрацията {string}")
    public void timeNow(String timeOfReservation) {
        reservationModel.addTimeOfReservation(timeOfReservation);
    }

    @When("Избираме ред: {int}")
    public void chooseRow(int row) {
        reservationModel.addRow(row);
    }

    @When("Избираме място: {int}")
    public void choosePlace(int num) {
        reservationModel.addNum(num);
    }

    @When("Натискаме бутона за резервация")
    public void clickReserveButton() {
        reservationModel.clickButton();
    }

    @Then("Виждаме съобщение: {string}")
    public void checkMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, reservationModel.getMessage());
    }


}
