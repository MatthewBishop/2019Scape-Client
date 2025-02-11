package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ja")
public class IDKTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ja.e")
	public final Js5 field2961;

	public IDKTypeFactory(Js5 arg0) {
		this.field2961 = arg0;
	}

	@ObfuscatedName("ja.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new IDKType(arg0, this.field2961);
	}

	@ObfuscatedName("ja.o(B)Ljava/lang/Class;")
	public Class type() {
		return IDKType.class;
	}
}
