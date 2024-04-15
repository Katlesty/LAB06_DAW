package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ProductoBean;

import java.io.IOException;
import java.io.PrintWriter;

public class SProcesoRegistro extends HttpServlet {
	PrintWriter print;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		ProductoBean producto = ProductoBean.busqueda(codigo);
		String vista;
		if (producto == null) {
			vista="error.jsp";
		}else {
			vista="resultado.jsp";
			request.setAttribute("dato", producto);
		}
		RequestDispatcher rd = request.getRequestDispatcher(vista); //LOGRA QUE JAVA LO TRATE COMO ARCHIVO
		rd.forward(request,response); //GENERA LA CONEXIÓN
	}

}
