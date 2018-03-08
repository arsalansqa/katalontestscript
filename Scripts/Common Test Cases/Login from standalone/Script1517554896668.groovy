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

WebUI.navigateToUrl(service2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('New Folder/Page_Sign In/div_TFS Server URL'))

WebUI.setText(findTestObject('New Folder/Page_Sign In/input_TFSServerURL'), server)

WebUI.click(findTestObject('New Folder/Page_Sign In/div_User ID'))

WebUI.setText(findTestObject('New Folder/Page_Sign In/input_EmailAddress'), user2)

WebUI.setText(findTestObject('New Folder/Page_Sign In/input_Password'), pass2)

WebUI.click(findTestObject('New Folder/Page_Sign In/input_btnSignIn'))

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/a_Browse'))

WebUI.verifyElementPresent(findTestObject('test case 2/Page_Modern Requirements4TFS 2018/a_Browse'), 0)

WebUI.verifyElementText(findTestObject('test case 2/Page_Modern Requirements4TFS 2018/a_Browse'), 'Browse', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/span_k-icon k-i-expand'))

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/span_rules verification'))

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/td'))

WebUI.waitForElementClickable(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/input_btnProjectNavigate'), 0)

WebUI.click(findTestObject('New Folder/Page_Modern Requirements4TFS 2018/input_btnProjectNavigate'))

WebUI.verifyElementText(findTestObject('test case 2/Page_Modern Requirements4TFS 2018/Page_Modern Requirements4TFS 2018/a_rules verification'), 
    'rules verification', FailureHandling.STOP_ON_FAILURE)

