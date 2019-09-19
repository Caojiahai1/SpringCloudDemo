package SpringCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul1App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Zuul1App.class, args);
    }
}
