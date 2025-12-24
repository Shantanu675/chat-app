package com.ChatApplication.chat.chat;

import lombok.*;

import java.net.SocketOption;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
