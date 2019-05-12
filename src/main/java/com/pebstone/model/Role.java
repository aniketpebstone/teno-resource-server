package com.pebstone.model;

import java.util.Arrays;
import java.util.Optional;

public enum Role {

		ADMIN(1), TEACHER(2), PARENT(3), STUDENT(4), TENO_ADMIN(5),TENO_DEV(6);
		public final int	value;

		private Role(int value)
		{
			this.value = value;
		}
		public static Optional<Role> valueOf(int value) {
	        return Arrays.stream(values())
	            .filter(role -> role.value == value)
	            .findFirst();
	    }
	
}
