package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ah")
public class class36 implements class147, class151, class644 {

	@ObfuscatedName("ah.e")
	public final class609 field632;

	@ObfuscatedName("ah.n")
	public final class806 field633;

	@ObfuscatedName("ah.m")
	public final VarBitTypeList field634;

	@ObfuscatedName("ah.k")
	public final class642[] field635;

	public class36(class806 arg0, VarBitTypeList arg1, int arg2) {
		this.field635 = new class642[arg2];
		this.field632 = new class609();
		this.field633 = arg0;
		this.field634 = arg1;
	}

	@ObfuscatedName("ah.e(IB)I")
	public int method671(int arg0) {
		return this.field635[arg0].method10163(client.field10948 ? ModeAccountType.field8343 : ModeAccountType.field8344);
	}

	@ObfuscatedName("ah.n(II)I")
	public int method700(int arg0) {
		return this.field635[arg0].method10169();
	}

	@ObfuscatedName("ah.m(II)I")
	public int method674(int arg0) {
		return this.field635[arg0].method10158(client.field10948 ? ModeAccountType.field8343 : ModeAccountType.field8344);
	}

	@ObfuscatedName("ah.k(II)I")
	public int method675(int arg0) {
		return this.field635[arg0].method10175();
	}

	@ObfuscatedName("ah.f(IB)I")
	public int method687(int arg0) {
		return this.field635[arg0].method10161();
	}

	@ObfuscatedName("ah.w(Lqe;II)Lec;")
	public VarType method695(VarDomainType arg0, int arg1) {
		return VarDomainType.PLAYER == arg0 ? (VarType) this.field633.get(arg1) : null;
	}

	@ObfuscatedName("ah.l(IB)Lkh;")
	public VarBitType method694(int arg0) {
		VarBitType var2 = (VarBitType) this.field634.get(arg0);
		return VarDomainType.PLAYER == var2.baseVar.domain ? var2 : null;
	}

	@ObfuscatedName("ah.u(Lec;I)I")
	public int method679(VarType arg0) {
		return this.field632.method679(arg0);
	}

	@ObfuscatedName("ah.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return this.field632.method678(arg0);
	}
}
