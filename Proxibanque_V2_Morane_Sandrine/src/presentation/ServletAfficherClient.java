package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Client;
import service.GestionClient;
import service.InterfaceGestionClient;

/**
 * servlet intermediaire entre la liste de client et le formulaire de modification client
 * Servlet implementation class ServletAfficherClient
 */
@WebServlet("/ServletAfficherClient")
public class ServletAfficherClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAfficherClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InterfaceGestionClient gestionclient = new GestionClient();
		int idclient=Integer.parseInt(request.getParameter("idclient"));
		Client client = gestionclient.afficherClient(idclient);
		HttpSession session = request.getSession();
		session.setAttribute("clientChoisi", client);
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("modificationClient.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceGestionClient gestionclient = new GestionClient();
		int idclient=Integer.parseInt(request.getParameter("idclient"));
		Client client = gestionclient.afficherClient(idclient);
		HttpSession session = request.getSession();
		session.setAttribute("clientChoisi", client);
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("modificationClient.jsp");
		dispatcher.forward(request, response);
	}

}
