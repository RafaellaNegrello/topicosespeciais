

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet({ "/TrataRequisicao", "/HelloWorld", "/ola", "/servlets/hello", "/ola.html" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.print("Hello World!");
		saida.print("<h1>Esse é um servlet servindo html como response</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sessao = request.getSession();
		
		RequestDispatcher despachante = request.getRequestDispatcher("saida.jsp");
		
		String usuario = request.getParameter("nmusuario");
		String senha = request.getParameter("nmsenha");
		
		//response.getWriter().print("O usuário" + usuario);
		//response.getWriter().print("Com a senha" + senha);
		//response.getWriter().print("acabou de logar");
		
		//System.out.print("O usuário" + usuario);
		//System.out.print("Com a senha" + senha);
		//System.out.print("acabou de logar");
		if (usuario.equals("joao") & senha.equals("123")) {
			sessao.setAttribute("attrMensagem", "Usuário logado com sucesso!");
		} else {
			sessao.setAttribute("attrMensagem", "Usuário ou senha incorreta!");
		}
		
		despachante.forward(request, response);
		
	}

}
