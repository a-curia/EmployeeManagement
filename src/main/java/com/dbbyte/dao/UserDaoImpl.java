package com.dbbyte.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.dbbyte.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	private final String INSERT_SQL = "INSERT INTO USERS(name, address, email) values(:name,:address,:email)";
	private final String FETCH_SQL = "select record_id, name, address, email from users";
	private final String FETCH_SQL_BY_ID = "select * from users where record_id = :id";

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User create(final User user) {

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("name", user.getName())
				.addValue("address", user.getAddress())
				.addValue("email", user.getEmail());
		namedParameterJdbcTemplate.update(INSERT_SQL, parameters, holder);
		user.setId(holder.getKey().intValue());
		return user;
	}
	

	
	

	public List<User> findAll() {
		return namedParameterJdbcTemplate.query(FETCH_SQL, new UserMapper());
	}

	public User findUserById(int id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(FETCH_SQL_BY_ID, parameters, new UserMapper());
	}
	
	
//	// same operations using JdbcTemplate
//	public User createJdbc(final User user) {
//		KeyHolder holder = new GeneratedKeyHolder();
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			@Override
//			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//				PreparedStatement ps = connection.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS);
//				ps.setString(1, user.getName());
//				ps.setString(2, user.getAddress());
//				ps.setString(3, user.getEmail());
//				return ps;
//			}
//		}, holder);
//
//		int newUserId = holder.getKey().intValue();
//		user.setId(newUserId);
//		return user;
//	}	
//	public List findAllJdbc() {
//		return jdbcTemplate.query(FETCH_SQL, new UserMapper());
//	}
//
//	public User findUserByIdJdbc(int id) {
//		return jdbcTemplate.queryForObject(FETCH_SQL_BY_ID, new Object[] { id }, new UserMapper());
//	}	

}

class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("record_id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		return user;
	}

}