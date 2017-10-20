package cpf2Via;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cpfServlet")
public class CpfServlet {
	
	  protected String doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return CpfService.getCpf2ViaResponse();
		  
	  }

}
