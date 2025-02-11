package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ox")
public class Vector3 {

	@ObfuscatedName("ox.e")
	public static Vector3[] field4309;

	@ObfuscatedName("ox.k")
	public float field4308;

	@ObfuscatedName("ox.f")
	public float field4311;

	@ObfuscatedName("ox.w")
	public float field4313;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		new Vector3(1.0F, 1.0F, 1.0F);
		field4309 = new Vector3[0];
	}

	@ObfuscatedName("ox.e(I)V")
	public static void method6481(int arg0) {
		Statics.field4312 = arg0;
		field4309 = new Vector3[arg0];
		Statics.field4310 = 0;
	}

	@ObfuscatedName("ox.n()Lox;")
	public static Vector3 method6482() {
		Vector3[] var0 = field4309;
		synchronized (field4309) {
			if (Statics.field4310 == 0) {
				return new Vector3();
			} else {
				field4309[--Statics.field4310].method6493();
				return field4309[Statics.field4310];
			}
		}
	}

	@ObfuscatedName("ox.m(FFF)Lox;")
	public static Vector3 method6483(float arg0, float arg1, float arg2) {
		Vector3[] var3 = field4309;
		synchronized (field4309) {
			if (Statics.field4310 == 0) {
				return new Vector3(arg0, arg1, arg2);
			} else {
				field4309[--Statics.field4310].method6491(arg0, arg1, arg2);
				return field4309[Statics.field4310];
			}
		}
	}

	@ObfuscatedName("ox.k(Lox;)Lox;")
	public static Vector3 method6484(Vector3 arg0) {
		Vector3[] var1 = field4309;
		synchronized (field4309) {
			if (Statics.field4310 == 0) {
				return new Vector3(arg0);
			} else {
				field4309[--Statics.field4310].method6492(arg0);
				return field4309[Statics.field4310];
			}
		}
	}

	@ObfuscatedName("ox.f(Lalw;)Lox;")
	public static Vector3 method6485(Packet arg0) {
		Vector3[] var1 = field4309;
		synchronized (field4309) {
			if (Statics.field4310 == 0) {
				return new Vector3(arg0);
			} else {
				field4309[--Statics.field4310].method6490(arg0);
				return field4309[Statics.field4310];
			}
		}
	}

	@ObfuscatedName("ox.w()V")
	public void method6486() {
		Vector3[] var1 = field4309;
		synchronized (field4309) {
			if (Statics.field4310 < Statics.field4312 - 1) {
				field4309[Statics.field4310++] = this;
			}
		}
	}

	public Vector3() {
	}

	public Vector3(float arg0, float arg1, float arg2) {
		this.field4308 = arg0;
		this.field4311 = arg1;
		this.field4313 = arg2;
	}

	public Vector3(Vector3 arg0) {
		this.field4308 = arg0.field4308;
		this.field4311 = arg0.field4311;
		this.field4313 = arg0.field4313;
	}

	public Vector3(Packet arg0) {
		this.field4308 = arg0.gFloat();
		this.field4311 = arg0.gFloat();
		this.field4313 = arg0.gFloat();
	}

	@ObfuscatedName("ox.l(Lalw;)V")
	public void method6490(Packet arg0) {
		this.field4308 = arg0.gFloat();
		this.field4311 = arg0.gFloat();
		this.field4313 = arg0.gFloat();
	}

	@ObfuscatedName("ox.u(FFF)V")
	public void method6491(float arg0, float arg1, float arg2) {
		this.field4308 = arg0;
		this.field4311 = arg1;
		this.field4313 = arg2;
	}

	@ObfuscatedName("ox.z(Lox;)V")
	public void method6492(Vector3 arg0) {
		this.method6491(arg0.field4308, arg0.field4311, arg0.field4313);
	}

	@ObfuscatedName("ox.p()V")
	public final void method6493() {
		this.field4313 = 0.0F;
		this.field4311 = 0.0F;
		this.field4308 = 0.0F;
	}

	@ObfuscatedName("ox.d(Lox;)Z")
	public boolean method6488(Vector3 arg0) {
		return this.field4308 == arg0.field4308 && this.field4311 == arg0.field4311 && this.field4313 == arg0.field4313;
	}

	@ObfuscatedName("ox.c()V")
	public final void method6494() {
		this.field4308 = -this.field4308;
		this.field4311 = -this.field4311;
		this.field4313 = -this.field4313;
	}

	@ObfuscatedName("ox.r()V")
	public final void method6513() {
		float var1 = 1.0F / this.method6519();
		this.field4308 *= var1;
		this.field4311 *= var1;
		this.field4313 *= var1;
	}

	@ObfuscatedName("ox.v(Lox;)V")
	public final void method6497(Vector3 arg0) {
		this.field4308 += arg0.field4308;
		this.field4311 += arg0.field4311;
		this.field4313 += arg0.field4313;
	}

	@ObfuscatedName("ox.o(Lox;F)V")
	public final void method6570(Vector3 arg0, float arg1) {
		this.field4308 += arg0.field4308 * arg1;
		this.field4311 += arg0.field4311 * arg1;
		this.field4313 += arg0.field4313 * arg1;
	}

	@ObfuscatedName("ox.s(Lox;Lox;)Lox;")
	public static final Vector3 method6499(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6497(arg1);
		return var2;
	}

	@ObfuscatedName("ox.y(Lox;)V")
	public final void method6537(Vector3 arg0) {
		this.field4308 -= arg0.field4308;
		this.field4311 -= arg0.field4311;
		this.field4313 -= arg0.field4313;
	}

	@ObfuscatedName("ox.q(Lox;Lox;)Lox;")
	public static final Vector3 method6528(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6537(arg1);
		return var2;
	}

	@ObfuscatedName("ox.x(Lox;)F")
	public final float method6502(Vector3 arg0) {
		return this.field4313 * arg0.field4313 + this.field4311 * arg0.field4311 + this.field4308 * arg0.field4308;
	}

	@ObfuscatedName("ox.b(Lox;Lox;)F")
	public static final float method6503(Vector3 arg0, Vector3 arg1) {
		return arg0.method6502(arg1);
	}

	@ObfuscatedName("ox.h(Lox;)V")
	public final void method6489(Vector3 arg0) {
		this.method6491(this.field4311 * arg0.field4313 - this.field4313 * arg0.field4311, this.field4313 * arg0.field4308 - this.field4308 * arg0.field4313, this.field4308 * arg0.field4311 - this.field4311 * arg0.field4308);
	}

	@ObfuscatedName("ox.a(Lox;Lox;)Lox;")
	public static final Vector3 method6587(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6489(arg1);
		return var2;
	}

	@ObfuscatedName("ox.g()F")
	public final float method6519() {
		return (float) Math.sqrt((double) (this.field4313 * this.field4313 + this.field4311 * this.field4311 + this.field4308 * this.field4308));
	}

	@ObfuscatedName("ox.i()V")
	public final void method6577() {
		if (this.field4308 < 0.0F) {
			this.field4308 *= -1.0F;
		}
		if (this.field4311 < 0.0F) {
			this.field4311 *= -1.0F;
		}
		if (this.field4313 < 0.0F) {
			this.field4313 *= -1.0F;
		}
	}

	@ObfuscatedName("ox.j(Lox;)V")
	public final void method6506(Vector3 arg0) {
		this.field4308 *= arg0.field4308;
		this.field4311 *= arg0.field4311;
		this.field4313 *= arg0.field4313;
	}

	@ObfuscatedName("ox.t(Lox;Lox;)Lox;")
	public static final Vector3 method6557(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6506(arg1);
		return var2;
	}

	@ObfuscatedName("ox.ae(F)V")
	public final void method6496(float arg0) {
		this.field4308 *= arg0;
		this.field4311 *= arg0;
		this.field4313 *= arg0;
	}

	@ObfuscatedName("ox.ag(Lox;)V")
	public final void method6509(Vector3 arg0) {
		this.field4308 /= arg0.field4308;
		this.field4311 /= arg0.field4311;
		this.field4313 /= arg0.field4313;
	}

	@ObfuscatedName("ox.ah(Lox;Lox;)Lox;")
	public static final Vector3 method6510(Vector3 arg0, Vector3 arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6509(arg1);
		return var2;
	}

	@ObfuscatedName("ox.al(F)V")
	public final void method6511(float arg0) {
		this.field4308 /= arg0;
		this.field4311 /= arg0;
		this.field4313 /= arg0;
	}

	@ObfuscatedName("ox.ac(Lox;F)Lox;")
	public static final Vector3 method6512(Vector3 arg0, float arg1) {
		Vector3 var2 = method6484(arg0);
		var2.method6496(arg1);
		return var2;
	}

	@ObfuscatedName("ox.ai(Lov;)V")
	public final void method6526(class421 arg0) {
		class421 var2 = class421.method6411(this.field4308, this.field4311, this.field4313, 0.0F);
		class421 var3 = class421.method6419(arg0);
		class421 var4 = class421.method6425(var3, var2);
		var4.method6424(arg0);
		this.method6491(var4.field4301, var4.field4304, var4.field4305);
		var2.method6407();
		var3.method6407();
		var4.method6407();
	}

	@ObfuscatedName("ox.aw(Lou;)V")
	public final void method6567(Matrix4x3 arg0) {
		float var2 = this.field4308;
		float var3 = this.field4311;
		this.field4308 = this.field4313 * arg0.field4275 + arg0.field4279 * var3 + arg0.field4276 * var2 + arg0.field4285;
		this.field4311 = this.field4313 * arg0.field4283 + arg0.field4287 * var3 + arg0.field4277 * var2 + arg0.field4286;
		this.field4313 = this.field4313 * arg0.field4284 + arg0.field4281 * var3 + arg0.field4278 * var2 + arg0.field4280;
	}

	@ObfuscatedName("ox.as(Lou;)V")
	public final void method6521(Matrix4x3 arg0) {
		float var2 = this.field4308;
		float var3 = this.field4311;
		this.field4308 = this.field4313 * arg0.field4275 + arg0.field4279 * var3 + arg0.field4276 * var2;
		this.field4311 = this.field4313 * arg0.field4283 + arg0.field4287 * var3 + arg0.field4277 * var2;
		this.field4313 = this.field4313 * arg0.field4284 + arg0.field4281 * var3 + arg0.field4278 * var2;
	}

	@ObfuscatedName("ox.at(Lox;F)V")
	public final void method6562(Vector3 arg0, float arg1) {
		this.method6496(1.0F - arg1);
		this.method6497(method6512(arg0, arg1));
	}

	public String toString() {
		return this.field4308 + ", " + this.field4311 + ", " + this.field4313;
	}
}
