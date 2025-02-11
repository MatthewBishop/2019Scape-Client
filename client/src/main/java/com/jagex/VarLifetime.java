package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qj")
public class VarLifetime implements SerializableEnum {

	@ObfuscatedName("qj.e")
	public static final VarLifetime TEMPORARY = new VarLifetime(0);

	@ObfuscatedName("qj.n")
	public static final VarLifetime PERMANENT = new VarLifetime(1);

	@ObfuscatedName("qj.m")
	public static final VarLifetime SERVER_PERMANENT = new VarLifetime(2);

	@ObfuscatedName("qj.k")
	public final int field4612;

	@ObfuscatedName("aw.e(B)[Lqj;")
	public static VarLifetime[] method748() {
		return new VarLifetime[] {PERMANENT, TEMPORARY, SERVER_PERMANENT};
	}

	public VarLifetime(int arg0) {
		this.field4612 = arg0;
	}

	@ObfuscatedName("qj.n()I")
	public int getId() {
		return this.field4612;
	}
}
