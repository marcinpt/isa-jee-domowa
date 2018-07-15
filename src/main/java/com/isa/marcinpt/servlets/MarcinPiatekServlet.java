package com.isa.marcinpt.servlets;

import com.isa.marcinpt.dao.UsersRepositoryDaoBean;
import com.isa.marcinpt.model.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/MarcinPiatek")
public class MarcinPiatekServlet extends HttpServlet {

    @Inject
    private UsersRepositoryDaoBean usersRepositoryDaoBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        User userChoosedByUserName = usersRepositoryDaoBean.getUserByUserName(name);

        PrintWriter writer = resp.getWriter();

        if (userChoosedByUserName != null) {
            writer.println("User name: " + userChoosedByUserName.getUserName() + "\nTeam: " + userChoosedByUserName.getTeamName());
            writer.println(LocalDateTime.now());
        } else {
            writer.println("User does not exist");
        }
    }

}
