package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ams")
public class PreferencesLightingDetail extends PreferencesOption {

	public PreferencesLightingDetail(Preferences arg0) {
		super(arg0);
	}

	public PreferencesLightingDetail(int arg0, Preferences arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ams.o(S)V")
	public void method18390() {
		if (this.field8416 != 1 && this.field8416 != 0) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ams.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("ams.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ams.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ams.s(I)I")
	public int method18389() {
		return this.field8416;
	}
}
