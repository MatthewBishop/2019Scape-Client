package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ach")
public class class768 {

	@ObfuscatedName("ach.e")
	public final Js5 field8860;

	@ObfuscatedName("ach.n")
	public final Js5 field8858;

	@ObfuscatedName("ach.m")
	public int field8856 = 0;

	@ObfuscatedName("ach.k")
	public int field8857 = 0;

	@ObfuscatedName("ach.f")
	public final WeightedCache field8855 = new WeightedCache(64);

	@ObfuscatedName("ach.u")
	public class645 field8861 = null;

	public class768(Language arg0, Js5 arg1, Js5 arg2, class645 arg3) {
		this.field8860 = arg1;
		this.field8858 = arg2;
		this.field8861 = arg3;
		if (this.field8860 != null) {
			this.field8856 = this.field8860.method6897(1);
		}
		if (this.field8858 != null) {
			this.field8857 = this.field8858.method6897(1);
		}
	}

	@ObfuscatedName("ach.e(II)Lasq;")
	public class1186 method14982(int arg0) {
		class1186 var2 = (class1186) this.field8855.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.field8858.method6879(1, arg0 & 0x7FFF);
		} else {
			var3 = this.field8860.method6879(1, arg0);
		}
		class1186 var4 = new class1186();
		var4.field12380 = this;
		if (var3 != null) {
			var4.method19526(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.method19511();
		}
		this.field8855.method2921(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("ach.n(Lxs;[IJ)Ljava/lang/String;")
	public String method14978(class646 arg0, int[] arg1, long arg2) {
		if (this.field8861 != null) {
			String var5 = this.field8861.method5945(arg0, arg1, arg2);
			if (var5 != null) {
				return var5;
			}
		}
		return Long.toString(arg2);
	}
}
