package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class Js5FileResourceLoader implements ResourceLoader {

	@ObfuscatedName("pb.e")
	public final Js5 field4326;

	@ObfuscatedName("pb.n")
	public final String field4327;

	public Js5FileResourceLoader(Js5 arg0, String arg1) {
		this.field4326 = arg0;
		this.field4327 = arg1;
	}

	@ObfuscatedName("pb.e(I)I")
	public int method6782() {
		return this.field4326.method6908(this.field4327) ? 100 : 0;
	}

	@ObfuscatedName("pb.n(B)Lacv;")
	public class773 method6781() {
		return class773.field8913;
	}
}
