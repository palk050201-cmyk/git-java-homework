package ru.otus.java.basic.homework10.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ServerApplication {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8190)) {
            System.out.println("Сервер запущен на порту: 8190");
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try (socket) {
                        System.out.println("Клиент подключился");
                        byte[] buffer = new byte[8192];
                        List<Integer> numbers = new ArrayList<>();
                        String operation = null;
                        while (true) {
                            int n = socket.getInputStream().read(buffer);
                            String message = new String(buffer, 0, n);
                            System.out.println(message);
                            if (message.equals("/exit")) {
                                break;
                            } else if (message.equals("+") || message.equals("-") || message.equals("*") || message.equals("/")) {
                                socket.getOutputStream().write(("Вы ввели " + message + "\nВведите число").getBytes(StandardCharsets.UTF_8));
                                operation = message;
                                System.out.println(operation);
                            } else {
                                if (operation == null) {
                                    numbers.add(Integer.parseInt(message));
                                    socket.getOutputStream().write(("Вы ввели " + message + "\nВведите операцию: + , - , * , /").getBytes(StandardCharsets.UTF_8));
                                } else {
                                    numbers.add(Integer.parseInt(message));
                                    double result = getResult(numbers.getFirst(), numbers.getLast(), operation);
                                    message = String.valueOf(result);
                                    socket.getOutputStream().write(("Результат " + message).getBytes(StandardCharsets.UTF_8));
                                    break;
                                }
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static double getResult(int firstValue, int secondValue, String operation) {
        if (operation.equals("+")) {
            return firstValue + secondValue;
        } else if (operation.equals("-")) {
            return firstValue - secondValue;
        } else if (operation.equals("*")) {
            return firstValue * secondValue;
        } else if (operation.equals("/")) {
            if (secondValue == 0) {
                throw new ArithmeticException("Деление на 0!");
            }
            return (double) firstValue / secondValue;
        }
        throw new IllegalArgumentException("Неизвестная операция!");
    }
}


