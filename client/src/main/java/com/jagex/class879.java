package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agn")
public class class879 extends CutsceneAction {

	@ObfuscatedName("agn.n")
	public final int field10321;

	@ObfuscatedName("agn.m")
	public final int field10322;

	public class879(Packet arg0) {
		super(arg0);
		this.field10321 = arg0.g2();
		this.field10322 = arg0.g1();
	}

	@ObfuscatedName("agn.n(I)V")
	public void method2890() {
		Statics.field1798.method3179(this.field10321, this.field10322);
	}
}
