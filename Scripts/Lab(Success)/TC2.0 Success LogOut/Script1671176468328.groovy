import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Story: Verify if users can logOut successful.\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Page redirected to "Home" page\n6. Click "Welcome" page and click button logOut\n7. LogOut success'
WebUI.comment('')

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

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Page_Parkway Pantai - Login/userName'), 10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page After LogOut')

'Finish'
WebUI.closeBrowser()

