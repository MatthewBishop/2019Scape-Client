package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asu")
public class class1193 extends SubInterface {

	@ObfuscatedName("asu.w")
	public final int field12430;

	public class1193(int arg0, int arg1, int arg2) {
		super(arg0, arg1);
		this.field12430 = arg2;
	}

	@ObfuscatedName("asu.e(B)Z")
	public boolean method18183() {
		PlayerEntity var1 = client.field10944[this.field12430];
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.method3661(ClientTriggerType.field7265, this.field11571, -1, var1, this.field12430);
			return true;
		}
	}
}
