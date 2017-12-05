package in.blogspot.codewithnikhil.gontu.annotation.controller;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter
{

    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws IOException
    {
        /**
         * if this method returns true then - application will further handle
         * the request. if this method returns false then - application will not
         * further handle the request.
         */

        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1)
        {
            /**
             * 1 means Sunday 2 means Monday ... 3 means Saturday
             */
            response.getWriter().write("The website is closed on sunday please try on other days");
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView)
    {
        /**
         * This method is called after spring has executed the request handler method for the request.
         */
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler,Exception ex)
    {
        /**
         * This method would be called after the response object is produced by the view for the request.
         */
        
    }
}
