package SpringCloudDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yan liang
 * @create 2019/9/14
 * @since 1.0.0
 */
@RestController
public class OrderController {

    @GetMapping("/getOrder")
    public Object getOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("value", "Order");
        return map;
    }
}