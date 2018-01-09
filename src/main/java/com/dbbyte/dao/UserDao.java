package com.dbbyte.dao;

import java.util.List;

import com.dbbyte.model.User;

public interface UserDao {

	public User create(final User user);

	public List<User> findAll();

	public User findUserById(int id);

}
