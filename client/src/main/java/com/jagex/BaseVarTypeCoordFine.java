package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qm")
public final class BaseVarTypeCoordFine implements BaseVarTypeCodec {

	@ObfuscatedName("qm.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return new CoordFine(arg0);
	}
}
