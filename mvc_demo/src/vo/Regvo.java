package vo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Regvo")
public class Regvo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String fn;
	private String ln;
	
		
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public String getLn() {
			return ln;
		}
		public void setLn(String ln) {
			this.ln = ln;
		}
		public String getFn() {
			return fn;
		}
		public void setFn(String fn) {
			this.fn = fn;
		}
		
	public Regvo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
