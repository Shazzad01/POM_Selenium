package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public static Object dataset(){
        Object[][] objects = {
                {"locked_out_user","secret_sau"},
                {"locked_out_user","secret_sae"},
                {"locked_out_","secr_sauce"},


        };
        return objects;
    }
    @DataProvider(name = "emptyUserName")
    public static Object dataset2(){
        Object[][] objects = {
                {"","secret_sauce"},

        };
        return objects;
    }
    @DataProvider(name = "emptyPassword")
    public static Object dataset3(){
        Object[][] objects = {
                {"standard_user",""},

        };
        return objects;
    }
}
