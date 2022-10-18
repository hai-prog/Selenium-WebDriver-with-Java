package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownListPage;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption()
    {
      var dropdownListPage= homePage.clickDropdown();
      dropdownListPage.selectFromDropDown("Option 2");
      var selectedOptions =dropdownListPage.getSelectedOptions();
      assertEquals( "there are more than one option is selected" , 1 , selectedOptions.size() );
      assertTrue("option not selected",selectedOptions.contains("Option 2"));
    }
}
