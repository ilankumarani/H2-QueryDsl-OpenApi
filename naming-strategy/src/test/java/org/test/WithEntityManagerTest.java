package org.test;

import org.ilan.ApplicationMain;
import org.ilan.config.DbConfig;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Order(1)
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class}
        , properties = {"withEntityManager=true"}
)
@Import({DbConfig.class})
public class WithEntityManagerTest {

    @Test
    public void test() {

    }
}
