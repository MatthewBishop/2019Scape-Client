package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("arc")
public class class1161 extends class978 {

	// $FF: synthetic field
	public final class310 this$0;

	@ObfuscatedName("arc.k")
	public long field12240;

	@ObfuscatedName("arc.f")
	public String field12239;

	@ObfuscatedName("arc.w")
	public int field12238;

	public class1161(class310 arg0) {
		this.this$0 = arg0;
		this.field12240 = -1L;
		this.field12239 = null;
		this.field12238 = 0;
	}

	@ObfuscatedName("arc.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= -1445626955;
			this.field12240 = arg0.g8();
		}
		this.field12239 = arg0.fastgstr();
		this.field12238 = arg0.g2();
	}

	@ObfuscatedName("arc.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5262(this.field12240, this.field12239, this.field12238);
	}
}