package mandatoryHomeWork.selenium;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_7_JIRA {

	public static void main(String[] args) {
		ChromeOptions chrOpt = new ChromeOptions();
		chrOpt.addArguments("--remote-allow-origins=*");
		chrOpt.addArguments("--start-maximized");
		chrOpt.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(chrOpt);
		driver.get("https://jotheeshkumar.atlassian.net/jira/software/projects/AUTO/boards/2");
		// driver.executeCdpCommand();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("jotheesh1992@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Jona73@tutu");
		driver.findElement(By.id("login-submit")).click();

		// Step 2: Navigate to the Project backlog section
		WebElement projectBacklogLink = driver.findElement(By.id("project-backlog-link")); 
		projectBacklogLink.click();

		// Step 3: Create a new sprint with 2 Stories and start the sprint
		WebElement newSprintButton = driver.findElement(By.id("new-sprint-button")); 
		newSprintButton.click();
		WebElement storiesInput = driver.findElement(By.id("stories-input")); 
		storiesInput.sendKeys("2");
		WebElement startSprintButton = driver.findElement(By.id("start-sprint-button")); 
		startSprintButton.click();

		// Step 4: Move JIRA state to in-progress and click on complete sprint
		WebElement inProgressButton = driver.findElement(By.id("in-progress-button")); 
		inProgressButton.click();
		WebElement completeSprintButton = driver.findElement(By.id("complete-sprint-button")); 
		completeSprintButton.click();

		// Step 5: Verify existing issues in the displaying pop-up and move to backlog
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement existingIssues = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("existing-issues"))); 
		// Step 6: Verify Create Issue is present and highlighted on mouse hover
		WebElement createIssueButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-issue-button"))); 

		// Step 7: Click on Create Issue and verify placeholder text is displayed
		createIssueButton.click();
		WebElement placeholderText = driver.findElement(By.id("issue-name-input")); 
		// Step 8: Click on JIRA TYPE icon and verify Manage issue types button is displayed and enabled, then click it
		WebElement jiraTypeIcon = driver.findElement(By.id("jira-type-icon")); 
		WebElement manageIssueTypesButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("manage-issue-types-button"))); 
		// Step 9: Verify Issue Types screen is displayed and click on Add issue type in the left displaying pane
		WebElement issueTypesScreen = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("issue-types-screen"))); 
		// Perform verification
		WebElement addIssueTypeButton = driver.findElement(By.id("add-issue-type-button")); 
		addIssueTypeButton.click();
		// Step 10: Verify the pop-up displayed and create button is disabled
		WebElement createButton = driver.findElement(By.id("create-button")); 
		boolean isCreateButtonEnabled = createButton.isEnabled();
	
		// Step 11: Enter Name and Description and verify error message is displayed
		// below the name field
		WebElement nameField = driver.findElement(By.id("name-field")); 
		nameField.clear(); // Delete the entered text
		WebElement errorMessage = driver.findElement(By.id("error-message")); 
		boolean isErrorMessageDisplayed = errorMessage.isDisplayed();
		// Perform verification

		// Step 12: Enter Name and Description, click on change icon, select an icon and click select
		nameField.sendKeys("Issue Name");
		WebElement changeIcon = driver.findElement(By.id("change-icon")); 
		changeIcon.click();
		WebElement iconOption = driver.findElement(By.id("icon-option")); 
		iconOption.click();
		WebElement selectButton = driver.findElement(By.id("select-button")); 
		selectButton.click();

		// Step 13: Navigate back to project backlog
		driver.navigate().back();

		// Step 14: Create a new JIRA for the newly created type
		WebElement crctbtn = driver.findElement(By.id("create-issue-button")); 
		crctbtn.click();

		// Step 15: Verify the newly created type JIRA with
		// Project_Id_JIRA_NUMBER_JIRA_NAME
		String newIssueKey = "Project_Id_JIRA_NUMBER_JIRA_NAME"; 
		boolean isNewIssuePresent = driver.getPageSource().contains(newIssueKey);

		// Close the browser
		driver.quit();

	}

}
