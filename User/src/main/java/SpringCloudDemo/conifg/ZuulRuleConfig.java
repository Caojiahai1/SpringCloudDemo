package SpringCloudDemo.conifg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yan liang
 * @create 2019/9/19
 * @since 1.0.0
 */
@Configuration
public class ZuulRuleConfig {
    @Bean
    public IRule iRule() {
        return new RetryRule();
    }
}