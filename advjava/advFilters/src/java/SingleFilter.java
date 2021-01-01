import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author ADITYA
 */
@WebFilter(filterName = "SingleFilter", urlPatterns = {"/Hello1"})
public class SingleFilter implements Filter {
   

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Init method is called in"
               + " "+this.getClass().getName());
       System.out.println("----------------------------------------------------------------------------------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
System.out.println("doFilter is called in "+this.getClass().getName());
PrintWriter out =response.getWriter();

/*Better way is 
HttpServletRequest req=(HttpServletRequest)request;//typecast 
//and the use req
*/
out.println("Log Filter is invoked Before");
chain.doFilter(request, response);
String ip=request.getRemoteAddr();
out.println("Log Filter is invoked After");
out.println("IP: " +ip);
    }

    @Override
    public void destroy() 
    {
           System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Destroy method is called in"
               + " "+this.getClass().getName());
       System.out.println("----------------------------------------------------------------------------------------");   
    }
            
}