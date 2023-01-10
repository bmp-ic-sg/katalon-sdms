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

WebUI.comment('')

WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('Home Page')

WebUI.focus(findTestObject('Page_Home/div_Structured Data'))

WebUI.takeElementScreenshot(findTestObject('Page_Home/div_Structured Data'))

WebUI.click(findTestObject('Page_Home/div_Structured Data'))

WebUI.focus(findTestObject('Page_Home/a_Centres  Services (Main)'))

WebUI.takeElementScreenshot(findTestObject('Page_Home/a_Centres  Services (Main)'))

WebUI.click(findTestObject('Page_Home/a_Centres  Services (Main)'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Search_centres_services_main-input-search'), 
    'Katalon Test V1')

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

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Page')

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

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Centres  Services (Main)'))

WebUI.takeFullPageScreenshotAsCheckpoint('Add Centres & Services (Main) Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Name'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Page Name'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Title (H1 Display)'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Page Title (H1 Display)'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Page Title (H1 Display)'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Item URL'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Summary'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_textarea-Summary'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Enquiry CTA'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Enquiry CTA-CheckList'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Display Find MP CTA'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Display Find MP CTA-CheckList'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Main Image Alt Text'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Main Image Alt Text'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Main Image Alt Text'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA Label'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA Label'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Additional CTA URL'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Additional CTA URL'), 'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hide Hero Image'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Hide Hero Image-CheckList'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Nothing selected'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Gleneagles Hospital'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Gleneagles HospitalMount Elizabeth H_bd9683'), 
    '2e3aee33-96d4-416c-8da6-1ff62e738955', true)

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospitals'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Nothing selected'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Clinical Embryology'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Clinical EmbryologyMedical AdvisorNu_88852e'), 
    '9d361e69-f422-4cb1-96c4-f6e71d8f2817', true)

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Service Provider Types'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Nothing selected'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Nothing selected_fa'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/i_Nothing selected_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/span_Anaesthesiology  (operative care and p_4f3c31'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Done'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Specialties'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-Specialist-LM'), 
    'by_specialty_or_service_provider_type', true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-Specialist-LM'), 
    'by_selection', true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Specialist Listing Mode'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Nothing selected'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Abdul Razakjr Bin Omar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Razakjr Bin OmarAdrian Siew Mi_2646c6'), 
    'b2601187-1c37-4e77-abb1-10d17e572f55', true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-Specialist-LM'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-AHP'), 'by_specialty_or_service_provider_type', 
    true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_No Listing_By-AHP'), 'by_selection', 
    true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_AHP Listing Mode'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Nothing selected'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Abdul Kader Ansari'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centres  Services (Main)/select_Abdul Kader AnsariAlefia VasanwalaAl_c97580'), 
    '83974521-0ce3-4465-bbeb-4ac7bfb6b4ef', true)

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Medical Professional_By-AHP'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Sort Order'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Sort Order'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_SortOrder'), '1')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/label_Publish Date'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Basic Information Lab')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Meta Data'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Meta Data'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/a_Meta Data'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Meta Data Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Meta Data'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Meta Data'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Add Meta Data'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospital  Gleneagles Hospital_MD'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Hospital  Gleneagles Hospital_MD'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Hospital  Gleneagles Hospital'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Hospital  Gleneagles Hospital'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Hospital  Gleneagles Hospital'))

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Meta Data Page One')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Gleneagles Hospital,Mount Elizabeth Nov_7a570c'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Gleneagles Hospital,Mount Elizabeth Nov_7a570c'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/textarea_Social Summary_social-summary-md-KLTlN'), 
    'Katalon Test V1 Final')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Browse Image_col-md-12 col-xs-12 form-c_62e851'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/div_Browse Image_col-md-12 col-xs-12 form-c_62e851'))

WebUI.setText(findTestObject('Object Repository/Page_Centres  Services (Main)/input_Browse Image_entres_services_main_mod_74a45f'), 
    'Katalon Test V1 Final')

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) MetaData Page')

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

WebUI.focus(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Cancel'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Centres  Services (Main)/button_Save'))

WebUI.waitForElementPresent(findTestObject('Page_Centres  Services (Main)/h4_Successfully Created Centres  Services (Main)'), 
    10)

WebUI.takeFullPageScreenshotAsCheckpoint('Centres & Services (Main) Success Button Add')

WebUI.closeBrowser()

