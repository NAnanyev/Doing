package main.servlet;

import main.abstractPlain.AbstractPlain;
import main.engine.Engine;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * Created by Ananyeu_NA on 13.07.2016.
 */
public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Engine engine = new Engine();
        String type = request.getParameter("Type");
        if (type == null) {


            ArrayList<AbstractPlain> plains = engine.getResults();
            request.setAttribute("collection", plains);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        } else {

            ArrayList<AbstractPlain> newCollection = new ArrayList<AbstractPlain>();
            for (AbstractPlain value : engine.getResults()) {
                if (type.equalsIgnoreCase(value.getType())) {
                    Integer length = value.getLength();
                    Integer heigth = value.getHeigth();
                    Integer maxFligth = value.getMaxFligth();
                    Integer maxSpeed = value.getMaxSpeed();
                    Integer people = value.getPeople();
                    Integer bomb = value.getBomb();
                    Integer weigth = value.getWeigth();
                    String typeNew = value.getType();
                    newCollection.add(new AbstractPlain(length, heigth, maxFligth, maxSpeed, people, bomb, weigth, typeNew));
                } else {
                    PrintWriter out = response.getWriter();
                    out.print("No such values");
                }
            }
            HttpSession session = request.getSession(true);
            session.setAttribute("newCollection", newCollection);
            RequestDispatcher requestDisp = getServletContext().getRequestDispatcher("/plainType.jsp");
            requestDisp.forward(request, response);
        }
    }
}
