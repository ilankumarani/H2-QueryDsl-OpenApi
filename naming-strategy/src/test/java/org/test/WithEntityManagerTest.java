package org.test;

import lombok.RequiredArgsConstructor;
import org.ilan.ApplicationMain;
import org.ilan.config.DbConfig;
import org.ilan.entity.Employee;
import org.ilan.repository.EmployeeRepository;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Order(1)
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE
        , classes = {ApplicationMain.class}
        , properties = {"withEntityManager=true"}
)
@Import({DbConfig.class})
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class WithEntityManagerTest extends BaseTest{

    private final EmployeeRepository employeeRepository;

    @Test
    public void test() {
        super.test(employeeRepository);
    }
}
