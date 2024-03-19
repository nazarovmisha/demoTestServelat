import javax.servlet.*;
import java.io.IOException;


public class TestFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String ipAddress = servletRequest.getRemoteAddr();
        System.out.println(ipAddress);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy(){

    }
}



