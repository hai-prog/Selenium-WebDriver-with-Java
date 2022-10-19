package file_upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload()
    {
        var fileUploadPage = homePage.clickOnFileUpload();
        fileUploadPage.uploadFile("D:\\haidy\\webDriver_java\\resources\\chromedriver.exe");
        assertEquals("the file name is incorrect","chromedriver.exe",fileUploadPage.getFileName());
    }
}
