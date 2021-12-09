package com.dongck.utility;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static void main(String[] args) throws IOException {
    	String strPath = "D:\\dev\\workspace\\utility\\src\\main\\resources\\inputFile\\ReadText.txt";
    	StringUtil.wrapStr(readTxt(strPath), "|");
    	;
	}
	
	public static List<String> readTxt(String strPath) throws IOException{return readTxt(strPath, StandardCharsets.UTF_8);	}
    public static List<String> readTxt(String strPath, Charset cs) throws IOException{
        //파일 객체 생성
        Path path = Paths.get(strPath);
        //파일 내용담을 리스트 
        List<String> list = new ArrayList<String>();
            list = Files.readAllLines(path,cs);
        return list;
    }

}
