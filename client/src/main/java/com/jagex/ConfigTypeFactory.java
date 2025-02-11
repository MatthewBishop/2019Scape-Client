package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abs")
public interface ConfigTypeFactory {

	@ObfuscatedName("abs.o(B)Ljava/lang/Class;")
	Class type();

	@ObfuscatedName("abs.v(ILao;I)Lay;")
	ConfigType create(int arg0, ConfigTypeList arg1);
}
