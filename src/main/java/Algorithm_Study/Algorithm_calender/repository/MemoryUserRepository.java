package Algorithm_Study.Algorithm_calender.repository;

import Algorithm_Study.Algorithm_calender.Domain.User;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class MemoryUserRepository implements UserRepository {

    private final EntityManager em;

    public MemoryUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByname(String name) {
        return Optional.empty();
    }

    @Override
    public List<User> findall() {
        return null;
    }
}
