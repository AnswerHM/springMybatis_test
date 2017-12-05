/**
 * Dec 5, 2017
 */
package com.humin.sm_test.mapper;

import java.util.List;

import com.humin.sm_test.bean.User;

/** 
 * @ClassName: UserMapper 
 * @Description: 
 * @author humin 
 * @date Dec 5, 2017 4:27:21 PM 
 *  
 */
public interface UserMapper {
	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();

}
