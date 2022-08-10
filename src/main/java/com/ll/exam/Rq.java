package com.ll.exam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;

        try {
            // 들어오는 데이터를 UTF-8로 해석하겠다
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        // 만들 HTML의 인코딩을 UTF-8로 하겠다
        resp.setCharacterEncoding("UTF-8");

        // 브라우저에게 만든 HTML이 UTF-8임을 알리겠다
        resp.setContentType("text/html; charset=utf-8");
    }
}
