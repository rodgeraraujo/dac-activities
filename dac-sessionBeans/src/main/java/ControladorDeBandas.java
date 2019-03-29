/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifpb.dac.sessionbeans.controller.BandController;
import br.edu.ifpb.dac.sessionbeans.model.Band;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rodger
 */
@WebServlet(name = "ControladorDeBandas", urlPatterns = {"/bandas"})
public class ControladorDeBandas extends HttpServlet {

    @EJB
    private BandController bandas;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorDeClientes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Listagem de Clientes </h1>");
//            out.println("<h2> ******** </h2>");
            printAllBands(out);
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void printAllBands(final PrintWriter out) {
        
        List<Band> bands = (List<Band>) bandas.allBands();
        for (int i = 0; i < bands.size(); i++) {
            out.println("<p>"+bands.get(i).getName()+"</p>");
        }
        
    }

}