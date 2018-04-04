package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Client;
import model.Conseiller;
import service.GestionClient;
import service.InterfaceGestionClient;
import service.InterfaceGestionConseiller;

/**
 * Servlet implementation class ServletAfficherListeClient
 */
@WebServlet("/ServletAfficherListeClient")
public class ServletAfficherListeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAfficherListeClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO affichage des listes clients
		HttpSession session = request.getSession();
		Conseiller conseiller = (Conseiller)session.getAttribute("conseillerconnecte");
		InterfaceGestionClient gestionclient = new GestionClient();
		List<Client> listclient=gestionclient.listerClient(conseiller.getIdconseiller());
        request.setAttribute("listclient", listclient);
        RequestDispatcher dispatcher;
        dispatcher=request.getRequestDispatcher("listeClients.jsp");
        dispatcher.forward(request, response);
		//doGet(request, response);
	}

}
