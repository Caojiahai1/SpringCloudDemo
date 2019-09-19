package SpringCloudDemo.config;

import SpringCloudDemo.filter.MyZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yan liang
 * @create 2019/9/19
 * @since 1.0.0
 */
@Configuration
public class ZuulFilterConfig {

    @Bean
    public MyZuulFilter myZuulFilter() {
        return new MyZuulFilter();
    }
}