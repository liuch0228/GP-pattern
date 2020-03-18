package com.lchtest.pattern.proxy.dynamicproxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class GPProxy {
    public static final String ln = System.lineSeparator();//换行符\r\n


    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h)
            throws IllegalArgumentException {
        try{
            //1.动态生成源代码.java文件
           String src = generateSrc(interfaces);
//           System.out.println(src);
           //2.Java文件输出到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src); //源代码写到磁盘 targe目录下
            fw.flush();
            fw.close();
           //3.把生成的java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null, Charset.defaultCharset());
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null,null,null,iterable);
            task.call();
            manager.close();
            //4、编译生成的.class文件加载到JVM中来
            Class proxyClass = loader.findClass("$Proxy0");//这里需要完成GPClassLoader类
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();
            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;" + ln);
        sb.append("import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" +ln);

        sb.append("GPInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GPInvocationHandler h) {" + ln);
            sb.append("this.h = h;" + ln);
        sb.append("}") ;//end of consutructor

        //根据接口生成findLove方法
        /*
        * public final void findLove(int i)
    {
        try
        {
            super.h.invoke(this, m3, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
        * */


        for(Method m:interfaces[0].getMethods()){
            Type[] paramTypeList = m.getGenericParameterTypes();// 方法的参数列表
            // 获取形参的类型
            Type type = paramTypeList[0];
            sb.append(ln + "public " + m.getReturnType().getName() +" " + m.getName() + "("+ type + " i ){"  + ln);
                sb.append("try{" + ln);
                    sb.append("Method m =" +interfaces[0].getName() + ".class.getMethod(\""+ m.getName()+"\",new Class[]{" + type + ".class" +  "});" + ln);
                    sb.append("");
                    sb.append("this.h.invoke(this,m,new Object[]{i});" + ln);
                    sb.append("   }catch(Throwable e){" + ln);
                sb.append("e.printStackTrace(); " +ln);
                sb.append("}" + ln);//end of catch
            sb.append("}" + ln);
        }
        sb.append(ln+ "}"); //end of class
        return  sb.toString();
    }
}
