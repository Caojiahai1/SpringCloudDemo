package SpringCloudDemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yan liang
 * @create 2019/9/19
 * @since 1.0.0
 */
@FeignClient(name = "ZUUL")
public interface ZuulFeign {
    @RequestMapping("/getOrder")
    public Object getOrder();
}