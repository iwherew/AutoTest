package com.wang.selenium;

import java.io.*;
import java.util.Properties;

public class ProUtil {

    private Properties prop;
    private String filePath;

    /**
     * 构造方法
     * */
    public ProUtil(String filePath) throws Exception {
        this.filePath = filePath;
        this.prop = readProperties();
    }

    /**
     * 读取配置文件
     * */
    private Properties readProperties() throws Exception {
        Properties properties = new Properties();
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        BufferedInputStream in = new BufferedInputStream(inputStream);
        properties.load(in);
        return properties;
    }

    public String getPro(String key){
        if(prop.containsKey(key)){
            String k = prop.getProperty(key);
            return k;
        }else{
            System.out.println("获取的key值不对");
            return "";
        }

    }

//    public String getPro(String key) throws Exception {
//        Properties prop = new Properties();
//        File file = new File(filePath);
//        InputStream inputStream = new FileInputStream(file);
//        BufferedInputStream in = new BufferedInputStream(inputStream);
//        prop.load(in);
//        String username = prop.getProperty("key");
////        System.out.printntln(username);
//        return key;
//    }

//    public static void main(String[] args) throws Exception {
//        ProUtil pro = new ProUtil();
//        pro.getPro();
//    }
}
