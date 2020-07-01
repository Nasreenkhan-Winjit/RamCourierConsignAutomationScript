package pages;

import com.codoid.products.exception.FilloException;
import org.testng.annotations.DataProvider;
import utilities.filereading.files.csv.CSVRead;
import utilities.filereading.files.excel.FilloExcelRead;
import utilities.filereading.files.properties.ReadProperties;

public class DataProviderList {

    private ReadProperties readProperties = new ReadProperties();
    private String filePath;

    public DataProviderList() {
        filePath = readProperties.getPropertyValue("DATA_FILES_DEFAULT_DIRECTORY");
    }

    @DataProvider(name = "ValidLogin")
    public Object[][] validLoginCredentials() throws FilloException {
        FilloExcelRead reader = new FilloExcelRead(filePath + "\\excel\\Login\\LoginDetails.xlsx");
        return reader.getDataFromSheet("Valid_Login");
    }

    @DataProvider(name = "consignment")
    public Object[][] consignment() throws FilloException {
        FilloExcelRead reader = new FilloExcelRead(filePath + "\\excel\\Login\\ConsignmentDetails.xlsx");
        return reader.getDataFromSheet(" ConsignmentID");
    }

//    @DataProvider(name = "CSVFile")
//    public Object[][] CSV() throws SQLException {
//        CSVRead csvRead = new CSVRead();
//        return csvRead.getDataFromCSVFile(filePath + "\\csv\\", "LoginCredentialsOpt");
//    }
}
