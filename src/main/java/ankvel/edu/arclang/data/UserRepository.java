package ankvel.edu.arclang.data;

import ankvel.edu.arclang.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Aleksey Kovalenko
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
