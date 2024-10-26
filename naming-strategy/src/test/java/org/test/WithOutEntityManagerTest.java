package org.test;

import org.ilan.ApplicationMain;
import org.ilan.config.DbConfig;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Order(1)
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class, DbConfig.class}
        , properties = {"withEntityManager=false"}
)
public class WithOutEntityManagerTest {

    @Test
    public void test(){

    }
}
