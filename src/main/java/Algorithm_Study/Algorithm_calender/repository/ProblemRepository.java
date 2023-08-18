package Algorithm_Study.Algorithm_calender.repository;

import Algorithm_Study.Algorithm_calender.Domain.User;
import Algorithm_Study.Algorithm_calender.calender.Problem;

import java.util.List;
import java.util.Optional;

public interface ProblemRepository {
    Problem save(Problem problem);
    Optional<Problem> findById(Long id);
    Optional<Problem> findByurl(String url);
    List<Problem> findall();
}
