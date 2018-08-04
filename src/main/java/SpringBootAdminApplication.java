import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdminApplication {
    static final Logger logger = LoggerFactory.getLogger(SpringBootAdminApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
        logger.info("SpringBootAdmin started");
    }
}