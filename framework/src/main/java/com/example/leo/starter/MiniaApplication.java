package com.example.leo.starter;

import com.example.leo.beans.BeanFactory;
import com.example.leo.core.ClassScanner;
import com.example.leo.web.handler.HandlerManager;
import com.example.leo.web.server.TomcatServer;
import org.apache.catalina.LifecycleException;

import java.io.IOException;
import java.util.List;

public class MiniaApplication {
    public static void run(Class<?> cls, String[] args){
        System.out.println("Hello mini-spring");
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            tomcatServer.startServer();
            List<Class<?>> classList = ClassScanner.scanClasses(cls.getPackage().getName());
            BeanFactory.initBean(classList);
            HandlerManager.resolveMappintHandler(classList);
            classList.forEach(it->System.out.println(it.getName()));
        }catch (LifecycleException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
