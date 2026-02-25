package com.mjc_0225;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class NintendoGame {
	private String name;
	private Grade grade;
	private Integer price;
}
