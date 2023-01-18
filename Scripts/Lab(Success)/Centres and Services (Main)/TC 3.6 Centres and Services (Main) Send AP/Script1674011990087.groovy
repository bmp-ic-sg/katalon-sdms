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

'Story: Verify if users can send item to approvals page Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Select item\n9. Click "Send For Apptoval" button'
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

'Focus find area "Checkbox" field in table'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

'"Checkbox" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

'Click "Checkbox" field to select an item'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

'"checkbox" the selected item'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Selected one Data Page')

'Focus find area "Send Approvals" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

'"Send Approvals" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

'Click "Send Approvals" button to verify item before send to approvals page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

'Page navigated to "Approvals Verify Item" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Send-Approval'), 20)

'"Centres & Services (Main) for Approvals" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Page Button send approvals')

'Focus find area "Send for Approvals"button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

'"Send for Approvals"button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

'Click "Send for Approvals" button to send item to centres & services (main) approvals page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

'Page navigated to "Centres & Services (Main) Approvals" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully_Send to Approvals'), 10)

'"Success send for approval" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Send to Approvals')

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully_Send to Approvals'), 10)

'"Success Send to Approvals" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Panding Approvals Status')

'Focus find area "Structured Data Approval" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

'"Structured Data Approval" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

'Click "Structured Data Approval" button to open Approval list'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

'Focus find area "Centres & Services (Main)" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

'"Centres & Services (Main)" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

'Click "Centres & Services (Main)" button to open Centres & Services (Main) Approvals page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

'Page navigated "Centres & Services (Main) Approvals" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main) Approvals/h3_Centres  Services (Main) Approvals'), 
    10)

'"Centres & Services (Main) Approvals" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Approvals Page')

'Focus find area "Review Data" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

'"Review Data" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

'Click "Review Data" button to review data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

'Page navigated to "review" page'
WebUI.waitForPageLoad(30)

'"review" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Approvals Detail Page')

'Focus find area "Close" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Close_Approvals'))

'"Close" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Close_Approvals'))

'Click "Close" button to close review page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/span_Click_Button close Approvals'))

'Focus find area "Approve" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

'"Approve" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

'Click "Approve" button to verify approve data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

'Page navigated to "Approve" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/div_Approve_Page'), 
    20)

'"Approve" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Approve Change Request Page')

'Focus find area "Approve" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

'"Approve" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

'Click "Approve" button to approve data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

'Page navigated to "Success approve" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main) Approvals/div_Successfully Approve Centres  Services (Main)'), 
    30)

'"Success Approve" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Approve Page')

'Finish'
WebUI.closeBrowser()

