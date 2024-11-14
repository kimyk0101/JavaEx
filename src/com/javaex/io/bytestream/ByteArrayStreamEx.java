//11.14
package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//	입력 소스
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//	출력 타겟
		byte[] outSrc = null;
		
		System.out.println("입력 소스:" + Arrays.toString(inSrc));
		//	스트림 개방
		try (	//	Auto Closeable (자동으로 닫아줌)
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
		) { 
			int data = 0;	//	입력 스트림으로부터 넘어오는 데이터 저장 변수
			
			while((data = bis.read()) != -1) {	//	read는 더 이상 불러올 데이터가 없으면 -1을 반환
				System.out.println("Read data:" + Integer.toBinaryString(data));
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();	//	다운캐스팅 후 배열로 변화 작업 수행
			System.out.println(Arrays.toString(outSrc));
		} catch (IOException e) {	//	어떤 예외가 남아있는지 확인
			e.printStackTrace();	
		} catch (Exception e) {		//	남아있는 예외
			e.printStackTrace();
		}

	}

}
