package SpringCloudDemo.contorller;

import SpringCloudDemo.service.OrderFeign;
import SpringCloudDemo.service.ZuulFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yan liang
 * @create 2019/9/14
 * @since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private OrderFeign orderFeign;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ZuulFeign zuulFeign;

    @GetMapping("/getOrder")
    public Object getOrder() {
        return orderFeign.getOrder();
    }

    @GetMapping("/api/order/getOrder")
    public Object apiGetOrder() {
        return orderFeign.getOrder();
    }

    @GetMapping("/getOrder.do")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Object getOrderdo() {
        return restTemplate.getForObject("http://SERVER_ORDER/getOrder", Object.class);
    }

    private Object fallbackMethod() {
        return "系统异常";
    }

}