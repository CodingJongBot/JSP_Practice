package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	public CalcServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		int num1 = 0, num2=0, result=0;
		String op = "+";
		
		if(request.getMethod().equals("POST")){
			num1=Integer.parseInt(request.getParameter("num1"));
			num2=Integer.parseInt(request.getParameter("num2"));
			op= request.getParameter("operator");
			result = new Calc(num1,num2,op).getResult();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String html = "<html>";
		html += "<head><title> Calc result </title></head>";		
		html += "<body><h1>Calc result</h1><h3>"+num1+op+num2+"="+result+"</h3></body>";
		html += "</html>";
		out.println(html);
		out.close();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
	}
}

