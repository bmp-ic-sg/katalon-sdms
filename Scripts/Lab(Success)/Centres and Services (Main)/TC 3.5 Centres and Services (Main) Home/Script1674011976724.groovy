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

'Story: Verify if users can search, search by language and pagination Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

'Focus find area "Search" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

'"Search" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Focus find area "Search" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search_Button-search'))

'"Search" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search_Button-search'))

'Page "Centres & Services (Main)" by page name'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Page Name')

'Focus find area "Dropdown" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'"Dropdown" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Click "Dropdown" button to search page name by language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Focus find area "Search by Language" page'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search by-languange'))

'"Search by Language" page'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search by-languange'))

'Click "Chinese" language to search by chinese language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Chinese'))

'"Chinese" language'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Chinese Language')

'Click "Dorpdown" button to chooice language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Click "English" language to search by english language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_English'))

'"English" language'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By English Language')

'Click "Dorpdown" button to chooice language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Click "Indonesian" language to search by indonesian language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Indonesian'))

'"Indonesian" language'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Indonesian Language')

'Click "Dorpdown" button to chooice language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Click "Vietnamese" language to search by vietnamese language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Vietnamese'))

'"Vietnamese" language'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Vietnamese Language')

'Click "Dorpdown" button to chooice all language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

'Click "All" language to search by all language'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_All Languages'))

'"All" language'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By All Language')

'Delete "Search" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'))

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Delete "Search" by page name page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Delete Search')

'Focus find area "Copy" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

'"Copy" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

'Click "Copy" button to copy all list in Centres & Services (Main) page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

'"Copy" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Copy Page')

'Focus find area "CSV" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

'"CSV" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

'Click "CSV" button to download by CSV file'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

'Success download by "CSV" file'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button SCV Page')

'Focus find area "Excel" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

'"Excel" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

'Click "Excel" button to download by excel file'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

'Success download by "Excel" file'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Excel Page')

'Focus find area "PDF" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

'"PDF" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

'Click "PDF" button to download by PDF file'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

'Success download by "PDF" file'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button PDF Page')

'Focus find area "Print" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

'"Print" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

'Click "Print" button to print all list in Centres & Services (Main) page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

WebUI.waitForPageLoad(10)

'Success "Print" all list in Centres & Services (Main)'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Print Page')

'Scroll find area "Pagination" button'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pagination'), 1)

'"Pagination" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pagination'))

'Focus find area "Pagination Next" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

'"Pagination Next" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

'Click "Pagination Next" button to move next list page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

'"List Page" after click next pagination'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page 2')

'Focus find area "Pagination Previous" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

'"Pagination Previous" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

'Click the "Previous Pagination" button to return to the previous listing page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

'"List Page" after click previous pagination'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page 1')

'Finish'
WebUI.closeBrowser()

