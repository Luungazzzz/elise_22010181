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

WebUI.navigateToUrl('https://elise.vn/customer/account/login/')

WebUI.setText(findTestObject('Pages/page_dangnhap/input_dntk'), '22010181@st.phenikaa-uni.edu.vn')

WebUI.setEncryptedText(findTestObject('Pages/page_dangnhap/input_dnmk'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Pages/page_dangnhap/bt_dangnhap'))

WebUI.verifyElementPresent(findTestObject('Pages/page_taikhoan/tit_taikhoan'), 15)

WebUI.comment('Đăng nhập thành công với tài khoản test')

