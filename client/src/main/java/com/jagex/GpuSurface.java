package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("apa")
public abstract class GpuSurface extends Surface {

	@ObfuscatedName("apa.e")
	public GpuRenderer field11940;

	public GpuSurface(GpuRenderer arg0) {
		this.field11940 = arg0;
	}

	@ObfuscatedName("apa.k()Z")
	public boolean method1630() {
		this.field11940.method15989();
		return true;
	}

	@ObfuscatedName("apa.i(II)V")
	public void method15453(int arg0, int arg1) {
		if (this.field11940.method2135() == this) {
			this.field11940.method15982();
		}
	}
}
