package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agq")
public class SeqTypeFactory extends class166 {

	public SeqTypeFactory(ConfigTypeList arg0, class442 arg1, class442 arg2, class442 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agq.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new SeqType(arg0, this);
	}

	@ObfuscatedName("agq.o(B)Ljava/lang/Class;")
	public Class type() {
		return SeqType.class;
	}
}