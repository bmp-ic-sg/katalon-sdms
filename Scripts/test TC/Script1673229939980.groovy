import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.rightClick(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Send-Approval'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/div_Approve_Page'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/h3_Centres  Services (Main)_After AP'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/h5_Centres  Services (Main)_Pending Publish'))

WebUI.rightClick(findTestObject('Object Repository/Page_Centres  Services (Main)/publish_this-perent'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_NewRevision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully create new revision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Unpublish_Page'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Unpublish'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Delete_Page'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Deleted'))

WebUI.rightClick(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft_Delete'))

