package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUser {

    // Step 2 - map the data
    @Test(dataProvider = "getData")
    public void createUser(String browser, String userType, int phone, String email) {
        System.out.println(browser + "----" + userType + "--" + phone + "--" + email);
    }

    // Step 1 - provide the data
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][4];

        data[0][0] = "Chrome";
        data[0][1] = "Admin";
        data[0][2] = 328484;
        data[0][3] = "a@gmail.com";

        data[1][0] = "Mozilla";
        data[1][1] = "User";
        data[1][2] = 456789;
        data[1][3] = "b@gmail.com";

        data[2][0] = "IE";
        data[2][1] = "Admin";
        data[2][2] = 987654;
        data[2][3] = "c@gmail.com";

        return data;
    }
}
