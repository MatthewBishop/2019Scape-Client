package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ang")
public class PreferencesUnknown0 extends PreferencesOption {

	public PreferencesUnknown0(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnknown0(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ang.o(I)V")
	public void method18663() {
		if (this.field8416 != 1 && this.field8416 != 0) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ang.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("ang.s(I)Z")
	public boolean method18666() {
		return true;
	}

	@ObfuscatedName("ang.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ang.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ang.y(S)I")
	public int method18665() {
		return this.field8416;
	}
}
