package org.test;

import org.ilan.ApplicationMain;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE, classes = {ApplicationMain.class})
public class BhhTest {

    @Test
    public void test(){

    }
}
