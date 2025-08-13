package dataproviders;

import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVDataProvider {

    @DataProvider(name = "loginDataFromCSV", parallel = true)
    public static Iterator<Object[]> getLoginData() throws IOException {
        return readCSV("src/test/resources/loginData.csv");
    }

    public static Iterator<Object[]> readCSV(String filePath) throws IOException {
        List<Object[]> testData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] data = line.trim().split(",");
                testData.add(new Object[]{data[0], data[1]});
            }
        }
        return testData.iterator();
    }
}
