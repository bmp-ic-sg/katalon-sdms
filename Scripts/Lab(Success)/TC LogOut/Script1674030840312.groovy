import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Story: Verify if users can logOut successful.\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Page redirected to "Home" page\n6. Click "Welcome" page and click button logOut\n7. LogOut success'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Home" page'
WebUI.waitForPageLoad(10)

'"Home" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Home Page')

'Focus find area "Welcome" page'
WebUI.focus(findTestObject('Object Repository/Page_Home/a_Welcome'))

'"Welcome" page'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Home/a_Welcome'))

'Click "Welcome" page to shown logOut button'
WebUI.click(findTestObject('Object Repository/Page_Home/a_Welcome'))

'Focus find area "LogOut" button'
WebUI.focus(findTestObject('Object Repository/Page_Home/div_Logout'))

'"LogOut" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Home/div_Logout'))

'Click "LogOut" button to logOut account'
WebUI.click(findTestObject('Object Repository/Page_Home/a_Logout'))

WebUI.waitForPageLoad(30)

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Page_Parkway Pantai - Login/userName'), 10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page After LogOut')

'Finish'
WebUI.closeBrowser()

