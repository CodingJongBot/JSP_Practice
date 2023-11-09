package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalcServlet2")// "/jsp/CalcServlet2")
public class CalcServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	public CalcServlet2() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		String o=request.getParameter("operator");
		
		int num1 = (n1==null)?0:Integer.parseInt(n1);
		int num2 = (n2==null)?0:Integer.parseInt(n2);
		String op  = (o==null)?"+":o;
	
		int	result = new Calc(num1,num2,op).getResult();
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/calc2.jsp");
		request.setAttribute("result", Integer.toString(result));
		rd.forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
		
	}
}

