package com.diviso.servease.test.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import com.diviso.servease.entity.Customer;
import com.diviso.servease.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CustomerRepositoryTest {
	
	@Autowired
	CustomerRepository repository;

	@Test
	public void repositoryTest() {
		Customer c = repository.findById(6);
		assertThat(c.getName()).isEqualTo("AjmalAju");

	}

	@Test
	public void testCase() {
		Customer c = repository.findById(5);
		assertThat(c.getCountry()).isEqualTo("india");

	}

}
