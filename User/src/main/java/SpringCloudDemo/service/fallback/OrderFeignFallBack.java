package SpringCloudDemo.service.fallback;

import SpringCloudDemo.service.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @author Yan liang
 * @create 2019/9/17
 * @since 1.0.0
 */
@Component
public class OrderFeignFallBack implements OrderFeign{

    @Override
    public Object getOrder() {
        return "Order服务维护中";
    }
}