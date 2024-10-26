package org.test;

import lombok.RequiredArgsConstructor;
import org.ilan.ApplicationMain;
import org.ilan.config.DbConfig;
import org.ilan.repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Order(1)
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class, DbConfig.class}
        , properties = {"withEntityManager=false"}
)
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@DisplayName("EntityManager bean is created by SPRING")
public class WithOutEntityManagerTest extends BaseTest {

    private final EmployeeRepository employeeRepository;

    @DisplayName("Test Query generated")
    @Test
    public void test() {
        namingStrategyTest(employeeRepository);
    }
}
