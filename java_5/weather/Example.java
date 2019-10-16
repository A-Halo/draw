package weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;


public class Example {
    public static void main(String args[]) throws Exception{
        try{
            URL url = new URL("http://www.weather.com.cn/data/cityinfo/101200801.html");//由网址创建URL对象
            InputStreamReader isReader =  new InputStreamReader(url.openStream(),"UTF-8");
            BufferedReader br = new BufferedReader(isReader);
            String str;
            while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
        isReader.close();
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    
}
}
