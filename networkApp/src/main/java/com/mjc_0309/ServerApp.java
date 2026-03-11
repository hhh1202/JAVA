package com.mjc_0309;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//서버소켓 생성
// 클라이언트 접속 기다리는 동작
// 클라이언트 접속이 되면 새로운 데이터소켓/클라이언트 통신소켓을 리턴
// 새로운 통신 소켓과 클라이언트가 통신하도록 프로그래밍 해야한다.
// 종료시에는 소켓과 자원을 모두 해제 해야한다.
public class ServerApp {
    private ServerSocket serverSocket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public ServerApp() throws IOException {
        this.serverSocket = new ServerSocket(59999);
        // 포트 번호로 서버 생성
//         Socket socket = serverSocket.accept();
    }

    public Socket accept() throws IOException {
        return this.serverSocket.accept();
        // 생성된 소켓으로 서버는 클라이언트 연결을 기다린다.
        // 클라이언트 연결이 되면 Socket 객체를 리턴한다.
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }

    public static void main(String[] args) {
        try {
            ServerApp sa = new ServerApp();
            Socket socket = sa.accept();
            // 클라이언트가 연결되면 socket(새로운 클라이언트 통신소켓)으로 통신이 가능

            String str = "Welcome server";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(str);
            dos.flush();
//            socket.getOutputStream().write(str.getBytes(StandardCharsets.UTF_8));
//            socket.getOutputStream().write("\n".getBytes(StandardCharsets.UTF_8));
//            socket.getOutputStream().flush();
            //서버가 클라이언트에게 데이터를 전송

//            byte[] buf = new byte[1024];
//            int num = socket.getInputStream().read(buf);
//            String msg = new String(buf);
//            System.out.println(msg);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println(msg);
            //클라이언트 통신소켓으로부터 데이터를 읽어서 출력

            socket.close(); // 클라이언트 통신소켓으로부터 데이터를 읽어서 출력
            sa.close(); // 클라이언트 통신소켓을 닫았다.

        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
