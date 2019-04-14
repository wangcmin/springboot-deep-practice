package com.zhangjianbing.story.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Ryan Zhang
 * @Title: MyAsyncServlet
 * @Description: 异步非阻塞Servlet
 * @date 2019/4/14
 * @From https://www.zhangjianbing.com
 */
@WebServlet(urlPatterns = "/my/async/servlet", asyncSupported = true)
public class MyAsyncServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("async");
                asyncContext.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("....");

    }

}
