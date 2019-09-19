package SpringCloudDemo;

import SpringCloudDemo.conifg.OrderRuleConfig;
import SpringCloudDemo.conifg.ZuulRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
// 指定不同服务使用不同的负载均衡策略
@RibbonClients({
    @RibbonClient(name = "SERVER-ORDER",configuration = OrderRuleConfig.class),
    @RibbonClient(name = "ZUUL", configuration = ZuulRuleConfig.class)
})
public class UserApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApp.class, args);
    }
}
