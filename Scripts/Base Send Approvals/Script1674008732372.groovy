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

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

//WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
//    'Katalon Test V1 Edit')
//
//WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
//    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/span_Click_Button close Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

