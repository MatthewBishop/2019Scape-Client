package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anc")
public class class1069 extends class714 {

	@ObfuscatedName("anc.n")
	public final Vector3 field11847 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anc.m")
	public final Vector3 field11848 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anc.k")
	public final Vector3 field11849 = new Vector3();

	public class1069(class274 arg0) {
		super(arg0);
	}

	@ObfuscatedName("anc.q(Lakt;B)V")
	public void method18776(CoordFine arg0) {
		this.field11848.field4308 = arg0.field11478;
		this.field11848.field4311 = arg0.field11479;
		this.field11848.field4313 = arg0.field11480;
		if (Float.isNaN(this.field11847.field4308)) {
			this.field11847.method6492(this.field11848);
			this.field11849.method6493();
		}
	}

	@ObfuscatedName("anc.e(FB)V")
	public void method14131(float arg0) {
		this.field8479.method4807(false, arg0, this.field11847, this.field8479.method4721(), this.field11848, this.field11849);
	}

	@ObfuscatedName("anc.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11847.field4308);
	}

	@ObfuscatedName("anc.f(Lju;Lou;IIFB)V")
	public void method14136(class270 arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		Vector3 var6 = Vector3.method6484(this.field8479.method4714());
		var6.field4308 -= arg2;
		var6.field4313 -= arg3;
		var6.field4311 *= -1.0F;
		Vector3 var7 = Vector3.method6484(this.field11847);
		var7.field4308 -= arg2;
		var7.field4313 -= arg3;
		var7.field4311 *= -1.0F;
		arg1.method6296((double) var6.field4308, (double) var6.field4311, (double) var6.field4313, (double) var7.field4308, (double) var7.field4311, (double) var7.field4313, 0.0F, 1.0F, 0.0F);
		var6.method6486();
		var7.method6486();
	}

	@ObfuscatedName("anc.m(I)Lox;")
	public Vector3 method14133() {
		return Vector3.method6484(this.field11847);
	}

	@ObfuscatedName("anc.k(I)Lox;")
	public Vector3 method14135() {
		return Vector3.method6484(this.field11848);
	}

	@ObfuscatedName("anc.w(Lalw;I)V")
	public void method14132(Packet arg0) {
		this.field11848.method6490(arg0);
	}
}
