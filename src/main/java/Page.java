//import Pages.PageObject;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
///**
// * The Page class specifying needed web page model.
// * It describes all the elements of web page and methods used for all the tests.
// */
//
//class Page extends{
//
//    //Navigate to base page method. Takes a String with website address as a parameter
//    void navigateToBasePage(String basePage){
//        driver.get(basePage);
//    }
//
//    //Fill the location field method. Takes a String with specific city as a parameter
//    void fillDestinationField(String location){
//        destinationField.sendKeys(location);
//    }
//
//    //Click on 'date picker' element method. Explicit wait until element is visible are used
//    void datePickerClick(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECK_IN_LOCATOR));
//        datePicker.click();
//    }
//
//    //Select date method. As parameters it takes WebDriver and LocalDate instances
//    void selectDate(WebDriver driver, LocalDate date) {
//
//        //Wait for 'calendar' element to be visible, then click on it
//        wait.until(ExpectedConditions.visibilityOfElementLocated(CALENDAR_LOCATOR));
//
//        //Looking at the markup the attribute data-date is formatted as an ISO_LOCAL_DATE
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//
//        //Programmatically generate date locator based on date passed in
//        By dateLocator = By.xpath(String.format("//td[@data-date='%s']", formatter.format(date)));
//
//        //Wait for 'date' element to be visible, then click on it
//        wait.until(ExpectedConditions.visibilityOfElementLocated(dateLocator)).click();
//    }
//
//    //Submit button click method
//    void submitButtonClick(){
//        submitButton.click();
//    }
//}
