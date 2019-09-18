package SpringCloudDemo.contorller;

import SpringCloudDemo.service.OrderFeign;
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

    @GetMapping("/getOrder")
//    @HystrixCommand
    public Object getOrder() {
        return orderFeign.getOrder();
    }

    @GetMapping("/getOrder.do")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Object getOrderdo() {
        return restTemplate.getForObject("http://SERVER-ORDER/getOrder", Object.class);
    }

    private Object fallbackMethod() {
        return "系统异常";
    }

}