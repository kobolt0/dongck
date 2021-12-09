package com.tistory.jeongpro;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class WriteText1 {
    public static void main(String[] args){
        try{
            //파일 객체 생성
            File file = new File("D:\\dev\\workspace\\utility\\src\\main\\resources\\outputFile\\WriteText1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
            if(file.isFile() && file.canWrite()){
                //쓰기
                bufferedWriter.write("문자열 추가1");
                //개행문자쓰기
                bufferedWriter.newLine();
                bufferedWriter.write("문자열 추가2");
                
                bufferedWriter.close();
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
