package pages;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.commonmodule.Loader;
import pages.commonmodule.Login;

public class PageConsinment extends BasePage {

    //    Actions actions;
    private Loader loader ;

    public PageConsinment(WebDriver webDriver) {
        super(webDriver);
        loader = new Loader(driver);
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='ConsignmentID']")
    private WebElement elementtxtConsignmentID;
    // Toster for invalid consigment id

//    @FindBy(how=How.XPATH, using = "//div[@class='toast toast-error animated zoomInUp']")
//    private WebElement elementToasterAlreadycosigned;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='BilledTo']")
    private WebElement elementtxtBilledTo;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='listitem'][1]")
    private WebElement elementMenuBilledTo;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='Commodity']")
    private WebElement elementtxtCommodity;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//label[text()='Commodity']/parent::*/div[1]/div")
    private WebElement elementCommodityText;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@role='listitem' and @class='primary--text']")
    private WebElement elementMenuCommodity;


    @CacheLookup
    // validate commodity scenerio
    @FindBy(how = How.XPATH, using = "//div[@class='v-select__selections']/div[contains(text(),'Cellular Equipment')]")
    private WebElement elementcommudity;

    @CacheLookup
    // Select Document and verify
    @FindBy(how =How.XPATH, using = "//div[@class='v-list__tile__content']/div[contains(text(),'Documentation')]")
    private WebElement elementMenuCommudityDocument;

    @CacheLookup
    // Popup Continue
    @FindBy(how =How.XPATH,using = "//button[@id='CommodityContinue']")
    private WebElement elementPopCommudityContinue;

    @CacheLookup
    // Select Jwellery and Verify 2nd
    @FindBy(how =How.XPATH,using = "//div[@class='v-select__selections']/div[contains(text(),'Documentation')]")
    private WebElement elementCommudityJwelleryStep;

    @CacheLookup
    @FindBy(how =How.XPATH,using = "//div[@class='v-list__tile__content']/div[contains(text(),'Jewellery')]")
    private WebElement elementMenuJwellery;

    @CacheLookup
    @FindBy(how=How.XPATH,using = "//button[@class='v-btn v-btn--outline v-btn--depressed theme--light primary--text']/div[contains(text(),'Continue')]")
    private WebElement elementpopUpContinueJwellery;

    // Stepper  second Validation

    @CacheLookup
    @FindBy(how =How.XPATH, using = "//div[@id='stepSender']")
    private WebElement elementMenuSecondStepper;

    @CacheLookup
    @FindBy(how=How.XPATH,using = "//div[contains(text(),'Reset')]")
    private WebElement elementButtonReset;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//input[@id='SenderName']")
    private WebElement elemnentFieldSenderName;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'CELL C - COMPANY OWNED STORES, CELL C, 084 174 4000')]")
    private WebElement elementMenuSenderName;

    @CacheLookup
    @FindBy(how = How.XPATH, using= "//button[@id='SenderContactNew']//div[@class='v-btn__content'][contains(text(),'New Contact')]")
    private WebElement elementbuttonNewContact;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Cancel')]")
    private WebElement elementbuttonCancel;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[@id='SenderContactEdit']//div[contains(text(),'Edit Contact')]")
    private WebElement elementbuttonEditContact;

    @CacheLookup
    @FindBy(how = How.XPATH, using= "//div[contains(text(),'Save')]")
    private WebElement elementbuttonSAVE;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//div[contains(text(),'Cancel')]")
    private WebElement elementbuttonCancelEditContact;

    // Step third receiver

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@id='stepReceiver']")
    private WebElement elementThirdStepReciever;

    @CacheLookup
    @FindBy(how = How.XPATH, using= "//div[contains(text(),'New Receiver')]")
    private WebElement elementbuttonNewReceiver;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//button[@id='NewCancelCustomer']/div[contains(text(),'Cancel')]")
    private WebElement elementbuttonCancelNewReceiverDetails;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='ReceiverName']")
    private WebElement elementRecieverName;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__content'][1]")
    private WebElement elementMenuRecieverName;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[@id='ReceiverNewContact']/div[contains(text(),'New Contact')]")
    private WebElement elementbuttonNewContactReceiverContact;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//button[@id='save_receivercontactaddedit']/div[contains(text(),' Save')]")
    private WebElement elementbuttonSaveNewConntact;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[@id='cancel_receivercontactaddedit']/div[contains(text(),' Cancel')]")
    private WebElement elementbuttonCancelNewContact;

    @CacheLookup
    //Step fourth
    @FindBy(how = How.XPATH, using = "//div[@id='stepValue']")
    private WebElement elementStepValue;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='v-text-field__slot']//input[@id='ValueForCarriage']")
    private WebElement elementtxtValueForCarriage;

    @CacheLookup
    // Clicked oN Check Box.
    @FindBy(how= How.XPATH, using = "//div[@class='v-input--selection-controls__ripple']")
    private WebElement elementFullLiabilityCheckBox;

    @CacheLookup
    //Step Five
    @FindBy(how= How.XPATH, using = "//div[@id='stepRequirements']")
    private WebElement elementRequirements;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//input[@id='ShipperReference']")
    private WebElement elementtxtShipperReference;

    @CacheLookup
    @FindBy(how=How.XPATH, using = "//div[@class='flex xs12 md12']//div[@class='v-select__selections']")
    private WebElement elementProofOfDelivery;

    @CacheLookup
    @FindBy(how=How.XPATH, using = "//div[contains(text(),'KYC Code 1-Sign Waybill')]")
    private WebElement elemnetMenuProofOfDelivery;

    @CacheLookup
    @FindBy(how=How.XPATH, using = "//div[@name='instruction-combobox']//div[@class='v-select__selections']")
    private WebElement elementStandardInstructionType;

    @CacheLookup
    @FindBy(how=How.XPATH, using = "//div[contains(text(),'DontDeliverOn')]")
    private WebElement elementMenuStandardInstructionType;

    @CacheLookup
    @FindBy(how=How.XPATH, using = "//div[@class='flex md5']//div[@class='v-select__slot']")
    private WebElement elementNonDeliverableDates;

    @CacheLookup
    @FindBy(how= How.XPATH, using = "//div[@role='listitem']//div[contains(text(),'Wednesday')]")
    private WebElement elementMenuNonDeliverableDays;

    // special instructions
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[@id='AddAnotherInstruction']")
    private WebElement elementbuttonAddAnotherInstruction;

    @FindBy(how = How.XPATH,using = "//div[@class='v-select__slot']//input[@id='StandardInstructionType5']")
    private WebElement elementsecondStandardInstructionType5;

    //Step sixth

    @FindBy(how=How.XPATH, using = "//div[@id='stepServices']")
    private WebElement elementStepServices;

    //@FindBy(how=How.XPATH,using = "//div[contains(text(),'Armed Escort / Vehicle')]")
    @FindBy(how=How.XPATH,using = "//div[contains(text(),'Saturday')]")
    private WebElement elementButtonSelectSurcharge;

    //Step Seven
    @FindBy(how=How.XPATH, using = "//div[@id='stepParcels']")
    private WebElement elementStepParcel;

    @FindBy(how=How.XPATH, using = "//input[@id='NumberOfParcels']")
    private WebElement elementNumberOfParcel;

    // Step Seven fill the details
    @CacheLookup
    @FindBy(how=How.XPATH,using = "//input[@id='ParcelSecurityPack001']")
    private WebElement elementSecurityPack;

    @FindBy(how=How.XPATH,using ="//input[@id='ParcelWeight001']")
    private WebElement elementweight;

    @FindBy(how=How.XPATH, using = "//div[@class='v-input v-text-field v-select v-input--is-focused theme--light primary--text']//div[@class='v-select__selections']")
    private WebElement elementPackageType;

    @FindBy(how=How.XPATH, using = "//div[@role='listitem']//div[contains(text(),'Box1')]")
    private WebElement elementMenuPackageType;

    //Finalise Consignment step
    @FindBy(how=How.XPATH,using = "//button[@id='FinaliseConsignment']")
    private WebElement elementbuttonFinaliseConsignment;

    @FindBy(how=How.XPATH,using = "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][contains(text(),'Close')]")
    private WebElement elementPopUpClose;

    // Select Parcel 2 and validate delete function

    //@FindBy(how=How.XPATH, using="//div[@class='parcelContent']//div[2]//div[11]")
    @FindBy(how=How.XPATH, using= "//i[@class='v-icon material-icons theme--light' and contains(text(),'delete')][1]")
    private WebElement elementdeleteicon;

    //    public void enterTxtConsignmentID(String txt,Keys keys) {

    @Step("Enter txt consignment : \"{0}\"")
    public void enterTxtConsignmentID(String txt, Keys keys) {
        loader.waitForLoaderToDispose();
//        webDriverWait.until(ExpectedConditions.visibilityOf(elementtxtConsignmentID));
        elementtxtConsignmentID.sendKeys(txt,keys);
//        actions.sendKeys();
    }


    public void enterTxtBilledTo(String txt) {
        loader.waitForLoaderToDispose();
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementtxtBilledTo));
        elementtxtBilledTo.click();
        elementtxtBilledTo.sendKeys(txt);
        elementtxtBilledTo.click();
    }

    public boolean isMenuBilledToDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOf(elementtxtBilledTo));
        return elementMenuBilledTo.isDisplayed();
    }

    public void selectMenuBilledTo() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementMenuBilledTo));
        System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
        elementMenuBilledTo.click();
    }
//
//    @Step("Enter txt billed me too : \"{0}\"")
//    public void enterTxtBilledTo(String txt) throws InterruptedException {
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementtxtBilledTo));
//        elementtxtBilledTo.sendKeys(txt);
//        elementtxtBilledTo.click();
//    }

//    @Step("select from menu billed to")
//    public void selectMenuBilledTo() {
//        elementMenuBilledTo.click();
//    }


    public void enterTxtCommodity(String txt) {
        elementtxtCommodity.click();
    }

    public boolean iselementMenuCommodity() {
        return elementMenuCommodity.isDisplayed();
    }

    public void iselementMenuCommodity1() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementMenuCommodity));
    }

    @Step("Click On Second Stepper")
    public void clickOnSecondStepper() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementMenuSecondStepper));
        elementMenuSecondStepper.click();

    }

    @Step("Validate Reset Button")
    public void validateResetButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementButtonReset));
        elementButtonReset.click();
    }

    @Step("Click On Sender Name")
    public void clickOnSenderName(String txt) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elemnentFieldSenderName));
        elemnentFieldSenderName.sendKeys(txt);
        webDriverWait.until(ExpectedConditions.visibilityOf(elemnentFieldSenderName));
        elemnentFieldSenderName.click();

    }

    @Step("Select from Menu Sender Name ")
    public void SelectMenuSenderName(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementMenuSenderName));

        elementMenuSenderName.click();
    }
    @Step("Click On button New Contact")
    public void clickOnButtonNewContact(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonNewContact));
        elementbuttonNewContact.click();
    }


    public void clickOnCancelButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementbuttonCancel));
        elementbuttonCancel.click();


    }

    public void clickOnbuttonEditContact(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonEditContact));
        elementbuttonEditContact.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(elementbuttonSAVE));
        elementbuttonSAVE.click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonCancelEditContact));
        elementbuttonCancelEditContact.click();
    }

    public void clickOnStepReciever() {
        webDriverWait.until(ExpectedConditions.visibilityOf(elementThirdStepReciever));
        elementThirdStepReciever.click();
        scrollToElement(elementThirdStepReciever);
    }

    public void clickOnbuttonNewReceiver(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementbuttonNewReceiver));
        elementbuttonNewReceiver.click();

    }

    public void clickonCancelbuttonNewCustomer(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementbuttonCancelNewReceiverDetails));
        elementbuttonCancelNewReceiverDetails.click();

    }

    public void entertxtRecieverName(String txt) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementRecieverName));
        elementRecieverName.sendKeys(txt);
        elementRecieverName.click();
    }

    public void selectMenuRecieverName() {
        elementMenuRecieverName.click();
    }

    public void clickOnbuttonNewContactReceiverContact(){

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonNewContactReceiverContact));
        elementbuttonNewContactReceiverContact.click();

    }

    public void clickonSavebuttonNewContact(){

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonSaveNewConntact));
        elementbuttonSaveNewConntact.click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonCancelNewContact));
        elementbuttonCancelNewContact.click();

    }



    public void clickOnStepValue() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementStepValue));
        elementStepValue.click();

    }

    public void entertxtStepValue(String txt) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementtxtValueForCarriage));
        elementtxtValueForCarriage.sendKeys(txt);
    }
    public void clickOnCheckBox(){

        elementFullLiabilityCheckBox.click();

    }
    public void clickOnStepRequirement(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementRequirements));
        elementRequirements.click();
    }
    public void entertxtShipperReference(String txt){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementtxtShipperReference));
        elementtxtShipperReference.sendKeys(txt,Keys.ENTER);
        elementtxtShipperReference.clear();
        elementtxtShipperReference.sendKeys(txt);
    }

    public void clickOnDropdownProofOfDelivery(Keys tab) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementProofOfDelivery));
        elementProofOfDelivery.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(elemnetMenuProofOfDelivery));
        elemnetMenuProofOfDelivery.click();
    }
    public void ClickonDropDownStandardInstructionType() {

        webDriverWait.until(ExpectedConditions.visibilityOf(elementStandardInstructionType));
        elementStandardInstructionType.click();
        elementMenuStandardInstructionType.click();
    }

    public void clickonDropdownNonDeliverablesDays(Keys tab){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementNonDeliverableDates));
        elementNonDeliverableDates.click();
        elementMenuNonDeliverableDays.click();

    }

    public void clickOnAddAnotherInstruction(){
        //WebDriverWait webDriverWait = new WebDriverWait(driver,30);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonAddAnotherInstruction));
        elementbuttonAddAnotherInstruction.click();

        // WebDriverWait webDriverWait = new WebDriverWait(driver,30);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementsecondStandardInstructionType5));
        elementsecondStandardInstructionType5.click();
    }

    public void clickonstepServices(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementStepServices));
        elementStepServices.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(elementButtonSelectSurcharge));
        elementButtonSelectSurcharge.click();
    }

    public void clickonStepParcel(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementStepParcel));
        elementStepParcel.click();

    }
    public void entertxtNumberOfParcel(String txt ){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementNumberOfParcel));
        elementNumberOfParcel.sendKeys(txt, Keys.ENTER);
        //actions.sendKeys(Keys.TAB);
    }


    public void clickOnSecurityPack(String txt){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementSecurityPack));
        elementSecurityPack.sendKeys(txt,Keys.TAB);

    }

    public void entertxtweight(String txt){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementweight));
        elementweight.sendKeys(txt);

    }

    public void clickOnPackageType(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementPackageType));
        elementPackageType.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(elementMenuPackageType));
        elementMenuPackageType.click();

    }

    public  void clickOnFinaliseConsignment(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementbuttonFinaliseConsignment));
        elementbuttonFinaliseConsignment.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(elementPopUpClose));
        elementPopUpClose.click();
        driver.navigate().refresh();

    }

    public void clickOnDeleteIcon(){
        //
        //
        //webDriverWait.until(ExpectedConditions.elementToBeClickable(elementdeleteicon));
        actions.moveToElement(elementdeleteicon).build().perform();

        elementdeleteicon.click();
    }


    public void isCommoditySelected(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementCommodityText));
        elementCommodityText.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(elementMenuCommodity));
        elementMenuCommodity.click();
    }

    public void clickoncommudity(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementcommudity));
        elementcommudity.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(elementMenuCommudityDocument));
        elementMenuCommudityDocument.click();
    }

    public void clickOnCommudityContinuePopup(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementPopCommudityContinue));
        elementPopCommudityContinue.click();
    }

    public void clickOnCommudityJwellery(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementCommudityJwelleryStep));
        elementCommudityJwelleryStep.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(elementMenuJwellery));
        elementMenuJwellery.click();


//        webDriverWait.until(ExpectedConditions.visibilityOf(elementPopCommudityContinue));
//        elementPopCommudityContinue.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(elementpopUpContinueJwellery));
        elementpopUpContinueJwellery.click();


    }

}




