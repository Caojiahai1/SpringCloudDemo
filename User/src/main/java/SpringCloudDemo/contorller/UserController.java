package SpringCloudDemo.contorller;

import SpringCloudDemo.service.OrderFeign;
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
    public Object getOrder() {
        return orderFeign.getOrder();
    }

    @GetMapping("/getOrder.do")
    public Object getOrderdo() {
        return restTemplate.getForEntity("http://SERVER-ORDER", Object.class);
    }

}