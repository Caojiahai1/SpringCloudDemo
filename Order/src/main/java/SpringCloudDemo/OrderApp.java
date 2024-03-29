package SpringCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderApp.class, args);
    }
}
