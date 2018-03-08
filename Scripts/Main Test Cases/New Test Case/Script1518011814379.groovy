import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://syedsaad:8080/tfs/QA%20Collection%202/_projects')

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_Projects - Microsoft Team Foun/span_QA Collection 2'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_Projects - Microsoft Team Foun/span_QA Collection 2'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_Projects - Microsoft Team Foun/a_RTM11.7.2-scrum'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_Project Overview - Microsoft T/span_Work'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_Backlog items/span_FAQ'))

WebUI.doubleClick(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_Password'))

WebUI.setText(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_Password'), 'inte8GREAT')

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_ig-LoginDialog-signInBtn'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/img_k-image'))

WebUI.setText(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_ig-newfile-textbox-qwd-n'), 
    '1234')

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_ig-newfile-ok-button-qwd'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_New Question'))

WebUI.setText(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_qwd-newquestion-txtbox'), 
    'ABC')

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_qwd-newquestion-okbtn'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_Add Answer'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_New item'))

WebUI.setText(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_qwd-wititle-txtbox'), '123')

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/input_qwd-addwiBtn'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_X'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/div_2697'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_k-sprite qwd-openwiqwizar'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_Save  Close'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_k-link'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/span_Check In Changes'))

WebUI.click(findTestObject('EMBEDDED NEW RECORDING/Page_FAQ - Microsoft Team Foundatio/div_Read-Only. This file is op'))

