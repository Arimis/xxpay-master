package shop.payover.manage.security.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by jack on 2017/4/28.
 */
@Order(1) //@Order注解表示执行过滤顺序，值越小，越先执行
@WebFilter(filterName = "loginFilter", urlPatterns = {"/*"}) //需要在spring-boot的入口处加注解@ServletComponentScan, 如果不指定，默认url-pattern是/*
class LoginFilter implements Filter {

    private ArrayList<String> urlList;

    @Override
    public void init(FilterConfig config) throws ServletException {
        String urls = config.getInitParameter("avoid-urls");
        StringTokenizer token = new StringTokenizer(urls, ",");
        System.out.println("---------start filter --------------");

        urlList = new ArrayList<String>();

        while (token.hasMoreTokens()) {
            urlList.add(token.nextToken());

        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest)request).getSession();
        Principal principal = (Principal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        System.out.println("LoginFilter:" + JSON.toJSONString(principal, SerializerFeature.PrettyFormat));

        String username = "";
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        }
        else {
            username = principal.toString();
        }

        session.setAttribute("username", username);

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
