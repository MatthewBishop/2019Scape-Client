package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agd")
public class class876 extends CutsceneAction {

	@ObfuscatedName("agd.n")
	public final int field10315;

	@ObfuscatedName("agd.m")
	public final int field10313;

	@ObfuscatedName("agd.k")
	public final String field10312;

	@ObfuscatedName("agd.f")
	public final int field10314;

	@ObfuscatedName("agd.w")
	public final int field10316;

	public class876(Packet arg0) {
		super(arg0);
		this.field10315 = arg0.g2();
		this.field10313 = arg0.g2();
		this.field10312 = arg0.gjstr();
		this.field10314 = arg0.g4s();
		this.field10316 = arg0.g2();
	}

	@ObfuscatedName("agd.n(I)V")
	public void method2890() {
		client.method8476(Statics.field4826, this.field10315, this.field10313, client.method3660(this.field10315, this.field10313, Statics.field4826), this.field10316, this.field10314, this.field10312);
	}
}
