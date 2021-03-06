package com.commerce.sn_monitor.domain.cdek;

import com.commerce.sn_monitor.domain.OrderItem;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdekPackage
{
	@JsonProperty("number")
	private String number;
	
	@JsonProperty("weight")
	private Integer weight;
	
	@JsonProperty("length")
	private Integer length;

	@JsonProperty("width")
	private Integer width;
	
	@JsonProperty("height")
	private Integer height;
	
	@JsonProperty("comment")
	private String comment;

	@JsonProperty("items")
	private List<CdekOrderItem> items;
}