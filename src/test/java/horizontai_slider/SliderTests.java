package horizontai_slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {
    @Test
    public void testSlider()
    {
        var sliderpage = homePage.clickOnHorizontalSlider();
        sliderpage.setSlider("4");
        assertEquals("you enter incorrect value", "4" ,sliderpage.getSliderValue());
    }
}
