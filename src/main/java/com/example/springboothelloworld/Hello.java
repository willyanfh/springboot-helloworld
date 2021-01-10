package com.example.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World!!!");
        sb.append("<br>");
        sb.append("\n");
        sb.append("<br>");
        String currnetTime = getTime();
        sb.append(currnetTime);

        return sb.toString();
    }

    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fmDate2 = simpleDateFormat2.format(date);
        System.out.println("时间按指定格式换字符串: " + fmDate2);
        return fmDate2;
    }
}
