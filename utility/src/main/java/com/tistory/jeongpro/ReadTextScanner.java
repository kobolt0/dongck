package com.tistory.jeongpro;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class ReadTextScanner {
    public static void main(String[] args){
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\world\\Desktop\\javaprogramming\\FileIO\\Sample.txt");
            //스캐너로 파일 읽기
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
            //System.out.println(scan.useDelimiter("\\z").next());
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }
        
    }
}

