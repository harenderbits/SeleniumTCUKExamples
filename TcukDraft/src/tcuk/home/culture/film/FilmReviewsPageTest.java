package tcuk.home.culture.film;

import org.testng.annotations.Test;

import tcuk.GlobalTests;

public class FilmReviewsPageTest extends GlobalTests
{
//////////////////////////
//////CLASS SPECIFIC METHODS/////////////////////////////////////
	//////////////////////////
	
	@Test
	public void openPage() throws InterruptedException
	{
		selenium.open("/");
		selenium.click("link=Culture");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Film");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Film Reviews");
		selenium.waitForPageToLoad("30000");
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void header()
	{
		checkHeader();
		assertEquals("Film reviews", selenium.getText("//div[@id='tmglPageTitle']/h1"));
	}
	
	//////////////////////////
//////GLOBAL METHODS/////////////////////////////////////////////
	//////////////////////////
	
	@Test(dependsOnMethods = { "openPage" })
	public void banner()
	{
		checkBanner();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void topBar()
	{
		checkTopBar();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void brand()
	{
		checkBrand();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void primaryNavigation()
	{
		checkPrimaryNavigation();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void secondaryNavigation()
	{
		checkSecondaryNavigationCulture();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void tertiaryNavigation()
	{
		checkTertiaryNavigationFilm();
	}
	
	/*@Test(dependsOnMethods = { "openPage" })
	public void puff()
	{
		checkPuff();
	}*/
	
	@Test(dependsOnMethods = { "openPage" })
	public void mpu()
	{
		checkMpu();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void mostViewed()
	{
		checkMostViewed();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void adSky()
	{
		checkAd();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void editorsChoice()
	{
		checkEditorsChoice();
	}
	
	/*@Test(dependsOnMethods = { "openPage" })
	public void googleAds()
	{
		checkGoogleAds();
	}*/
	
	@Test(dependsOnMethods = { "openPage" })
	public void moreFromTelegraph()
	{
		checkMoreFromTelegraph();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void backToTop()
	{
		checkBackToTop();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void hotTopics()
	{
		checkHotTopics();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer1stColumn()
	{
		checkFooter1stColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer2ndColumn()
	{
		checkFooter2ndColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer3rdColumn()
	{
		checkFooter3rdColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer4thColumn()
	{
		checkFooter4thColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer5thColumn()
	{
		checkFooter5thColumn();
	}

	@Test(dependsOnMethods = { "openPage" })
	public void footer6thColumn()
	{
		checkFooter6thColumn();
	}
	
	@Test(dependsOnMethods = { "openPage" })
	public void footerBottom()
	{
		checkFooterBottom();
	}
}
