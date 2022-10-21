package java_script_tests;

import base.BaseTests;
import org.testng.annotations.Test;

public class JSTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clicOnLargeDeepDOM().scrollTheTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }


}
