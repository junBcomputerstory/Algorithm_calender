package Algorithm_Study.Algorithm_calender.repository;

import Algorithm_Study.Algorithm_calender.Domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByname(String name);
    List<User> findall();
}
