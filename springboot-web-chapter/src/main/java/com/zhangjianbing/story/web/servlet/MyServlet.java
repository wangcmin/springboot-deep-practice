package com.zhangjianbing.story.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ryan Zhang
 * @Title: MyServlet
 * @Description: 传统servlet
 * @date 2019/4/14
 * @From https://www.zhangjianbing.com
 */
@WebServlet(urlPatterns = "/my/servlet")
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello");
    }

}
