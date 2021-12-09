package com.dongck.utility;

import java.io.IOException;
import java.util.List;

public class StringUtil {

	public static void main(String[] args) throws IOException {
    	String strPath = "D:\\dev\\workspace\\utility\\src\\main\\resources\\inputFile\\ReadText.txt";
    	StringUtil.wrapStr(FileUtil.readTxt(strPath), "|");

	}
    public static void wrapStr(List<String> list) {wrapStr(list, ",'", "'");}
    public static void wrapStr(List<String> list, String strSide) {wrapStr(list, strSide, strSide);}
	public static void wrapStr(List<String> list, String strLeft, String strRight) {
		for (String str : list) {
			System.out.println(strLeft + str+ strRight);
		}
	}
	
}
