package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajh")
public class DynamicWallDecorEntity extends WallDecorLayerEntity implements Location {

	@ObfuscatedName("ajh.c")
	public DynamicLoc field11174;

	@ObfuscatedName("ajh.r")
	public boolean field11175;

	@ObfuscatedName("ajh.v")
	public EntityBounds field11176;

	@ObfuscatedName("ajh.o")
	public boolean field11177 = true;

	public DynamicWallDecorEntity(Scene arg0, Renderer arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, ScaleRotTrans arg16) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg16);
		this.field11174 = new DynamicLoc(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.field11175 = arg3.field7470 != 0 && !arg9;
		this.method18363(1);
	}

	@ObfuscatedName("ajh.bu(B)Z")
	public boolean method16488() {
		return false;
	}

	@ObfuscatedName("ajh.bw(S)Z")
	public boolean method16489() {
		return this.field11177;
	}

	@ObfuscatedName("ajh.fv(Ldh;B)Luq;")
	public EntityBounds method17371(Renderer arg0) {
		return this.field11176;
	}

	@ObfuscatedName("ajh.by(B)I")
	public int method16523() {
		return this.field11174.method8262();
	}

	@ObfuscatedName("ajh.bo(I)I")
	public int method16501() {
		return this.field11174.method8236();
	}

	@ObfuscatedName("ajh.bz(Lvp;B)V")
	public void method17425(class597 arg0) {
		this.field11174.method8265(arg0);
	}

	@ObfuscatedName("ajh.fc(Ldh;I)Ltl;")
	public PickableEntity method17372(Renderer arg0) {
		Model var2 = this.field11174.method8238(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = arg0.method2209();
		var3.method6292(this.method10533());
		var3.method6315((float) this.field12452, 0.0F, (float) this.field12451);
		ScaleRotTrans var4 = this.method10536();
		PickableEntity var5 = PickableEntity.method16749(this.field11175);
		int var6 = (int) var4.field4298.field4308 >> 9;
		int var7 = (int) var4.field4298.field4313 >> 9;
		this.field11174.method8239(arg0, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.field11174.method8237();
		if (var8.field7468 == null) {
			var2.method1813(var3, this.field11713[0], 0);
		} else {
			var2.method1813(var3, null, 0);
			arg0.method2193(var3, this.field11713[0], var8.field7468);
		}
		if (this.field11174.field6680 != null) {
			ParticleList var9 = this.field11174.field6680.method9965();
			arg0.method2198(var9);
		}
		this.field11177 = var2.method1731() || this.field11174.field6680 != null;
		if (this.field11176 == null) {
			this.field11176 = GraphEntity.method15111((int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		} else {
			GraphEntity.method8229(this.field11176, (int) var4.field4298.field4308, (int) var4.field4298.field4311, (int) var4.field4298.field4313, var2);
		}
		return var5;
	}

	@ObfuscatedName("ajh.fw(Ldh;I)V")
	public void method17373(Renderer arg0) {
		Model var2 = this.field11174.method8238(arg0, 262144, false, true);
		if (var2 == null) {
			return;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.method10536();
		int var5 = (int) var4.field4298.field4308 >> 9;
		int var6 = (int) var4.field4298.field4313 >> 9;
		this.field11174.method8239(arg0, var2, var3, var5, var5, var6, var6, false);
	}

	@ObfuscatedName("ajh.fa(Ldh;IIB)Z")
	public boolean method17375(Renderer arg0, int arg1, int arg2) {
		LocType var4 = this.field11174.method8237();
		if (var4.field7468 == null) {
			Model var5 = this.field11174.method8238(arg0, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return arg0.method2191(arg1, arg2, this.method10533(), var4.field7468);
		}
	}

	@ObfuscatedName("ajh.e(I)I")
	public int method8223() {
		return this.field11174.field6665;
	}

	@ObfuscatedName("ajh.n(I)I")
	public int method8220() {
		return this.field11174.field6666;
	}

	@ObfuscatedName("ajh.m(I)I")
	public int method8204() {
		return this.field11174.field6667;
	}

	@ObfuscatedName("ajh.k(I)V")
	public void method8205() {
	}

	@ObfuscatedName("ajh.w(B)Z")
	public boolean method8207() {
		return true;
	}

	@ObfuscatedName("ajh.f(I)Z")
	public boolean method8206() {
		return this.field11174.method8240();
	}

	@ObfuscatedName("ajh.l(Ldh;B)V")
	public void method8217(Renderer arg0) {
		this.field11174.method8241(arg0);
	}

	@ObfuscatedName("ajh.u(Ldh;B)V")
	public void method8209(Renderer arg0) {
		this.field11174.method8242(arg0);
	}
}
