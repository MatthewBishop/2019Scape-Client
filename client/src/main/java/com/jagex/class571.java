package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ud")
public class class571 implements SerializableEnum, class570 {

	@ObfuscatedName("ud.e")
	public static final class571 field7244 = new class571(0, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.n")
	public static final class571 field7243 = new class571(1, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT});

	@ObfuscatedName("ud.m")
	public static final class571 field7247 = new class571(2, "", new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.STRING});

	@ObfuscatedName("ud.k")
	public static final class571 field7245 = new class571(3, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.f")
	public final int field7246;

	@ObfuscatedName("ud.w")
	public final ScriptVarType[] field7242;

	public class571(int arg0, String arg1, ScriptVarType[] arg2) {
		this.field7246 = arg0;
		this.field7242 = arg2;
		ScriptVarType[] var4 = this.field7242;
		int var5 = 0;
		while (var5 < var4.length) {
			ScriptVarType var6 = var4[var5];
			switch(var6.baseType.id) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					var5++;
			}
		}
	}

	@ObfuscatedName("ud.n()I")
	public int getId() {
		return this.field7246;
	}
}
