package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anj")
public class PreferencesUnknown9 extends PreferencesOption {

	public PreferencesUnknown9(Preferences arg0) {
		super(arg0);
	}

	public PreferencesUnknown9(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anj.o(B)V")
	public void method18757() {
		if (this.field8416 != 1 && this.field8416 != 0) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anj.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("anj.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("anj.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anj.s(I)I")
	public int method18758() {
		return this.field8416;
	}
}
