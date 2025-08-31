package com.wipro.notificationservice.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDTO {
    private User user;
    private String action;
}
