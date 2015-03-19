/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cs313playspokemon;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
@WebServlet(name = "Stream", urlPatterns = {"/Stream"})
public class Stream extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CS 313 Plays Pokemon</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CS 313 Plays Pokemon</h1>");
            
            out.println("<object type='application/x-shockwave-flash' height='378' width='620' data='//www-cdn.jtvnw.net/swflibs/TwitchPlayer.swf' bgcolor='#000000'>");
            out.println("<param name='allowFullScreen' value='true' />");
            out.println("<param name='allowScriptAccess' value='always' />");
            out.println("<param name='allowNetworking' value='all' />");
            out.println("<param name='movie' value='//www-cdn.jtvnw.net/swflibs/TwitchPlayer.swf' />");
            out.println("<param name='flashvars' value='channel=weatherworn&auto_play=true&start_volume=25' />");
            out.println("</object>");
            
            out.println("<iframe frameborder='0' scrolling='no' id='chat_embed' src='http://www.twitch.tv/weatherworn/chat' height='500' width='350'>");
            out.println("</iframe>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
