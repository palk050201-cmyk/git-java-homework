package ru.otus.java.basic.homework10.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8190)) {
            byte[] buffer = new byte[8192];

            while (true) {
                String message = scanner.nextLine();
                if (message.equals("/exit")) {
                    socket.close();
                    break;
                }
                socket.getOutputStream().write(message.getBytes(StandardCharsets.UTF_8));

                int n = socket.getInputStream().read(buffer);
                String response = new String(buffer, 0, n);
                System.out.println(response);
                if (response.startsWith("Результат")) {
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
