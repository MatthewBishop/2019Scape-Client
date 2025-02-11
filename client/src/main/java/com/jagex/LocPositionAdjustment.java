package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vz")
public class LocPositionAdjustment {

	@ObfuscatedName("vz.e")
	public int field7540;

	@ObfuscatedName("vz.n")
	public int field7541;

	@ObfuscatedName("vz.m")
	public ScaleRotTrans field7539;

	public LocPositionAdjustment(Packet arg0) {
		this(arg0, false);
	}

	public LocPositionAdjustment(Packet arg0, boolean arg1) {
		this(arg0, arg1, true);
	}

	public LocPositionAdjustment(Packet arg0, int arg1, boolean arg2) {
		this(arg0, arg1, arg2, true);
	}

	public LocPositionAdjustment(Packet arg0, boolean arg1, boolean arg2) {
		this(arg0, arg0.g1(), arg1, arg2);
	}

	public LocPositionAdjustment(Packet arg0, int arg1, boolean arg2, boolean arg3) {
		boolean var5 = (arg1 & 0x80) != 0;
		if (arg2) {
			int var6 = arg0.g1();
			this.field7541 = arg1 & 0x7F;
			this.field7540 = var6;
		} else {
			this.field7541 = arg1 >> 2 & 0x1F;
			this.field7540 = arg1 & 0x3;
		}
		this.field7539 = null;
		if (var5) {
			this.field7539 = new ScaleRotTrans(arg0, arg3);
		}
	}
}
