package com.callor.iolist.utils;

import org.springframework.beans.factory.annotation.Qualifier;

public class NamesValue {

	public static class SESSION{
		public static final String USER = "USER";
	}
	
	@Qualifier
	public static class QUALIFER{
		public static final String USER_SERVICE_V1 = "userServiceV1";
	}
}
