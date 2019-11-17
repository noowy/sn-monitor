package com.commerce.sn_monitor.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderDeliveryStatus
{

    @JsonProperty("Number")
    private String Number;

    @JsonProperty("State")
    private String State;

    @JsonProperty("OrderStatus")
    private String OrderStatus;

    @JsonProperty("StateDescription")
    private String StateDescription;

    @JsonProperty("OrderStatusDescription")
    private String OrderStatusDescription;

    @JsonProperty("StatusDate")
    private String StatusDate;

    @JsonProperty("ReturnPayment")
    private String ReturnPayment;
}
