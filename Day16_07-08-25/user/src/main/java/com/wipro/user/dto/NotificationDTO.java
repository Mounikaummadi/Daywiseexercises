package com.wipro.user.dto;

import com.wipro.user.entity.User;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDTO {
    private User user;
    private String action;
}
