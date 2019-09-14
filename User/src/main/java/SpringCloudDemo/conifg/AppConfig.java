package SpringCloudDemo.conifg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yan liang
 * @create 2019/9/14
 * @since 1.0.0
 */
@Configuration
public class AppConfig {


    /**
     * LoadBalanced注解开启负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule iRule() {
//        return new RandomRule();
//    }
}