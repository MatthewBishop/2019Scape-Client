package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("in")
public class QuestTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("in.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new QuestType(arg0, arg1);
	}

	@ObfuscatedName("in.o(B)Ljava/lang/Class;")
	public Class type() {
		return QuestType.class;
	}
}
