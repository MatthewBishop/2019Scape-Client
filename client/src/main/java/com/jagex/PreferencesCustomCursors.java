package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ans")
public class PreferencesCustomCursors extends PreferencesOption {

	public PreferencesCustomCursors(Preferences arg0) {
		super(arg0);
	}

	public PreferencesCustomCursors(int arg0, Preferences arg1) {
		super(arg1);
	}

	@ObfuscatedName("ans.o(I)V")
	public void method18770() {
		if (this.field8416 != 1 && this.field8416 != 0) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ans.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("ans.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ans.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ans.s(I)I")
	public int method18771() {
		return this.field8416;
	}
}
