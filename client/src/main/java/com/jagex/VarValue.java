package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("on")
public class VarValue {

	@ObfuscatedName("on.e")
	public final int field4240;

	@ObfuscatedName("on.n")
	public Object field4239;

	public VarValue(int arg0) {
		this.field4240 = arg0;
	}

	public VarValue(int arg0, Object arg1) {
		this.field4240 = arg0;
		this.field4239 = arg1;
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof VarValue)) {
			return false;
		}
		VarValue var2 = (VarValue) arg0;
		if (var2.field4239 == null && this.field4239 != null) {
			return false;
		} else if (this.field4239 == null && var2.field4239 != null) {
			return false;
		} else {
			return this.field4240 == var2.field4240 && var2.field4239.equals(this.field4239);
		}
	}
}
