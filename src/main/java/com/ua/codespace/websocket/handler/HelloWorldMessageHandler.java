package com.ua.codespace.websocket.handler;


import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class HelloWorldMessageHandler extends AbstractWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("Received message via WebSocket: " + message.getPayload());
        System.out.println("Send message via WebSocket: " + "World!");
        Thread.sleep(1000);
        session.sendMessage(new TextMessage("World!"));
    }


    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("WebSocket is closed");
    }
}
