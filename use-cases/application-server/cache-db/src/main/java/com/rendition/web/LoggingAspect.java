package com.rendition.web;

import org.jboss.aop.joinpoint.ConstructorInvocation;
import org.jboss.aop.joinpoint.FieldWriteInvocation;
import org.jboss.aop.joinpoint.MethodInvocation;

public class LoggingAspect
{
    public Object log(ConstructorInvocation invocation) throws Throwable
    {
        try
        {
            System.out.println(" AOP Enabled");
            System.out.println("C: Creating BankAccount using constructor " + invocation.getConstructor());
            System.out.println("C: Account number: " + invocation.getArguments()[0]);
            return invocation.invokeNext();
        }
        finally
        {
            System.out.println("C: Done");
        }
    }

    public Object log(MethodInvocation invocation) throws Throwable
    {
        try
        {
            System.out.println(" AOP Enabled");
            System.out.println("M: Calling method " + invocation.getMethod().getName());
            System.out.println("M: Request Params " + invocation.getArguments()[0]);
            return invocation.invokeNext();
        }
        finally
        {
            System.out.println("M: Done");
        }
    }

    public Object log(FieldWriteInvocation invocation) throws Throwable
    {

        System.out.println(" AOP Enabled");
        try
        {
            return invocation.invokeNext();
        }
        finally
        {
            System.out.println("AOP Done");
        }
    }
}


