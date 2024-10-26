package org.test;

import org.ilan.ApplicationMain;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE,
        classes = {ApplicationMain.class}
        ,properties = {"withEntityManager.enabled=true"})
public class WithEntityManager {

    @Test
    public void test(){

    }
}
