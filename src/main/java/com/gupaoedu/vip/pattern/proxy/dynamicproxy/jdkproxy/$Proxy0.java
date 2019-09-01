package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)

import com.gupaoedu.vip.pattern.proxy.Person;
import java.lang.reflect.*;
//通过Jad工具反编译$Proxy0.class得到的类:这个类继承了Proxy实现了Person接口,重写了接口中的findLove方法
public final class $Proxy0 extends Proxy
        implements Person
{

    public $Proxy0(InvocationHandler invocationhandler)
    {
        super(invocationhandler);
    }

    public final boolean equals(Object obj)
    {
        try
        {
            return ((Boolean)super.h.invoke(this, m1, new Object[] {
                    obj
            })).booleanValue();
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
        return false;//自己加的return,解决idea报错问题
    }

    public final void findLove()
    {
        try
        {
            /*调用了 Proxy类的h.invoke方法,Proxy类的h定义是
             protected InvocationHandler h;
              return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(), this);
              这里的参数h传递的是this,因此这里的h就是JDKMeiPo,参数m3是findLove方法,
              因此调用invoke方法,就是调用JDKMeiPo的findLove方法
            * */
            super.h.invoke(this, m3, null);
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final String toString()
    {
        try
        {
            return (String)super.h.invoke(this, m2, null);
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
        return ""; //自己加的return,解决idea报错问题
    }

    public final int hashCode()
    {
        try
        {
            return ((Integer)super.h.invoke(this, m0, null)).intValue();
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
        return 0;//自己加的return,解决idea报错问题
    }

    private static Method m1;
    private static Method m3;
    private static Method m2;
    private static Method m0;

    static
    {
        try
        {
            //把代理目标对象中的所有方法扫描出来保存
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] {
                    Class.forName("java.lang.Object")
            });
            m3 = Class.forName("com.gupaoedu.vip.pattern.proxy.Person").getMethod("findLove", new Class[0]);
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
        }
        catch(NoSuchMethodException nosuchmethodexception)
        {
            throw new NoSuchMethodError(nosuchmethodexception.getMessage());
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
