package by.chernyavski.bootjava.repository;

import by.chernyavski.bootjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
