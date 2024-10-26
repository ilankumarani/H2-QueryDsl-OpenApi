package org.test;

import org.ilan.entity.Employee;
import org.ilan.repository.EmployeeRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseTest {

    public void namingStrategyTest(EmployeeRepository employeeRepository){
        Employee employee = Employee.builder().id(1L).email("ilankumaran.i@gmail.com").name("Ilankumaran").build();
        Employee saved = employeeRepository.save(employee);

        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());

        optionalEmployee.ifPresent(e->{
            assertEquals(e, saved);
        });
    }
}
