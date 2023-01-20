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

'Story: Verify if users can click new revision item Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Click "New Revision" button'
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

'"Centres & Services (Main)" pending published page'
WebUI.takeFullPageScreenshotAsCheckpoint('Status Pending Published')

'Focus find area "Details" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

'"Details" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

'Click "Details" button to view item details'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

WebUI.waitForPageLoad(10)

'Page navigated "Details" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/h5_Centres  Services (Main)_Pending Publish'), 
    20)

'"Details" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Detail Page Status Pending Published')

'Focus find "Close" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Detail-pendingPublish'))

'"Close" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Detail-pendingPublish'))

'Click "Close" button to close view item details'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Close_PendingPublish'))

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

'Focus find area "Details" button'
WebUI.focus(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

'"Details" button'
WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

'Click "Details" button to view item details'
WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

WebUI.waitForPageLoad(10)

'Page navigated "Details" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/publish_this-perent'), 20)

'"Details" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Status Published Page')

'Focus find "Close" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

'"Close" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

'Click "Close" button to close view item details'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Button-close_Published_Detail'))

'Focus find area "New Revision" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

'"New Revision" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

'Click "New Revision" button to verify data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.waitForPageLoad(10)

'Page navigate to "New Revision" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_NewRevision'), 20)

'"New Revision" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Revision Page')

'Focus find area "New Revision" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

'"New Revision" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

'Click "New Revision" button to revision data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

'Page navigated to "Revision data" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully create new revision'), 5)

'"Revision data" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Revision Page')

'Finish'
WebUI.closeBrowser()

