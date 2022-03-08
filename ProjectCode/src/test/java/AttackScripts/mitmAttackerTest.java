package AttackScripts;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.zfac025Project.ProjectCode.GoogleChrome;
import com.zfac025Project.ProjectCode.GoogleChromeOperations;
import com.zfac025Project.ProjectCode.Attackers.AttackerFactory;

/**
 * Unit test for simulating an attackers actions on a network.
 * The attackers actions 
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class mitmAttackerTest {

	static GoogleChrome browser;
	static GoogleChromeOperations operations;
	static AttackerFactory attacker;
	  
	/**
	    * Before the test starts an instance of ChromeDriver is created.
	    * Verifies the object was created properly
	    */
	  @BeforeAll
	  public static void createChrome() {
	    browser = new GoogleChromeOperations();
	    operations = new GoogleChromeOperations();
	    attacker = new AttackerFactory();
	    assertTrue(GoogleChrome.setUpDriver());
	  }

	  /**
	  * Quits the ChromeDriver which closes the Google Chrome window.
	  */
	  @AfterAll
	  public static void closeChrome() {
	    assertTrue(browser.quitDriver());
	  }


	  @Test
	  @Order(1)
	  public void creationTest() {
	    assertTrue(attacker.createAttacker("ManInTheMiddle"));
	  }
	  
	  @Test
	  @Order(2)
	  public void createchatSite() throws InterruptedException {
	    assertTrue(operations.getWebsite("https://stin.to/en"));
	    assertTrue(operations.clickElement("/html/body/div/div[1]/div/p[2]/a"));
	    assertTrue(operations.type("/html/body/div[2]/form/div/div/div[2]/div[2]/div/input", "Mallory"));
	    assertTrue(operations.clickID("loginTermsOfUse"));
	    assertTrue(operations.clickElement("/html/body/div[2]/form/div/div/div[3]/button"));
	  }
	  
	  @Test
	  @Order(3)
	  public void typeMessage() {
		  assertTrue(operations.type("/html/body/div[1]/div[1]/div[1]/form/div/div/input", "Welcome, please send your account details"));
	  }
	  
	  @Test
	  @Order(4)
	  public void sendMessage() throws InterruptedException {
		  assertTrue(operations.clickElement("/html/body/div[1]/div[1]/div[1]/form/div/div/div[1]/i"));
	  }
}
