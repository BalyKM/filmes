/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.servlet.movieServlet;

import br.edu.fjn.objeto.movie.Movie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kelvi
 */
@WebServlet(name = "movie.do", urlPatterns = {"/movie.do"})
public class MovieServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String diretor = req.getParameter("diretor");
        
        ServletContext ctx = getServletContext();
        
        Movie movie = new Movie(nome,diretor);
        List<Movie> listMovie = null;
        
        if (ctx.getAttribute("listMovie")!= null){
            listMovie = (List<Movie>) ctx.getAttribute("listMovie");
        }else{
            listMovie = new ArrayList();
        }
        listMovie.add(movie);
        ctx.setAttribute("listMovie", listMovie);
        resp.sendRedirect("filmes.jsp");
    }
}
