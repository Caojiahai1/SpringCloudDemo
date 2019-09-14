package SpringCloudDemo.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yan liang
 * @create 2019/9/14
 * @since 1.0.0
 */
@FeignClient(name = "SERVER-ORDER")
public interface OrderFeign {

    @RequestMapping("/getOrder")
    public Object getOrder();
}