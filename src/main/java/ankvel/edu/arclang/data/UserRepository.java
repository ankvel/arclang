package ankvel.edu.arclang.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ankvel.edu.arclang.domain.User;

/**
 * @author Aleksey Kovalenko
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
