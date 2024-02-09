package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCookieValue extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/htl;charset=utf-8");
	PrintWriter out = response.getWriter();
	Cookie[] allValues = request.getCookies();
	for (int i = 0; i < allValues.length; i++) {
		if(allValues[i].getName().equals("cookieTest")) {
			out.println("Cookie �� �������� :" + URLDecoder.decode(allValues[i].getValue(), "utf-8"));
		}
	}
   }

}
