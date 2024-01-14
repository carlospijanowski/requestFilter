package br.com.seteideias.requestfilter.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ValidationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {

        boolean valid = false;

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String header = request.getHeader("api-key");

        if(!(header == "123")){
            return;
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
