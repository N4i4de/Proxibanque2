package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Conseiller;
import service.GestionConseiller;
import service.InterfaceGestionConseiller;

/**
 * identification du conseiller
 * MVC pour renvoyer soit sur la liste client (login et mot de passe correct) 
 * soit sur une page erreur (login correct, mais mot de passe incorrect) (c'est à dire si la méthode GestionConseiller.CheckConseiller renvoie un conseiller avec un id=0)
 * Servlet implementation class ServletIdentificationConseiller
 */
@WebServlet("/ServletIdentificationConseiller")
public class ServletIdentificationConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIdentificationConseiller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("pouet ! la servlet identification conseiller est connectée !");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO faire une méthode qui identifie le conseiller et le met en session
		InterfaceGestionConseiller gestionconseiller=new GestionConseiller();
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		Conseiller conseiller = gestionconseiller.CheckConseiller(login, password);
		HttpSession session=request.getSession();
		RequestDispatcher dispatcher;
		if (conseiller.getIdconseiller()==0) {
			dispatcher=request.getRequestDispatcher("erreur.jsp");
			dispatcher.forward(request, response);
			
		}else {
			session.setAttribute("conseillerconnecte", conseiller);
			dispatcher=request.getRequestDispatcher("ServletAfficherListeClient");
			dispatcher.forward(request, response);
		}
		
	}

}
