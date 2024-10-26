package org.test;

import org.ilan.ApplicationMain;
import org.ilan.config.DbConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class, DbConfig.class}
        , properties = {"with=false"}
)
public class WithOutEntityManager {

    @Test
    public void test(){

    }
}
