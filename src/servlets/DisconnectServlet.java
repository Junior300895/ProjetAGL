package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisconnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisconnectServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DecoServlet doPost");
		request.getSession().removeAttribute("acc");
		response.sendRedirect("index.jsp");
	}

}
