package com.piter.cards.mapper.requests;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class ResponseModel<T> {
	
	@NonNull
	private String status;
	private String message;
	private T data;
	private Long totalElements;
	private Integer totalPages;
	@Singular("item")
	private List<T> list;
	
	@Singular("error")
	private Map<Object, Object> errors;
		
}