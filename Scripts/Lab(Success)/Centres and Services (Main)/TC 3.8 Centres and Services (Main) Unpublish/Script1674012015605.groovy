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

'Story: Verify if users can click unpublish item Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Click "Unpublish" button'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be send approvals item, To send approvals item refer to TC 3.6 Send AP.'
WebUI.callTestCase(findTestCase('Base Send Approvals'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'"Centres & Services (Main)" New Revision Panding Published page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) New Revision Panding Published')

'wait 15 minutes to change the status to publish'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pending Publish'), 300)

'Refresh page'
WebUI.refresh()

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Focus find area "UnPublish" button'
WebUI.focus(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

'"UnPublish" button'
WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

'Click "UnPublish" button to verify unpublish item'
WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

WebUI.waitForPageLoad(10)

'Page navigated to "UnPublish" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Unpublish_Page'), 20)

'"UnPublish" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Unpublish Page')

'Focus find area "UnPublish" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

'"UnPublish" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

'Click "UnPublish" button to unpublish item'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

'Page navigated to "Success UnPublish" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Unpublish'), 
    30)

'"Success UnPublish" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Unpublish Page')

'Finish'
WebUI.closeBrowser()

