package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uo")
public class class577 implements class578 {

	@ObfuscatedName("uo.e")
	public final class770 field7281;

	public class577(class770 arg0) {
		this.field7281 = arg0;
	}

	@ObfuscatedName("uo.e(I)V")
	public void method9201() {
		ClientMessage var1 = Statics.method1604(ClientProt.SIMPLE_TOOLKIT_CHANGE, client.field10849.field794);
		var1.field11432.p1_alt1(this.field7281.getId());
		client.field10849.method934(var1);
	}
}
