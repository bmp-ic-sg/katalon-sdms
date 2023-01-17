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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Story: Verify if users can create, read, update and delete new data Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"'
WebUI.comment('')

WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Home" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Home Page')

'Focus find area "Structured Data" button'
WebUI.focus(findTestObject('Object Repository/Page_Home/div_Structured Data'))

'"Structured Data" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Home/div_Structured Data'))

'Click "Structured Data" button to Structured Data chooice'
WebUI.click(findTestObject('Object Repository/Page_Home/div_Structured Data'))

'Focus find area "Centres  Services (Main)" button'
WebUI.focus(findTestObject('Object Repository/Page_Home/a_Centres  Services (Main)'))

'"Centres  Services (Main)" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Home/a_Centres  Services (Main)'))

'Click "Centres  Services (Main)" button to shown Centres  Services (Main) page'
WebUI.click(findTestObject('Object Repository/Page_Home/a_Centres  Services (Main)'))

'"Centres  Services (Main)" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Default Page')

'Focus find area "Add Centres  Services (Main)" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

'"Add Centres  Services (Main)" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

'Click "Add Centres  Services (Main)" button to create new data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

'Page navigated to "Add Centres & Services (Main)" page'
WebUI.waitForPageLoad(10)

'"Add Centres & Services (Main)" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Add Page')

'Focus find area "Page Name" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name'))

'"Page Name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name'))

'Enter "Page Name" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Page Name'), 'Katalon Test V1 Final')

'Focus find area "Title (H1 Display)" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Title (H1 Display)'))

'"Title (H1 Display)" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Title (H1 Display)'))

'Enter "Title (H1 Display)" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Page Title (H1 Display)'), 'Katalon Test V1 Final')

'Focus find area "Item URL" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL'))

'"Item URL" field auto populate from "Page Name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL'))

'Focus find area "Summary" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary'))

'"Summary" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary'))

'Enter "Summary" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_textarea-Summary'), 'Katalon Test V1 Final')

'Focus find area "Display Enquiry CTA" checkbox'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA'))

'"Display Enquiry CTA" checkbox'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA'))

'Click "Display Enquiry CTA" checkbox to check Display Enquiry CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Enquiry CTA-CheckList'))

'focus find area "Display Find MP CTA" checkbox'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA'))

'"Display Find MP CTA" checkbox'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA'))

'Click "Display Find MP CTA" checkbox to check Display Find MP CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Find MP CTA-CheckList'))

'Focus find area "Main Image Alt Text" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Main Image Alt Text'))

'"Main Image Alt Text" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Main Image Alt Text'))

'Enter "Main Image Alt Text" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text'), 'Katalon Test V1 Final')

'focus find area "Additional CTA Label" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label'))

'"Additional CTA Label" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label'))

'Enter "Additional CTA Label" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label'), 'Katalon Test V1 Final')

'Focus find area "Additional CTA URL" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL'))

'"Additional CTA URL" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL'))

'Enter "Additional CTA URL" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL'), 'Katalon Test V1 Final')

'Focus find area "Hide Hero Image" checkbox'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image'))

'"Hide Hero Image" checkbox'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image'))

'Click "Hide Hero Image" checkbox to check Hide Hero Image'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Hide Hero Image-CheckList'))

'Focus find area "Hospitals" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

'"Hospitals" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

'Click "Hospitals" dropdown field to chooice Hospitals'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Nothing selected_Hospitals'))


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Gleneagles HospitalMount Elizabeth H_bd9683'), 
    '2e3aee33-96d4-416c-8da6-1ff62e738955', true)

'Focus find area "Hospitals" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

'"Hospitals" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

'Focus find area "Service Provider Types" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

'"Service Provider Types" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

'Click "Service Provider Types" dropdown field to chooice Service Provider Types'
WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Nothing selected_Provider-type'))

WebUI.selectOptionByValue(findTestObject('Page_Centres  Services (Main)/select_Clinical EmbryologyMedical AdvisorNu_88852e'), 
    '9d361e69-f422-4cb1-96c4-f6e71d8f2817', true)

'Focus find area "Service Provider Types" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

'"Service Provider Types" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

'Focus find area "Specialties" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

'"Specialties" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

'Click "Specialties" dropdown field to chooice Specialties'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Nothing selected_By-Speciality'))

WebUI.click(findTestObject('Page_Centres  Services (Main)/span_Nothing selected_fa'))

//WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Nothing selected_fa'))
'Click "Specialties" dropdown field to chooice child Specialties'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/i_Nothing selected_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Anaesthesiology  (operative care and p_4f3c31'))

'Click the "button_Done" when finished selecting Specialties'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Done'))

'Focus find "Specialties" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

'"Specialties" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

'Focus find area "Specialist Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'"Specialist Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'Chooice "Specialist Listing Mode" selected by specialty or service provider type'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-Specialist-LM'), 
    'by_specialty_or_service_provider_type', true)

'Focus find area "Chooice "Specialist Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'"Specialist Listing Mode" selected by specialty or service provider type field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'Focus find area "Medical Professional Specialist Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'"Medical Professional Specialist Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'Chooice "Specialist Listing Mode" selected by selection'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-Specialist-LM'), 
    'by_selection', true)

'Focus find area "Specialist Listing Mode" field by selection'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'"Specialist Listing Mode" field by selection'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

'Focus find area "Medical Professional Specialist Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'"Medical Professional Specialist Listing Mode" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'Click "Medical Professional Specialist Listing Mode" to chooice Medical Professional Specialist Listing Mode'
WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'Click "Medical Professional Specialist Listing Mode" to selected Medical Professional Specialist Listing Mode'
WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Nothing selected_MedPro-By-Special-LM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Razakjr Bin OmarAdrian Siew Mi_2646c6'), 
    'b2601187-1c37-4e77-abb1-10d17e572f55', true)

'Focus find area "Medical Professional Specialist Listing Mode" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'"Medical Professional Specialist Listing Mode" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

'Focus find area "AHP Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'"AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'Chooice "AHP Listing Mode" selected by specialty or service provider type'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-AHP'), 'by_specialty_or_service_provider_type', 
    true)

'Focus find area "AHP Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'"AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'Focus find area "Medical Professional By AHP Listing Mode" dorpdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'"Medical Professional By AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'Chooice "AHP Listing Mode" selected by selection'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-AHP'), 'by_selection', 
    true)

'Focus find area "AHP Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'"AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

'Focus find area "Medical Professional By AHP Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'"Medical Professional By AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'Click "Medical Professional By AHP Listing Mode" to selected Medical Professional AHP Listing Mode'
WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Nothing selected_Add'))

'Chooice "AHP Listing Mode" selected by specialty or service provider type'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Kader AnsariAlefia VasanwalaAl_c97580'), 
    '83974521-0ce3-4465-bbeb-4ac7bfb6b4ef', true)

'Focus find area "Medical Professional By AHP Listing Mode" dropdown field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'"Medical Professional By AHP Listing Mode" dropdown field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

'Focus find area "Sort Order" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Sort Order'))

'"Sort Order" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Sort Order'))

'Enter "Sort Order" field'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_SortOrder'), '1')

'Focus find area "Publish Date" field'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date'))

'"Publish Date" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Basic Information Lab')

'Focus find area "Button Save" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

'"Button Save" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

'Click "Button Save" button to save new data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

'Page navigated to "Centres & Services (Main)" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/h4_Successfully Created Centres  Services (Main)'), 
    10)

'"Centres & Services (Main)" success add new data'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Button Add')

WebUI.comment('Start Detail Page after add')

'Enter "Page Name" to search by page name'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Final')

'Click Keys "Enter" to search'
WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Page navigated to "Centres & Services (Main)" page search by page name'
WebUI.waitForElementNotPresent(findTestObject('Page_Centres  Services (Main)/h4_Successfully Created Centres  Services (Main)'), 
    10)

'Focus find area "View Item Details" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/span_detail'))

'"View Item Details" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/span_detail'))

'Click "View Item Details" button to view item details'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Detail-draf'))

'Page navigated to "Details" page'
WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/h5_Centres  Services (Main)_Detail'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Centres  Services (Main)/h4_Successfully Created Centres  Services (Main)'), 
    10)

'"Details" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Add Detail Page')

'Focus find area "Close" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_close_Detail-page'))

'"Close" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_close_Detail-page'))

'Click "Close" button to back Centres & Services (Main) page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_close_Detail-page'))

WebUI.comment('End Detail Page after add')

WebUI.comment('Start Edit Page')

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

'Focus find area "Page Name" field Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'"Page Name" field Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'Delete "Page Name" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_PageName-Edit'))

'Enter "Page Name" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_PageName-Edit'), 'Katalon Test V1 Edit')

'Focus find area "Page name" edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'"Page name" edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name_Edit'))

'Focus find area "Title (H1 Display)" field Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'"Title (H1 Display)" field Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'Delete "Title (H1 Display)" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input__H1 Display_Edit'))

'Enter "Title (H1 Display)" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input__H1 Display_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Title (H1 Display)" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'"Title (H1 Display)" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Page Title (H1 Display)_edit'))

'Focus find area "Item URL" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL_Edit'))

'"Item URL" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL_Edit'))

'Focus find area "Sumamary" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'"Sumamary" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'Delete "Summary" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/textarea_Summary_Edit'))

'Enter "Summary" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/textarea_Summary_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Summary" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'"Summary" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary_Edit'))

'Focus find area "Display Enquiry CTA" checkbox field Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'"Display Enquiry CTA" checkbox field Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'Click "Display Enquiry CTA" checkbox to check Display Enquiry CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Enquiry CTA_Edit'))

'Focus find area "Display Enquiry CTA" checkbox field Edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'"Display Enquiry CTA" checkbox field Edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA_Edit'))

'Focus find area "Display Find MP CTA" checkbox edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'"Display Find MP CTA" checkbox edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'Click "Display Find MP CTA" checkbox to check Display Find MP CTA'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Find MP CTA_Edit'))

'Focus find area "Display Find MP CTA" checkbox edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'"Display Find MP CTA" checkbox edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA_Edit'))

'Focus find area "Main Image Alt Text" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'"Main Image Alt Text" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'Detele "Main Image Alt Text" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text_Edit'))

'Enter "Main Image Alt Text" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Main Image Alt Text" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'"Main Image Alt Text" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Main Image Alt Text_Edit'))

'Focus find area "Additional CTA Label" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'"Additional CTA Label" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'Detele "Additional CTA Label" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label_Edit'))

'Enter "Additional CTA Label" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Additional CTA Label" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'"Additional CTA Label" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label_Edit'))

'Focus find area "Additional CTA URL" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'"Additional CTA URL" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'Detele "Additional CTA URL" text'
WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL_Edit'))

'Enter "Additional CTA URL" field edit'
WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL_Edit'), 'Katalon Test V1 Edit')

'Focus find area "Additional CTA URL" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'"Additional CTA URL" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL_Edit'))

'Focus find area "Hide Hero Image" checkbox edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'"Hide Hero Image" checkbox edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'Click "Hide Hero Image" checkbox to check Hide Hero Image'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Hide Hero Image_Edit'))

'Focus find area "Hide Hero Image" checkbox edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'"Hide Hero Image" checkbox edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image_Edit'))

'Focus find area "Hospitals" field edit'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals_Edit'))

'"Hospitals" field edit'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals_Edit'))

'Click edit "Hospitals" dropdown field to chooice Hospitals'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Gleneagles Hospital_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Gleneagles Hospital_Edit'), 
    '2e3aee33-96d4-416c-8da6-1ff62e738955', true)

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Clinical Embryology_Edit'), 
    'c353c65b-e40a-4d4f-b6e0-5cc198c7c572', true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Selected 2 specialties_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Transport of the Critically Ill Patient_fa_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/i_Transport of the Critically Ill Patient_f_9ada21_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Cardiology (heart)_fa_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Done_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Abdul Razakjr Bin Omar_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Adrian Siew Ming Saurajen_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Razakjr Bin Omar        Adrian_b67a8b_Edit'), 
    'b2601187-1c37-4e77-abb1-10d17e572f55', true)

WebUI.click(findTestObject('Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional AHP_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional AHP_Edit'))

WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Abdul Kader Ansari_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Alefia Vasanwala_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Kader Ansari        Alefia Vas_ed8dcc_Edit'), 
    '3a9d84ce-d3eb-4954-a912-99d078a930cb', true)

WebUI.click(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

WebUI.focus(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/div_Sort Order_Edit'))

WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Sort Order_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Sort Order_Edit'), '2')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date_Edit'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save and Close_Edit'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save and Close_Edit'))

WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Save and Close_Edit'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/modal_Successfully Updated'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Success Edit Page')

WebUI.comment('EndEdit Page')

WebUI.comment('Start Detail Page After Edit')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/span_detail'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/span_detail'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Detail-draf'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/h5_Centres  Services (Main)_Detail'), 10)

WebUI.waitForElementNotPresent(findTestObject('Page_Centres  Services (Main)/modal_Successfully Updated'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Detail Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_close_Detail-page'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_close_Detail-page'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_close_Detail-page'))

WebUI.comment('End Detail Page After Edit')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search_Button-search'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search_Button-search'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Page Name')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search by-languange'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search by-languange'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Chinese'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Chinese Language')

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_English'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By English Language')

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Indonesian'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Indonesian Language')

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Vietnamese'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By Vietnamese Language')

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_All Languages'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Search By All Language')

WebUI.clearText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Delete Search')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Copy'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Copy Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_CSV'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button SCV Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Excel'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Excel Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_PDF'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button PDF Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Print'))

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Button Print Page')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pagination'), 1)

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pagination'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Next'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page 2')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Pagination-Previous'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page 1')

WebUI.comment('Start Send Approvals')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Selected one Data Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Send-Approval'), 20)

WebUI.takeFullPageScreenshotAsCheckpoint('Page Button send approvals')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully_Send to Approvals'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Send to Approvals')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully_Send to Approvals'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Panding Approvals Status')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main) Approvals/h3_Centres  Services (Main) Approvals'), 
    10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Approvals Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

WebUI.waitForPageLoad(30)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Approvals Detail Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Close_Approvals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Close_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/span_Click_Button close Approvals'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/div_Approve_Page'), 
    20)

WebUI.takeFullPageScreenshotAsCheckpoint('Approve Change Request Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main) Approvals/div_Successfully Approve Centres  Services (Main)'), 
    10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Approve Page')

WebUI.click(findTestObject('Object Repository/Page_Home/div_Structured Data'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Centres  Services (Main)'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/h3_Centres  Services (Main)_After AP'), 
    20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page After Approvals Page')

WebUI.comment('End Send Approvals')

WebUI.comment('Start Pending Publish')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshotAsCheckpoint('Status Pending Published')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Pending Publish_Detail'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/h5_Centres  Services (Main)_Pending Publish'), 
    20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Detail Page Status Pending Published')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Detail-pendingPublish'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Detail-pendingPublish'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Close_PendingPublish'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pending Publish'), 300)

WebUI.refresh()

WebUI.comment('End Pending Publish')

WebUI.comment('Start New Revision')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Published_Detail-Page'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/publish_this-perent'), 20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Status Published Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Close_Published_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Button-close_Published_Detail'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Published_NewRevision'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_NewRevision'), 20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Revision Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_New Revision'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/div_Successfully create new revision'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Revision Page')

WebUI.comment('End New Revision')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/td_Action_select-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Send For Approval_Send to AP'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Structured Data Approval_SDMS'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Centres  Services (Main)_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Review Data_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/span_Click_Button close Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve_Approvals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main) Approvals/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_Home/div_Structured Data'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Centres  Services (Main)'))

WebUI.comment('Start unpublished')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) New Revision Panding Published')

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Pending Publish'), 300)

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.focus(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

WebUI.takeElementScreenshot(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

WebUI.click(findTestObject('Page_Centres  Services (Main)/button_Published_UnPublished'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Unpublish_Page'), 20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Unpublish Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Unpublish'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Unpublish'), 
    20)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Unpublish Page')

WebUI.click(findTestObject('Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'))

WebUI.clearText(findTestObject('Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('End Unpublish')

WebUI.comment('Start Delete')

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1 Edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))


WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Status Draft After Unpublish ')

'Focus find area "Detele" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft_Delete'))

'"Detele" button in table'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft_Delete'))

'Click "Delete" button to navigated delete page'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Draft_Delete'))


WebUI.waitForPageLoad(10)

'Page navigated to "Delete" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Deleted'), 
    20)

'"Delete" Page'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Delete Page')

'Focus find area "Delete" button'
WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Delete'))

'"Delete" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Delete'))

'Click "Delete" button to delete data'
WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Delete'))

'Page navigated to "Centres & Services (Main)" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Successfully Deleted'), 
    30)

'"Centres & Services (Main)" success delete data'
WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Delete Page')

'Delete text in input search'
WebUI.clearText(findTestObject('Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'))


WebUI.sendKeys(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    Keys.chord(Keys.ENTER))

'Finish'
WebUI.closeBrowser()

