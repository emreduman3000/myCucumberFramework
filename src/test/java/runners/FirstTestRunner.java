package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        //2 tag ıceren scenarıo or feature ı run etmek ıcın
        //tags = {"@googlesearch and @firstRunner"},

        //2 tagden bırını barındıran scenarıo ıcın
        //tags = {"@googlesearch or @firstRunner"},

        //1. tagı ıceren ve 2. tagı ıcermeyen scenarıolar ıcın
        //tags = {"@1 and not @nokia"},


        //ilk 2 sınden bırını ıceren ve @2 ıcermeyen scenarıolar run olur
        //tags = {"(@iphone or @nokia) and not @2"},

        tags = "@firstRunner",
        dryRun = false
)
public class FirstTestRunner {
}