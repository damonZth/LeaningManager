package com.zth.damon.Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damon on 2017/8/7.
 */
public class Context {

    private String content;

    private List<Expression> list = new ArrayList();

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void add(Expression eps) {
        list.add(eps);
    }

    public List<Expression> getList() {
        return list;
    }
}

