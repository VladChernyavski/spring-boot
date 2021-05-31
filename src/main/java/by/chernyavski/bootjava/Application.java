package by.chernyavski.bootjava;

import by.chernyavski.bootjava.model.Role;
import by.chernyavski.bootjava.model.User;
import by.chernyavski.bootjava.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class Application implements ApplicationRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        userRepository.save(new User("vl@gmail.com", "Vlad", "Chernyavski", "12345", Set.of(Role.ROLE_ADMIN)));
        userRepository.save(new User("user@gmail.com", "User", "User", "12345", Set.of(Role.ROLE_USER)));
        System.out.println(userRepository.findAll());
    }

}
