package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("amp")
public class PreferencesUnused5 extends PreferencesOption {

	public PreferencesUnused5(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnused5(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("amp.o(S)V")
	public void method18595() {
		if (this.field8416 < 0 || this.field8416 > 3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("amp.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("amp.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("amp.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("amp.s(B)I")
	public int method18594() {
		return this.field8416;
	}
}
