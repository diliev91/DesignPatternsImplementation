package com.exercise.patterns.structural.proxy;

import com.exercise.patterns.IPatternExample;

/*
Proxy: https://sourcemaking.com/design_patterns/proxy
 */
public class ProxyPatternExample implements IPatternExample {

    @Override
    public void run() {
        System.out.println("Proxy example.");
        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        proxy.doIt();
    }
}
