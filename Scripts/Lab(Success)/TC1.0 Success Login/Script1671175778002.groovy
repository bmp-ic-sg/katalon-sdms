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

'Story: Verify if users can login successful.\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success'
WebUI.comment('')

'Start'
WebUI.openBrowser('')

'Enter SDMS URL'
WebUI.navigateToUrl('https://uat.azlabs.sg/sdms')

'Page navigated to "Login" page'
WebUI.waitForPageLoad(30)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

'"UserName" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/userName'))

'Enter "UserName" field'
WebUI.setText(findTestObject('Object Repository/Page_Parkway Pantai - Login/userName'), 'sdmsAdmin')

'"Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/password'))

'Enter "Password" field'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Parkway Pantai - Login/password'), 'ufl/XzYkHtvhqz0xQEf9ow==')

'"Login" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Parkway Pantai - Login/button_Login'))

'Click "Login" button to verify userName and password'
WebUI.click(findTestObject('Object Repository/Page_Parkway Pantai - Login/button_Login'))

'Finish'
WebUI.closeBrowser()

