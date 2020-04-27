package com.yzl.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 9:39
 * @Version: 1.0
 */
@Component//一定不要少了
public class LoginFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * pre：在请求路由之前执行
     * route：在请求路由时调用
     * post：请求路由之后调用， 也就是在route和errror过滤器之后调用
     * error：处理请求发生错误时调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;//返回值是int，会根据返回值进行定义过滤器，值越小，优先级越高
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
    //定义 过滤功能
    @Override
    public Object run() throws ZuulException {

        //如果说请求带token值，则表示已经登陆过
        //1.获取请求上下文
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        //如果说请求带了token，则表示已经登陆过了
        if(token==null){
            logger.warn("此操作需要先登陆系统");
            //没有登录，则不进路由进行路由转发
            context.setSendZuulResponse(false);//拒绝访问
            context.setResponseStatusCode(200);//响应状态码
            try {
                context.getResponse().getWriter().write("token is empty...");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("通过会进行转发");
        //通过会进行转发
        return null;
    }
}
