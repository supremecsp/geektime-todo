package com.github.dreamhead.todo.api;

import com.github.dreamhead.todo.Bootstrap;
import com.github.dreamhead.todo.api.repository.TodoItemJpaRepository;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@CucumberContextConfiguration
@SpringBootTest(classes = Bootstrap.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Transactional
@Rollback
@TestPropertySource("classpath:application.yml")
public class SpringIntegrationTest {
    @Autowired
    protected TodoItemJpaRepository repository;
}
