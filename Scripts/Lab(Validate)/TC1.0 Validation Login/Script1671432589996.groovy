import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

'Story: Verify if the user was unable to log in successfully.\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Failed'
WebUI.comment('')

'Start and Enter SDMS URL'
WebUI.openBrowser(GlobalVariable.baseUrl)

//'Enter SDMS URL'
//WebUI.navigateToUrl('https://uat.azlabs.sg/sdms')
'Page navigated to "Login" page'
WebUI.waitForPageLoad(30)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

'"UserName" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/userName'))

'Enter "UserName" field'
WebUI.setText(findTestObject('Object Repository/Page_Parkway Pantai - Login/userName'), 'sdmsAd')

'"Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/password'))

'Enter "Password" field'
WebUI.setText(findTestObject('Object Repository/Page_Parkway Pantai - Login/password'), GlobalVariable.password)

'"Login" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/button_Login'))

'Click "Login" button to verify userName and password'
WebUI.click(findTestObject('Object Repository/Page_Parkway Pantai - Login/button_Login'))

'Scroll find area error message'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Parkway Pantai - Login/li_Failed to authenticate'), 1)

'"Error message"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/li_Failed to authenticate'))

'"Failed" login page'
WebUI.takeFullPageScreenshotAsCheckpoint('Failed login page')

'Finish'
WebUI.closeBrowser()

