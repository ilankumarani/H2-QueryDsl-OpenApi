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
import org.springframework.context.annotation.Import;

@Order(1)
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class}
        , properties = {"withEntityManager=true"}
)
@Import({DbConfig.class})
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@DisplayName("EntityManager bean is created by DEVELOPER")
public class WithEntityManagerTest extends BaseTest{

    private final EmployeeRepository employeeRepository;

    @DisplayName("Test Query generated")
    @Test
    public void test() {
        namingStrategyTest(employeeRepository);
    }
}
