package jp.soramame.sugarlands.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = { ElementType.FIELD })
public @interface SLConfig {
	@interface BooleanValue{
		boolean value();
	}
}
