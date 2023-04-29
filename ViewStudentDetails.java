import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ViewStudentDetails")
public class ViewStudentDetails extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();	
		Connection c=DBUtil.createconnection();	
	    String query=" select * from addstudentbio";
	   try {
			
			p.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "<title>StudentInformation</title>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
					+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n"
					+ "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n"
					+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n"
					+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css1/util.css\">\r\n"
					+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css1/main.css\">\r\n"
					+ "<!-- CSS only -->\r\n"
					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
					+ "<meta name=\"robots\" content=\"noindex, follow\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "<div class=\"limiter\">\r\n"
					+ "<div class=\"container-table100\">\r\n"
					+ "<div class=\"wrap-table100\">\r\n"
					+ "<div class=\"table100 ver1 m-b-110\">\r\n"
					+ "<div class=\"table100-head\">\r\n"
					+ "<table>\r\n"
					+ "<thead>\r\n"
					+ "<tr class=\"row100 head\">\r\n"
					+ "<th class=\"cell100 column1\">Student Name</th>\r\n"
					+ "<th class=\"cell100 column2\">Roll No</th>\r\n"
					+ "<th class=\"cell100 column3\">Email</th>\r\n"
					+ "<th class=\"cell100 column4\">Phone_No</th>\r\n"
					+ "<th class=\"cell100 column5\">Department</th>\r\n"
					+ "</tr>\r\n"
					+ "</thead>\r\n"
					+ "</table>\r\n"
					+ "</div>\r\n"
					+ "<div class=\"table100-body js-pscroll\">\r\n"
					+ "<table>\r\n"
					+ "<tbody>\r\n");
			PreparedStatement ps=c.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
					while(rs.next()) {
					p.println("<tr class=\"row100 body\"><td class=\"cell100 column1\">"+rs.getString(1)+"</td>\r\n"
					+ "<td class=\"cell100 column2\">"+rs.getString(2)+"</td>\r\n"
					+ "<td class=\"cell100 column3\">"+rs.getString(3)+"</td>\r\n"
					+ "<td class=\"cell100 column4\">"+rs.getString(4)+"</td>\r\n"
					+ "<td class=\"cell100 column5\">"+rs.getString(5)+"</td>\r\n"
					+ "</tr>");
					}
			
			
	
			p.println("</tbody>\r\n"
					+ "</table>\r\n"
					+ "</div>\r\n"
					+ "</div>\r\n"
					+ "</div>\r\n"
					+ "</div>\r\n"
					+ "</div>\r\n"
					+ "<script>\r\n"
					+ "		$('.js-pscroll').each(function(){\r\n"
					+ "			var ps = new PerfectScrollbar(this);\r\n"
					+ "\r\n"
					+ "			$(window).on('resize', function(){\r\n"
					+ "				ps.update();\r\n"
					+ "			})\r\n"
					+ "		});\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "	</script>\r\n"
					+ "\r\n"
					+ "<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\r\n"
					+ "<script>\r\n"
					+ "  window.dataLayer = window.dataLayer || [];\r\n"
					+ "  function gtag(){dataLayer.push(arguments);}\r\n"
					+ "  gtag('js', new Date());\r\n"
					+ "\r\n"
					+ "  gtag('config', 'UA-23581568-13');\r\n"
					+ "</script>\r\n"
					+ "<script defer src=\"https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194\" integrity=\"sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==\" data-cf-beacon='{\"rayId\":\"75c694c958ac8465\",\"token\":\"cd0b4b3a733644fc843ef0b185f98241\",\"version\":\"2022.10.3\",\"si\":100}' crossorigin=\"anonymous\"></script>\r\n"
					+ "<!-- JavaScript Bundle with Popper -->\r\n"
					+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
