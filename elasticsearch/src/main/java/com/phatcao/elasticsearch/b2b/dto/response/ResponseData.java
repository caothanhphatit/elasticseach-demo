package com.phatcao.elasticsearch.b2b.dto.response;

import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;


@Data
public class ResponseData <T> implements Serializable
{

	private static final long serialVersionUID = -4772269966698720444L;

	private boolean status;
	private String message;
	private T data;

	public ResponseData()
	{
	}

}
