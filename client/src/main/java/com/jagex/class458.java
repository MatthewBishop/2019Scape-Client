package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qr")
public class class458 {

	@ObfuscatedName("qr.e")
	public final Js5 field4616;

	@ObfuscatedName("qr.n")
	public final Js5 field4614;

	@ObfuscatedName("qr.m")
	public final WeightedCache field4615 = new WeightedCache(64);

	public class458(Language arg0, Js5 arg1, Js5 arg2) {
		this.field4616 = arg1;
		this.field4614 = arg2;
		if (this.field4616 != null) {
			this.field4616.method6897(0);
		}
		if (this.field4614 != null) {
			this.field4614.method6897(0);
		}
	}

	@ObfuscatedName("qr.e(IB)Lasd;")
	public class1182 method7243(int arg0) {
		class1182 var2 = (class1182) this.field4615.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.field4614.method6879(0, arg0 & 0x7FFF);
		} else {
			var3 = this.field4616.method6879(0, arg0);
		}
		class1182 var4 = new class1182();
		if (var3 != null) {
			var4.method19449(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.method19452();
		}
		this.field4615.method2921(var4, (long) arg0);
		return var4;
	}
}
