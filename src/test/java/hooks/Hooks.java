package hooks;

import actions.Actions;
import driver.WebDriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hooks {

    private final Actions actions = new Actions();

    @Before
    public void setUp() {
        actions.landing();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot
            final byte[] screenshot = ((TakesScreenshot) WebDriverSetup.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");

            // Save screenshot to file
            try {
                // Nome feature
                String featureName = scenario.getUri().getPath()
                        .replaceAll(".*/", "")     // prende solo il nome file
                        .replace(".feature", "");

                // Nome scenario
                String scenarioName = scenario.getName()
                        .replaceAll("[^a-zA-Z0-9]", "_"); // solo caratteri sicuri per il filesystem

                // Timestamp
                String timestamp = String.valueOf(System.currentTimeMillis());

                // Componi nome file
                String fileName = String.format("target/screenshots/%s_%s_%s.png",
                        featureName, scenarioName, timestamp);

                Files.createDirectories(Paths.get("target/screenshots/"));
                Files.write(Paths.get(fileName), screenshot);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        WebDriverSetup.closeDriver();
    }

}
