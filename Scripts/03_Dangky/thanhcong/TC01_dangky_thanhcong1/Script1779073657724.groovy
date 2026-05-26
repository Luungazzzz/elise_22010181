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

WebUI.callTestCase(findTestCase('01_Common/TC_Common_01_motrinhduyet'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/page_trangchu/click_taikhoan'))

WebUI.click(findTestObject('Pages/page_dangnhap/click_taotk'))

WebUI.setText(findTestObject('Pages/page_dangky/input_Email'), 'luuthinga222004@gmail.com')

WebUI.setEncryptedText(findTestObject('Pages/page_dangky/input_matkhau'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Pages/page_dangky/input_nhaplaimk'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Pages/page_dangky/input_ho'), 'Lưu')

WebUI.setText(findTestObject('Pages/page_dangky/input_ten'), 'Ngà')

WebUI.selectOptionByValue(findTestObject('Pages/page_dangky/select_tinhtp'), '739', false)

WebUI.selectOptionByValue(findTestObject('Pages/page_dangky/select_quanhuyen'), '260', false)

WebUI.setText(findTestObject('Pages/page_dangky/input_diachi'), 'Phú Lâm')

WebUI.setText(findTestObject('Pages/page_dangky/input_sdt'), '978202400')

//WebUI.click(findTestObject('Pages/page_dangky/label_toidongy'))
WebUI.executeJavaScript('document.getElementById("privacy").click();', null)

WebUI.click(findTestObject('Pages/page_dangky/bt_taotaikhoan'))

WebUI.verifyElementVisible(findTestObject('Pages/page_dangky/tit_xacnhan'))

WebUI.closeBrowser()

