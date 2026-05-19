package com.type01.cookies.models.cookie;

import com.type01.cookies.models.common.IdName;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CookieDto implements IdName {
	private Long id;
	private String name;
}
