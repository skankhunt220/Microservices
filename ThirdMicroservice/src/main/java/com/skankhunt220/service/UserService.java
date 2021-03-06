
package com.skankhunt220.service;

import org.springframework.stereotype.Service;

import com.skankhunt220.entity.User;
import com.skankhunt220.repository.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;

	public User create(User user) {
		return userRepository.save(user);
	}
	public User update(String id, User user) {
		return userRepository.queryUpdateLastName(id, user.getLastName());
	}
}