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

WebUI.navigateToUrl('http://asna:8080/tfs')

WebUI.maximizeWindow()

WebUI.click(findTestObject('embed login objects/Page_Projects - Microsoft Team Foun/span_DefaultCollection'))

WebUI.click(findTestObject('embed login objects/Page_Projects - Microsoft Team Foun/span_DefaultCollection'))

WebUI.click(findTestObject('embed login objects/Page_Projects - Microsoft Team Foun/a_12.4.1 Tfvc Scrum'))

WebUI.click(findTestObject('embed login objects/Page_Project Overview - Microsoft T/span_Work'))

WebUI.click(findTestObject('embed login objects/Page_Backlog items/span_FAQ'))

WebUI.click(findTestObject('embed login objects/Page_FAQ - Microsoft Team Foundatio/div_Password'))

WebUI.setText(findTestObject('embed login objects/Page_FAQ - Microsoft Team Foundatio/input_Password'), 
    'inte8GREAT')

WebUI.click(findTestObject('embed login objects/Page_FAQ - Microsoft Team Foundatio/input_ig-LoginDialog-signInBtn'))

WebUI.switchToFrame(findTestObject('Page_FAQ - Microsoft Team Foundatio/iframe_externalContentHost4'), 
    5)

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/span_New'))

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/span_Topic'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Modern Requirements4TFS 2018 (1)/input_ig-newfile-textbox-qwd-n'), 
    varA)

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (1)/input_ig-newfile-ok-button-qwd'))

WebUI.waitForElementVisible(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/span_New Question'), 
    7)

WebUI.click(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/span_New Question'))

WebUI.setText(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/input_qwd-newquestion-txtbox'), 
    varA)

WebUI.click(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/input_qwd-newquestion-okbtn'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (4)/div'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (2)/span_Add Answer'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (2)/span_New item'))

WebUI.setText(findTestObject('Page_Modern Requirements4TFS 2018 (2)/input_qwd-wititle-txtbox'), 
    varA)

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (2)/input_qwd-addwiBtn'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (5)/span_X'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (6)/div'))

WebUI.click(findTestObject('Page_Modern Requirements4TFS 2018 (6)/span_k-sprite qwd-openwiqwizar'))

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.click(findTestObject('Page_User Story 10251 122112 - Micr/div_vss_112'))

not_run: WebUI.click(findTestObject('Page_User Story 10251 122112 - Micr/div_vss_112'))

not_run: WebUI.setText(findTestObject('Page_FAQ - Microsoft Team Foundatio (1)/input_witc_57_txt'), 
    'user')

WebUI.setText(findTestObject('Page_FAQ - Visual Studio Team Servi (1)/input_witc_51_txt'), 
    '12345')

WebUI.click(findTestObject('Page_FAQ - Visual Studio Team Servi (1)/span_menu-item-icon bowtie-ico'))

not_run: WebUI.click(findTestObject('Page_FAQ - Microsoft Team Foundatio (2)/span_Save  Close'))

WebUI.click(findTestObject('Page_FAQ - Microsoft Team Foundatio (2)/span_ui-button-icon-primary ui'))

not_run: WebUI.click(findTestObject('Page_User Story 10251 122112aaaa -/span_menu-item-icon bowtie-ico'))

not_run: WebUI.closeWindowIndex(1)

not_run: WebUI.switchToWindowIndex(0)

not_run: WebUI.verifyElementText(findTestObject('Page_Modern Requirements4TFS 2018 (7)/a_test name 1'), 
    'test name1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/span_k-icon  k-i-arrow-60-down'))

WebUI.waitForElementVisible(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/span_Check In Changes'), 
    10)

WebUI.click(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/span_Check In Changes'))

WebUI.verifyElementVisible(findTestObject('test case 2/Page_Modern Requirements4TFS 2018 (1)/Page_Modern Requirements4TFS 2018/div_ig-filemngt-editbar-qwd-to'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

