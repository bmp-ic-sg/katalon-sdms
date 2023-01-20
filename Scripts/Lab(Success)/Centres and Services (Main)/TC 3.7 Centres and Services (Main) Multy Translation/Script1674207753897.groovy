import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Story: Verify if users can click item send for trnaslation Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Select item\n9. Click "Send for Translation" to send translation'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Click "Checkbox" field to select an item'
WebUI.click(findTestObject('Page_Centres  Services (Main)/td_Action_select-checkbox'))

'Focus find area "Send For Translation" button'
WebUI.focus(findTestObject('Page_Centres  Services (Main)/button_Send For Translation'))

'"Send For Translation" button'
WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/button_Send For Translation'))

'Click the "Send For Translation" button to verify the item before sending'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Translation'))

'Page navigated to "Send For Translation" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Send Translation'), 10)

'"Send For Translation" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Multy Translation Page')

'Focus find area "Send For Translation" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send for Translation (1)'))

'"Send For Translation" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send for Translation (1)'))

'Click "Send For Translation" button to send translation'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send for Translation (1)'))

'Page navigated to "Success Send for Translation" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully Sent Translation Data'), 5)

'"Success Send for Translation" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Send Multy Translation Page')

