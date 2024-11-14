//11.14
package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
//		InputStream is = null;
//		OutputStream os = null;
		
		try (
				InputStream is = new FileInputStream(source);
				OutputStream os = new FileOutputStream(target);
			)
		{
//			is = new FileInputStream(source);
//			os = new FileOutputStream(target);
			
			int data = 0;	//	InputStream으로부터 불러올 데이터의 저장 변수
			
			while ((data = is.read()) != -1) {	//	-1이 아닐동안 계속 저장
				os.write(data);
			}
			
			System.out.println("파일을 복사했어요."); //	1byte씩 복사해서 오래걸림
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾으 수없어요.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//	성공 실패와 관계없이 일단 실행
/*			try {	//	is.close와 os.close는 반드시 체크해줘야 하는 checked Exception임
				if (is != null) is.close();	//	함부로 닫으면 위험하기 때문에 에러가 남
				if (os != null) os.close();	//	따라서 예외처리 해주어야 함
			} catch (Exception e) {
				e.printStackTrace();
*/			}
		}
	}


