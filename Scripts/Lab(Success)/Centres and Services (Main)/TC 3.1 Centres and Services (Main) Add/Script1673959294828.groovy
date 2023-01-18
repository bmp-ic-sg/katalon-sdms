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

'Story: Verify if users can create new data Centres & Services (Main).\n\nRequired:\n1. Email already register\n2. Password\n\nStep :\n1. Open browser and enter SDMS URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Login Success\n6. Click structured data\n7. Click "Centres & Services (Main)"\n8. Click "Add Centres & Services (Main)" button'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.0 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Home" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Home Page')

'User must be click side bar, to side bar refer to TC 2.0 Side Bar'
WebUI.callTestCase(findTestCase('Base Side Bar'), [:], FailureHandling.STOP_ON_FAILURE)

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

'Finish'
WebUI.closeBrowser()

