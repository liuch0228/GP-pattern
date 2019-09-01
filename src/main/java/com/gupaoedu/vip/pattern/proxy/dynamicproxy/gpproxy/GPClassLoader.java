package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 类自定义加载器,需要实现ClassLoader类的findClass方法
 */
    public class GPClassLoader extends  ClassLoader{
        private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        System.out.println("GPClassLoader-classPath="+classPath);
        this.classPathFile = new File(classPath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className  = GPClassLoader.class.getPackage().getName()+"." + name;
        if(null != classPathFile){
            //到类路径下找到之前写出去的文件(.java文件)
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{

                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len=in.read(buffer))!=-1){
                        out.write(buffer,0,len);
                    }
                    //返回一个class对象
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch(Exception e){
                    e. printStackTrace();
                }

            }
        }


        return super.findClass(name);
    }
}
