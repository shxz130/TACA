package com.taca.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by jetty on 17/9/20.
 */
@WebFilter(urlPatterns = "/admin/*", filterName = "adminLoginFilter")
public class AdminLoginFilter implements Filter{

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminLoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("AdminLoginFilter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        LOGGER.info("AdminLoginFilter destroy...");

    }
}
