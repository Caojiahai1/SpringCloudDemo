package SpringCloudDemo.conifg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yan liang
 * @create 2019/9/17
 * @since 1.0.0
 */
@Configuration
public class OrderRuleConfig {
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}