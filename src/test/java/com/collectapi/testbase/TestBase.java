package com.collectapi.testbase;


import com.collectapi.constants.Path;
import com.collectapi.utils.PropertyReader;
import com.collectapi.utils.TestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase extends TestUtils {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader =propertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.CORONA;

}
}
