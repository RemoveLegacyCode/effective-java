import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableCaching
@EnableWebMvc
@SpringBootApplication
public class VineAppPcsApplication {
    public static void main(String[] args) {
        SpringApplication.run(VineAppPcsApplication.class, args);
    }
}
