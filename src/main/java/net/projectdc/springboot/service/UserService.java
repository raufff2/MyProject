package net.projectdc.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.projectdc.springboot.model.User;

public interface UserService {
	List<User> getAllEmployees();
	void saveEmployee(User employee);
	User getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
