package com.sriteja.repository;


import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.sriteja.SpringbootJunitMockitoApiApplication;
import com.sriteja.model.Book;

/*@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = SpringbootJunitMockitoApiApplication.class)*/

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

	
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void test() throws Exception{
		
		System.out.println("=============");
	}

}
