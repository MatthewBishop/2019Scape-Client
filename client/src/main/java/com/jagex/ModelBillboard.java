package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dj")
public class ModelBillboard {

	@ObfuscatedName("dj.e")
	public final int field1653;

	@ObfuscatedName("dj.n")
	public final int field1654;

	@ObfuscatedName("dj.m")
	public final int field1655;

	@ObfuscatedName("dj.k")
	public final int field1656;

	public ModelBillboard(int arg0, int arg1, int arg2, int arg3) {
		this.field1653 = arg0;
		this.field1654 = arg1;
		this.field1655 = arg2;
		this.field1656 = arg3;
	}

	@ObfuscatedName("dj.e(II)Ldj;")
	public ModelBillboard method2659(int arg0) {
		return new ModelBillboard(this.field1653, arg0, this.field1655, this.field1656);
	}
}
