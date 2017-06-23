package ankvel.edu.arclang;

import ankvel.edu.arclang.data.DataPackage;
import ankvel.edu.arclang.domain.DomainPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {DataPackage.class})
@EntityScan(basePackageClasses = {DomainPackage.class})
public class ArclangApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArclangApplication.class, args);
    }
}
