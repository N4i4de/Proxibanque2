package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.InterfaceDAOClient;
import model.Client;
import service.GestionClient;
import service.InterfaceGestionClient;

/**
 * Servlet implementation class ServletModifierClient
 * permet de récuperer les modifications entrées par le conseiller et de les integrer
 */
@WebServlet("/ServletModifierClient")
public class ServletModifierClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifierClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceGestionClient gestionclient = new GestionClient();
		HttpSession session = request.getSession();
		System.out.println("pouet !");
		Client clientmodif = new Client();
		Client clientbase=(Client)session.getAttribute("clientChoisi");
		clientmodif.setId(clientbase.getIdclient());
		clientmodif.setNom(request.getParameter("nom"));
		clientmodif.setPrenom(request.getParameter("prenom"));
		clientmodif.setEmail(request.getParameter("email"));
		clientmodif.setAdresse(request.getParameter("adresse"));
		clientmodif.setVille(request.getParameter("ville"));
		clientmodif.setCodePostal(request.getParameter("codepostal"));
		clientmodif.setTelephone(clientbase.getTelephone());
		gestionclient.modifierClient(clientmodif, clientbase.getIdclient());
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("validationModification.jsp");
		dispatcher.forward(request, response);
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceGestionClient gestionclient = new GestionClient();
		HttpSession session = request.getSession();
		Client clientmodif = new Client();
		Client clientbase=(Client)session.getAttribute("clientChoisi");
		clientmodif.setId(clientbase.getIdclient());
		clientmodif.setNom(request.getParameter("nom"));
		clientmodif.setPrenom(request.getParameter("prenom"));
		clientmodif.setEmail(request.getParameter("email"));
		clientmodif.setAdresse(request.getParameter("adresse"));
		clientmodif.setVille(request.getParameter("ville"));
		clientmodif.setCodePostal(request.getParameter("codepostal"));
		clientmodif.setTelephone(clientbase.getTelephone());
		gestionclient.modifierClient(clientmodif, clientbase.getIdclient());
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("validationModification.jsp");
		dispatcher.forward(request, response);
	//response.getWriter().append("Served at: ").append(request.getContextPath());
		//doGet(request, response);
	}

}
