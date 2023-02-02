package io.openmaru.test.web;


import io.openmaru.test.util.Log;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {
    @Override
    public void init() {
        Log.info("[init] " + getClass().getName() + " 시작");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        exec(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        exec(request, response);
    }

    private void exec(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Log.info("[exec] getMethod: " + request.getMethod());
        Log.info("[exec] getRequestURI: " + request.getRequestURI());
        Log.info("[exec] getQueryString: " + request.getQueryString());
        Log.info("[exec] getRemoteAddr: " + request.getRemoteAddr());
        Log.info("[exec] getContentType: " + request.getContentType());
        Log.info("[exec] getContentLength: " + request.getContentLength());
        Log.info("[exec] getParameter name: " + request.getParameter("name"));
        Log.info("[exec] getParameter age: " + request.getParameter("age"));

        response.setContentType("text/html;charset=UTF-8");

        // 업무 로지 작성 (예로 DBMS 에서 데이터 조회 후 출력)
        /*try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        response.getWriter().print("Hello, World!");
    }

    @Override
    public void destroy() {
        Log.info("[destroy] " + getClass().getName() + " 종료");
    }
}
