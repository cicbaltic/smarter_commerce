package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(urlPatterns={"/home",".do"}, initParams = {@WebInitParam(name="ProductName", value="Bandymas")})
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String appName = "My app";
    
    @Override
	public void init() throws ServletException {
    	appName = getInitParameter("ProductName");
	}


	/**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name == null){
        	response.getWriter().printf("Please enter the name in URI");
        
        }else {
        	response.setContentType("text/xml");
        	response.getWriter().printf("<name>%s</name>", appName);
        	
        }
        
    }

}
