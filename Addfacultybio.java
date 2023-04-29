import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Addfacultybio")
public class Addfacultybio extends HttpServlet {

	private static final long serialVersionUID = -1198293905903423285L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		p.print("Values Updated.");
		Connection con=DBUtil.createconnection();
	String name=request.getParameter("name");
	String department=request.getParameter("department");
	String email=request.getParameter("email");
	String qualification=request.getParameter("qualification");
	String phoneno=request.getParameter("phoneno");
	String query1="insert into addfacultybio values(?,?,?,?,?)";
	try {
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setString(1,request.getParameter("name"));
		ps.setString(2,request.getParameter("department"));
		ps.setString(3,request.getParameter("email"));
		ps.setString(4,request.getParameter("qualification"));
		ps.setString(5,request.getParameter("phoneno"));
	int row=ps.executeUpdate();
	if(row>=1) {
		RequestDispatcher r=request.getRequestDispatcher("Facultysuccess.html");
			r.forward(request, response);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
	
	}
}