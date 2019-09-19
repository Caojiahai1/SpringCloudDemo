package SpringCloudDemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * Zuul过滤器
 * @author Yan liang
 * @create 2019/9/19
 * @since 1.0.0
 */
public class MyZuulFilter extends ZuulFilter{

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("路由后地址" + ctx.get(FilterConstants.REQUEST_URI_KEY));
        return null;
    }
}