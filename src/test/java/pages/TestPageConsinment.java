package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.commonmodule.Loader;

import java.util.*;

public class TestPageConsinment extends TestBase {

    PageDashBoard pageDashBoard;
    PageConsinment pageConsignment;
    Loader loader;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify valid user are allowed to access")

    @Test
    public void clickOnConsignment() throws InterruptedException {
        Thread.sleep(6000);
        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
        pageDashBoard.clickOnNavBar();
        pageDashBoard.clickOnConsignViaAccordion();
        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
    }
    @Test(dataProviderClass = DataProviderList.class, dataProvider = "consignment")
//    @Test()
    public void doStarted(Map<String, String> testDataSet) throws InterruptedException {
//    public void doStarted() throws InterruptedException {

//       testDataSet.entrySet().stream().forEach((k)-> System.out.println(k.getKey() + "" + k.getValue()));

//    @Test(priority = 0)
//    public void doStarted() throws InterruptedException {

        pageConsignment = new PageConsinment(eventFiringWebDriver);

        pageConsignment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"),Keys.ENTER);
//        pageConsignment.enterTxtConsignmentID("UAT92092901", Keys.ENTER);

        pageConsignment.enterTxtBilledTo(testDataSet.get("BilledTo"));
//        pageConsignment.enterTxtBilledTo("CELW01");
        pageConsignment.selectMenuBilledTo();


        pageConsignment.isCommoditySelected();
        pageConsignment.clickoncommudity();


        pageConsignment.clickOnCommudityContinuePopup();
        Thread.sleep(5000);
//

        pageConsignment.clickOnCommudityJwellery();
        Thread.sleep(5000);

//


        //<editor-fold desc="Second Stepper">
        pageConsignment.clickOnSecondStepper();
        Thread.sleep(2000);

        pageConsignment.validateResetButton();

        pageConsignment.clickOnSenderName(testDataSet.get("SenderName"));
//        pageConsignment.clickOnSenderName("Cell");

        pageConsignment.SelectMenuSenderName();

        pageConsignment.clickOnButtonNewContact();

        pageConsignment.clickOnCancelButton();

        pageConsignment.clickOnbuttonEditContact();

//        </editor-fold>

        //<editor-fold desc="Third Step">
        pageConsignment.clickOnStepReciever();

        pageConsignment.entertxtRecieverName(testDataSet.get("ReceiverName"));
        pageConsignment.entertxtRecieverName("Surekh");

        pageConsignment.clickOnbuttonNewReceiver();

        pageConsignment.clickonCancelbuttonNewCustomer();

        pageConsignment.entertxtRecieverName(testDataSet.get("ReceiverName2"));
//        pageConsignment.entertxtRecieverName("surekha");

        pageConsignment.selectMenuRecieverName();
        //</editor-fold>
//
        pageConsignment.clickOnbuttonNewContactReceiverContact();
        Thread.sleep(4000);

        pageConsignment.clickonSavebuttonNewContact();
        Thread.sleep(3000);
//
        pageConsignment.clickOnStepValue();
       // Thread.sleep(10000);

        pageConsignment.entertxtStepValue(testDataSet.get("ValueForCarrige"));
        //Thread.sleep(5000);
//
        pageConsignment.clickOnCheckBox();
//        Thread.sleep(10000);
//
        pageConsignment.clickOnStepRequirement();
//        Thread.sleep(4000);
        pageConsignment.entertxtShipperReference(testDataSet.get("InvalidShipperReference"));
//        Thread.sleep(5000);
//
        pageConsignment.entertxtShipperReference(testDataSet.get("ValidShipperReference"));
//        Thread.sleep(10000);
        pageConsignment.clickOnDropdownProofOfDelivery(Keys.TAB);
//
//        Thread.sleep(9000);
        pageConsignment.ClickonDropDownStandardInstructionType();
//        Thread.sleep(5000);
//
        pageConsignment.clickonDropdownNonDeliverablesDays(Keys.TAB);
//        Thread.sleep(11000);
//
//        pageConsignment.clickOnAddAnotherInstruction();
//       // Thread.sleep(8000);
//
        pageConsignment.clickonstepServices();
        Thread.sleep(6000);

        pageConsignment.clickonStepParcel();
//        Thread.sleep(6000);

        pageConsignment.entertxtNumberOfParcel(testDataSet.get("NumberOfParcel"));
        Thread.sleep(8000);
//
////        pageConsignment.clickOnDeleteIcon();
//        Thread.sleep(10000);
//
        pageConsignment.clickOnSecurityPack(testDataSet.get("SecurityPack"));

        pageConsignment.entertxtweight("0.1");

        //pageConsinment.clickOnPackageType();
//        Thread.sleep(8000);
//
        pageConsignment.clickOnFinaliseConsignment();
//        Thread.sleep(8000);

        waitForLoad();
        webDriver.navigate().refresh();

    }


//    @Test(priority = 1)
//    public void commudityValidation() throws InterruptedException {
//
//        pageConsignment.clickoncommudity();
//        Thread.sleep(8000);
//        pageConsignment.clickOnCommudityContinuePopup();
//        Thread.sleep(5000);
//
//    }

//    @Test(priority = 2)
//    public void selectCommudityJwellery() throws InterruptedException {
//
//        pageConsignment.clickOnCommudityJwellery();
//        Thread.sleep(5000);
//    }

//    @Test(priority = 3)
//    public void clickOnSecondStepper() throws InterruptedException {
//
//        pageConsignment.clickOnSecondStepper();
//        Thread.sleep(5000);
//    }

//    @Test(priority = 4)
//    public void clickOnResetButton() throws InterruptedException {
//        pageConsignment.validateResetButton();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 5)
//    public void clickOnSenderName() throws InterruptedException {
//        pageConsignment.clickOnSenderName("CELL");
//        Thread.sleep(5000);
//    }
//    @Test(priority = 6)
//    public void selectMenufromSenderName() throws InterruptedException {
//        pageConsignment.SelectMenuSenderName();
//        Thread.sleep(5000);
//    }
//    @Test(priority= 7)
//    public void validateButtonNewContact() throws InterruptedException {
//        pageConsignment.clickOnButtonNewContact();
//        Thread.sleep(5000);
//        pageConsignment.clickOnCancelButton();
//        Thread.sleep(5000);
//
//    }

//    @Test(priority = 8)
//    public void clickOnbuttonEditContact() throws InterruptedException {
//        pageConsignment.clickOnbuttonEditContact();
//        Thread.sleep(5000);
//    }


//    @Test(priority=9)
//    public void clickOnbuttonNewReceiver() throws InterruptedException {
//        pageConsignment.clickOnStepReciever();
//        Thread.sleep(5000);
//        pageConsignment.entertxtRecieverName("s");
//        Thread.sleep(5000);
//        pageConsignment.clickOnbuttonNewReceiver();
//        Thread.sleep(5000);
//
//    }

//    @Test(priority = 10)
//    public void clickonCancelbuttonNewCustomer() throws InterruptedException {
//        pageConsignment.clickonCancelbuttonNewCustomer();
//        Thread.sleep(5000);
//
//    }


//    @Test(priority = 11)
//    public void thirdStepReciever() throws InterruptedException {
//            //(Map<String, String> testDataSet) throws InterruptedException {
//
//       // pageConsinment.clickOnStepReciever();
//
//     Thread.sleep(20000);
//        //pageConsinment.entertxtRecieverName(testDataSet.get("Receivers Name"));
//        pageConsignment.entertxtRecieverName("Surekha");
//        Thread.sleep(8000);
//        pageConsignment.selectMenuRecieverName();
//
//        Thread.sleep(10000);
//    }

//    @Test(priority = 12)
//    public void clickonbuttonNewContactReceiverContact() throws InterruptedException {
//        pageConsignment.clickOnbuttonNewContactReceiverContact();
//        Thread.sleep(4000);
//        pageConsignment.clickonSavebuttonNewContact();
//        Thread.sleep(3000);


//    }

//    @Test(priority = 13)
//    public void clickOnStepValue() throws InterruptedException {
//      pageConsignment.clickOnStepValue();
//        Thread.sleep(10000);
//        pageConsignment.entertxtStepValue("123");
//       Thread.sleep(5000);
//        pageConsignment.clickOnCheckBox();
//        Thread.sleep(10000);

    //   }

//      @Test(priority = 14)
//    public  void clickOnStepRequirement() throws InterruptedException {
//        pageConsignment.clickOnStepRequirement();
//        Thread.sleep(4000);
//        pageConsignment.entertxtShipperReference("aaaaa");
//        Thread.sleep(5000);
//
//         pageConsignment.entertxtShipperReference("qqqqqqq");
////Thread.sleep(10000);
//         pageConsignment.clickOnDropdownProofOfDelivery(Keys.TAB);
//
//          Thread.sleep(9000);
//          pageConsignment.ClickonDropDownStandardInstructionType();
//          Thread.sleep(5000);
//          pageConsignment.clickonDropdownNonDeliverablesDays(Keys.TAB);
//
//          Thread.sleep(9000);
//        pageConsinment.clickOnAddAnotherInstruction();
//          Thread.sleep(9000);


    //   }

//      @Test(priority = 15)
//      public void clickOnbuttonAddAnotherInstruction() throws InterruptedException {
//
//        pageConsignment.clickOnAddAnotherInstruction();
//          Thread.sleep(8000);
//      }

//        @Test(priority = 16)
//    public void clickOnStepServices() throws InterruptedException {
//        pageConsignment.clickonstepServices();
//
//        Thread.sleep(6000);
//        }


//      @Test(priority = 17)
//    public void clickonstepParcel() throws InterruptedException {
//    //Thread.sleep(6000);
//        pageConsignment.clickonStepParcel();
//    Thread.sleep(6000);
//}
//     @Test(priority = 18)
//    public void entertxtNumberOfParcel() throws InterruptedException {
//        pageConsignment.entertxtNumberOfParcel("2");
//         Thread.sleep(8000);
//
//     }
//    @Test(priority=19)
//    public void clickOnDeleteicon() throws InterruptedException {
//        pageConsignment.clickOnDeleteIcon();
//        Thread.sleep(5000);
//    }
//        @Test(priority = 20)
//    public void entertxtSecuritypack() throws InterruptedException {
//       pageConsignment.clickOnSecurityPack("SP12345678");
//
//       pageConsignment.entertxtweight("0.1");
//
//
//        //pageConsinment.clickOnPackageType();
//            Thread.sleep(8000);
//
//        }

//        @Test(priority = 21 )
//    public void clickONFinaliseButton() throws InterruptedException {
//        pageConsignment.clickOnFinaliseConsignment();
//            Thread.sleep(8000);
//            waitForLoad(eventFiringWebDriver);
//
//            webDriver.navigate().refresh();
//        }

//git change



    //Second scenerio Negative Test Cases.


//    @Test(dataProviderClass = DataProviderList.class, dataProvider = "consignment",priority = 22)
//    public void doStartedagain(Map<String, String> testDataSet) throws InterruptedException {
//
////        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
////        waitForLoad(eventFiringWebDriver);
////        pageDashBoard.clickOnNavBar();
////        pageDashBoard.clickOnConsignViaAccordion();
//
//        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
//
//        pageConsignment = new PageConsignment(eventFiringWebDriver);
//
////        pageConsinment.enterTxtConsignmentID("UAT31230911");
////        Thread.sleep(10000);
//
//        pageConsignment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
//        Thread.sleep(8000);
//
//        pageConsignment.enterTxtBilledTo(testDataSet.get("BilledTo"));
//        pageConsignment.selectMenuBilledTo();
//        Thread.sleep(20000);
//        webDriver.close();
//    }




//
//        @Test(dataProviderClass = DataProviderList.class, dataProvider = "ConsignmentNegData",priority = 10)
//        public void multipleCommudityTest(Map<String, String> testDataSet) throws InterruptedException {
//            ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//            eventFiringWebDriver.switchTo().window(tabsCount.get(1));
//
//            pageConsinment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
//            Thread.sleep(8000);
//
//            pageConsinment.enterTxtBilledTo(testDataSet.get("BilledTo"));
//            pageConsinment.selectMenuBilledTo();
//            Thread.sleep(20000);
//
//
//
//        }

}

