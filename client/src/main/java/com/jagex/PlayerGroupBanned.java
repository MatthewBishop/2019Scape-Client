package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ga")
public class PlayerGroupBanned {

	@ObfuscatedName("ga.e")
	public String field1936;

	public PlayerGroupBanned(Packet arg0, boolean arg1, boolean arg2) {
		if (arg1) {
			arg0.g8();
		}
		if (arg2) {
			this.field1936 = arg0.fastgstr();
		} else {
			this.field1936 = null;
		}
	}

	@ObfuscatedName("ga.e(B)Ljava/lang/String;")
	public String method3540() {
		return this.field1936;
	}
}
