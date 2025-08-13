package tests;

import dataproviders.CSVDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "loginDataFromCSV", dataProviderClass = CSVDataProvider.class)
    public void testLogin(String username, String password) {
        System.out.println("Testing login for Username: " + username + " | Password: " + password);
        boolean isValid = "admin".equals(username) && "adminpass".equals(password);
        if (username.equals("admin") && password.equals("adminpass")) {
            Assert.assertTrue(isValid, "Expected login to succeed for admin.");
            System.out.println("✅ Login Successful");
        } else {
            Assert.assertFalse(isValid, "Expected login to fail for non-admin users.");
            System.out.println("❌ Login Failed");
        }
    }
}
