package ankvel.edu.arclang.domain.projection;

import ankvel.edu.arclang.domain.User;
import org.springframework.data.rest.core.config.Projection;


/**
 * @author Aleksey Kovalenko
 */
@Projection(name = "noName",
        types = {User.class})
public interface UserWithNoNameProjection {
}
