package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ex")
public final class class163 {

	@ObfuscatedName("ex.e")
	public SecondaryNode field1760 = new SecondaryNode();

	@ObfuscatedName("ex.n")
	public int field1761;

	@ObfuscatedName("ex.m")
	public int field1762;

	@ObfuscatedName("ex.k")
	public IterableMap field1764;

	@ObfuscatedName("ex.f")
	public DualIterableQueue field1763 = new DualIterableQueue();

	public class163(int arg0) {
		this.field1761 = arg0;
		this.field1762 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field1764 = new IterableMap(var2);
	}

	@ObfuscatedName("ex.e(J)Laky;")
	public SecondaryNode method2966(long arg0) {
		SecondaryNode var3 = (SecondaryNode) this.field1764.method14495(arg0);
		if (var3 != null) {
			this.field1763.method14339(var3);
		}
		return var3;
	}

	@ObfuscatedName("ex.n(Laky;J)V")
	public void method2968(SecondaryNode arg0, long arg1) {
		if (this.field1762 == 0) {
			SecondaryNode var4 = this.field1763.method14315();
			var4.method8440();
			var4.method17806();
			if (this.field1760 == var4) {
				SecondaryNode var5 = this.field1763.method14315();
				var5.method8440();
				var5.method17806();
			}
		} else {
			this.field1762--;
		}
		this.field1764.method14501(arg0, arg1);
		this.field1763.method14339(arg0);
	}

	@ObfuscatedName("ex.m(I)V")
	public void method2969() {
		this.field1763.method14316();
		this.field1764.method14499();
		this.field1760 = new SecondaryNode();
		this.field1762 = this.field1761;
	}
}
