import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@TEST_POEC4-52"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        // features = {"src/test/resources"}
        glue ={"Steps"}
)
public class RunnerTest {
   /*  @AfterClass
    public static void monAfter() throws NoSuchAlgorithmException, KeyStoreException, IOException, InterruptedException, KeyManagementException {
         ImportResultToxray res = new ImportResultToxray();
         res.RemonteResultats();
         System.out.println("Import all Test");
    }*/
}

