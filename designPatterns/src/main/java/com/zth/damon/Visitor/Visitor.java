package com.zth.damon.Visitor;

import java.util.Collection;

/**
 * Created by Damon on 2017/8/7.
 */
public interface Visitor {
    public void visitString(StringElement stringE);

    public void visiFloat(FloatElement floatElement);

    public void visitCollection(Collection collection);
}
