package com.mjc_0306.test18_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "D:/Temp/test.jpg";
        String targetFileName = "D:/Temp/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        is.transferTo(os); // 아래 코드와 같은 의미(이 한줄로 대체 가능)
//        byte[] data = new byte[1024];
//        while(true) {
//            int num = is.read(data);
//            if(num == -1) break;
//            os.write(data, 0, num);
//        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
