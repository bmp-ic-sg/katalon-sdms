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

WebUI.navigateToUrl('https://gluu-ihh.azlabs.sg/oxauth/authorize.htm?scope=openid+profile+user_name+user_type+user_role&response_type=code&redirect_uri=https%3A%2F%2Fuat.azlabs.sg%2Fsdms%2Fcallback&state=kbjHA63duTcVqqFekZjwTZcBVCk&nonce=yt2IAzAgq_qeBxJwgN8Hm_k2rKok5dbU1ughnh58fdo&client_id=9895ec24-c09a-44af-a733-0510533a6ef8')

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

