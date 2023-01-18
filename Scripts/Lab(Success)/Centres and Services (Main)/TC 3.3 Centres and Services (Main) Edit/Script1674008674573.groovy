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

'Story: Verify if users can edit item Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Click "Edit" button'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Final')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Focus find area "Edit" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft-button-edit'))

'"Edit" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft-button-edit'))

'Click "Edit" button to edit data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft-button-edit'))

'Page navigated to "Edit" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/h5_Edit Centres  Services (Main)'), 10)

'"Edit" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Edit Page')

'Focus find area "Page Name" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'"Page Name" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'Delete "Page Name" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_PageName-Edit'))

'Enter "Page Name" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_PageName-Edit'), 'Katalon Test V1 Edit')

'Focus find area "Page name" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'"Page name" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'Focus find area "Title (H1 Display)" field before Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'"Title (H1 Display)" field before Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'Delete "Title (H1 Display)" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input__H1 Display_Edit'))

'Enter "Title (H1 Display)" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input__H1 Display_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Title (H1 Display)" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'"Title (H1 Display)" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'Focus find area "Item URL" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL_Edit'))

'"Item URL" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL_Edit'))

'Focus find area "Sumamary" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'"Sumamary" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'Delete "Summary" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/textarea_Summary_Edit'))

'Enter "Summary" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/textarea_Summary_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Summary" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'"Summary" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'Focus find area "Display Enquiry CTA" checkbox field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'"Display Enquiry CTA" checkbox field before Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'Click "Display Enquiry CTA" checkbox to check Display Enquiry CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Enquiry CTA_Edit'))

'Focus find area "Display Enquiry CTA" checkbox field after Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'"Display Enquiry CTA" checkbox field after Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'Focus find area "Display Find MP CTA" checkbox before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'"Display Find MP CTA" checkbox before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'Click "Display Find MP CTA" checkbox to check Display Find MP CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Find MP CTA_Edit'))

'Focus find area "Display Find MP CTA" checkbox after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'"Display Find MP CTA" checkbox after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'Focus find area "Main Image Alt Text" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'"Main Image Alt Text" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'Detele "Main Image Alt Text" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text_Edit'))

'Enter "Main Image Alt Text" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Main Image Alt Text" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'"Main Image Alt Text" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'Focus find area "Additional CTA Label" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'"Additional CTA Label" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'Detele "Additional CTA Label" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label_Edit'))

'Enter "Additional CTA Label" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Additional CTA Label" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'"Additional CTA Label" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'Focus find area "Additional CTA URL" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'"Additional CTA URL" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'Detele "Additional CTA URL" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL_Edit'))

'Enter "Additional CTA URL" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Additional CTA URL" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'"Additional CTA URL" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'Focus find area "Hide Hero Image" checkbox before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'"Hide Hero Image" checkbox before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'Click "Hide Hero Image" checkbox to check Hide Hero Image'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Hide Hero Image_Edit'))

'Focus find area "Hide Hero Image" checkbox after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'"Hide Hero Image" checkbox after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'Focus find area "Hospitals" field after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals_Edit'))

'"Hospitals" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals_Edit'))

'Click edit "Hospitals" dropdown field to chooice Hospitals'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Gleneagles Hospital_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Gleneagles Hospital_Edit'), 
    '2e3aee33-96d4-416c-8da6-1ff62e738955', true)

'Click edit "Service Provider Types" dropdown field to chooice Service Provider Types'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

'Focus find area "Service Provider Types" field before edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

'"Service Provider Types" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Clinical Embryology_Edit'), 
    'c353c65b-e40a-4d4f-b6e0-5cc198c7c572', true)

'Focus find area "Service Provider Types" dropdown after edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

'"Service Provider Types" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

'Focus find area "Specialties" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties_Edit'))

'"Specialties" field before edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties_Edit'))

'Click edit "Specialties" field to chooice specialties'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Selected 2 specialties_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Transport of the Critically Ill Patient_fa_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/i_Transport of the Critically Ill Patient_f_9ada21_Edit'))

'Click "Specialties" dropdown field to chooice child specialties'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Cardiology (heart)_fa_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Done_Edit'))

'"Specialties" field after edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties_Edit'))

'Focus find area "Specialist Listing Mode" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode_Edit'))

'"Specialist Listing Mode" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode_Edit'))

'Focus find area "Medical Professional By Specialist Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_Edit'))

'"Medical Professional By Specialist Listing Mode" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_Edit'))

'Click field "Medical Professional By Specialist Listing Mode" to chooice Medical Professional'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Abdul Razakjr Bin Omar_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Adrian Siew Ming Saurajen_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Razakjr Bin Omar        Adrian_b67a8b_Edit'), 
    'b2601187-1c37-4e77-abb1-10d17e572f55', true)

WebUI.click(findTestObject('Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

'Focus find area "AHP Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

'"AHP Listing Mode" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

'Focus find area "Medical Professional by AHP Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional AHP_Edit'))

'"Medical Professional by AHP Listing Mode" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional AHP_Edit'))

'Click field "Medical Professional by AHP Listing Mode" to chooice Medical Professional'
WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Abdul Kader Ansari_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Alefia Vasanwala_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Kader Ansari        Alefia Vas_ed8dcc_Edit'), 
    '3a9d84ce-d3eb-4954-a912-99d078a930cb', true)

WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

'Focus find area "Sort Order" field'
WebUI.focus(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

'"Sort Order" field before edit'
WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

'Delete "Sort Order" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Sort Order_Edit'))

'Enter "Sort Order" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Sort Order_Edit'), '2')

'"Sort Order" field after edit'
WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

'Focus find area "Publish Date" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date_Edit'))

'"Publish Date" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date_Edit'))

'Focus find area "Save and Close" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save and Close_Edit'))

'"Save and Close" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save and Close_Edit'))

'Click the "Save and Close" button to save the data after editing the data'
WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Save and Close_Edit'))

'Page navigated to the Edit Success Page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/modal_Successfully Updated'), 30)

'Edit Success Page'
WebUI.takeFullPageScreenshotAsCheckpoint('Success Edit Page')

'Finish'
WebUI.closeBrowser()

