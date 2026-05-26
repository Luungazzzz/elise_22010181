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

WebUI.navigateToUrl('https://elise.vn/checkout/cart/')

//WebUI.verifyElementPresent(findTestObject('Pages/page_giohang/click_xoa_sp'), 0)
// 3. VÒNG LẶP XÓA SẢN PHẨM TỰ ĐỘNG
// Chờ tối đa 3 giây xem có nút xóa không. Nếu không có (giỏ trống) -> bỏ qua không báo lỗi và dừng lặp.
while (WebUI.verifyElementPresent(findTestObject('Pages/page_giohang/click_xoa_sp'), 3, FailureHandling.OPTIONAL)) {
    // Thấy nút xóa thì bấm luôn
    WebUI.click(findTestObject('Pages/page_giohang/click_xoa_sp'))

    // Chờ 1 giây để trang web xử lý hiệu ứng biến mất của sản phẩm trước khi quét lại
    WebUI.delay(1)
}

WebUI.comment('giỏ hàng đã trống')

