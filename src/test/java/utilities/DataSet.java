package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "invalidUserCredentials")
    public static Object invalidCredentials(){
        Object[][] data = {
                {"fameloh253@chysir.com", "123456", "Invalid account or password.", ""},
                {"kameloh253@chys.com", "23456", "Invalid account or password.", ""},
                {"0168919022", "1234567", "", "Please enter a valid phone number."},
                {"0138918022", "123456", "", "Please enter a valid phone number."},
        };

        return data;
    }
}
