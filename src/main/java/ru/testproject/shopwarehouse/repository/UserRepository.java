package ru.testproject.shopwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.testproject.shopwarehouse.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByName(String name);
    User getUserById(Long id);
    void deleteUserById(Long id);
}
