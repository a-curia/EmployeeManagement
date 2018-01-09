package com.dbbyte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dbbyte.dao.UserDao;
import com.dbbyte.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void createUser() {
		User savedUser = userDao.create(getUser());
		User userFromDb = userDao.findUserById(savedUser.getId());
		assertEquals(savedUser.getName(), userFromDb.getName());
		assertEquals(savedUser.getEmail(), userFromDb.getEmail());
	}

	@Test
	public void findAllUsers() {
		List users = userDao.findAll();
		assertNotNull(users);
		assertTrue(users.size() > 0);
	}

	@Test
	public void findUserById() {
		User user = userDao.findUserById(1);
		assertNotNull(user);
	}

	private User getUser() {
		User user = new User();
		user.setAddress("Romania, Bucharest");
		user.setEmail("mymail@gmail.com");
		user.setName("Adrian Curia");
		return user;
	}
	
}
