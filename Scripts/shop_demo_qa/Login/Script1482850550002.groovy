import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/input__username'), 'elvayundra8@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/input__password'), 
    'K05tg1fO3DxAgjEwYm0XDapDaqgYxZT/kx7zMgJOpyQrTh6kvshl7w==')

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/shop_demo_qa/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Search Results for dress  ToolsQA Demo Site/a_Select options'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/select_Choose an optionBlackGrey'), 
    'grey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/select_Choose an optionLargeMediumSmallX-Large'), 
    'medium', true)

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/i_QTY_icon_plus'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/a_Search'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/input_Type and Press Enter to Search_s'), 
    'jeans')

WebUI.sendKeys(findTestObject('Object Repository/shop_demo_qa/Page_black ribbed short sleeve lettuce hem _efb789/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Search Results for jeans  ToolsQA Demo Site/a_Select options'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shop_demo_qa/Page_dark blue vice high waisted slash knee_034766/select_Choose an optionDark Blue'), 
    'dark-blue', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/shop_demo_qa/Page_dark blue vice high waisted slash knee_034766/select_Choose an option36373840'), 
    '37', true)

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_dark blue vice high waisted slash knee_034766/button_QTY_qty-increase'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_dark blue vice high waisted slash knee_034766/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_dark blue vice high waisted slash knee_034766/span_Cart(4)114.00'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Cart  ToolsQA Demo Site/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 
    'elva')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 
    'yundra rindyana')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 
    'PT DIKA ')

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/span_India'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 
    'jl margonda raya')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'depok')

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input_We Work All The Holidays_select2-sear_c9686a'), 
    'jawa ba')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), 
    '16423')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '089503089962')

WebUI.setText(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'elvayundra8@gmail.com')

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/shop_demo_qa/Page_Checkout  ToolsQA Demo Site/button_Place order'))

