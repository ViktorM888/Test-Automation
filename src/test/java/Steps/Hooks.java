package Steps;

import Utils.DriverFactory;
import Utils.Log;
import Utils.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.IOException;

public class Hooks {

    private DriverFactory driverFactory = new DriverFactory();
    String scName = "";


    @Before
    public void beforeScenario(Scenario scenario) {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase(scenario.getName());
        scName = scenario.getName();
        driverFactory.setUp();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {

        Log.info("AFTER scenario is started");
        Log.info("Test scenario is in status " + scenario.getStatus());
        Log.info("=============");
        if (scenario.isFailed() || scenario.getStatus().equalsIgnoreCase("undefined") || scenario.getStatus().equalsIgnoreCase("skipped")) {
            Screenshot.captureScreenshot();
        }
        driverFactory.tearDown();
    }
}

