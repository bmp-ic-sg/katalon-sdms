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

WebUI.openBrowser('')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_Detail'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_Detail'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Button-close_Published_Detail'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Revision Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully create new revision'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Revision Page')

WebUI.closeBrowser()

