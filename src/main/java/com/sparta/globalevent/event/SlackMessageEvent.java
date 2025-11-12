package com.sparta.globalevent.event;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SlackMessageEvent {
    private UUID orderId;
    private String customerName; // 수령 업체 담당자
    private String customerEmail;
    private String productName;
    private Integer quantity;
    private String request;
    private LocalDateTime orderTime; // 주문 승인 일자
    private String startHubName;
    private String endHubName;
    private Integer estimatedTime;
    private String slackAccountId; // 발송 허브 담당자
    private String deliveryManagerName; //배송 담당자 정보
    private String deliveryManagerEmail;
}
