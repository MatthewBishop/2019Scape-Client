package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abr")
public abstract class ObjTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("abr.e")
	public final Language languageId;

	@ObfuscatedName("abr.n")
	public boolean allowMembers;

	@ObfuscatedName("abr.m")
	public final Js5 field8614;

	@ObfuscatedName("abr.k")
	public final WeightedCache field8612 = new WeightedCache(50);

	@ObfuscatedName("abr.f")
	public final class611 field8613 = new class611(250);

	@ObfuscatedName("abr.w")
	public final class736 field8609 = new class736();

	@ObfuscatedName("abr.l")
	public final ConfigTypeList paramTL;

	@ObfuscatedName("abr.u")
	public int field8611;

	@ObfuscatedName("abr.z")
	public final String[] field8617;

	@ObfuscatedName("abr.p")
	public final String[] field8616;

	public ObjTypeFactory(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, ConfigTypeList arg4) {
		this.languageId = arg1;
		this.allowMembers = arg2;
		this.field8614 = arg3;
		this.paramTL = arg4;
		if (ModeGame.RUNESCAPE == arg0) {
			this.field8617 = new String[] { null, null, LocalisedText.TAKE.method15021(this.languageId), null, null, LocalisedText.EXAMINE.method15021(this.languageId) };
		} else {
			this.field8617 = new String[] { null, null, LocalisedText.TAKE.method15021(this.languageId), null, null, null };
		}
		this.field8616 = new String[] { null, null, null, null, LocalisedText.DROP.method15021(this.languageId) };
	}

	@ObfuscatedName("abr.e(Ldh;IIIIILxg;I)Lcm;")
	public Sprite method14616(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PlayerModel arg6) {
		this.field8609.field8607 = arg0.field1595;
		this.field8609.field8602 = arg1;
		this.field8609.field8604 = arg2;
		this.field8609.field8605 = arg3;
		this.field8609.field8606 = arg4;
		this.field8609.field8603 = arg5;
		this.field8609.field8608 = arg6 != null;
		return (Sprite) this.field8613.method9646(this.field8609);
	}

	@ObfuscatedName("abr.n(Ldh;Ldh;IIIIZZILeu;Lxg;Lws;Lao;I)Lcm;")
	public Sprite method14617(Renderer arg0, Renderer arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, class140 arg9, PlayerModel arg10, GraphicsDefaults arg11, ConfigTypeList arg12) {
		if (!arg7) {
			Sprite var14 = this.method14616(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (var14 != null) {
				return var14;
			}
		}
		ObjType var15 = (ObjType) arg12.get(arg2);
		if (arg3 > 1 && var15.field8629 != null) {
			int var16 = -1;
			for (int var17 = 0; var17 < 10; var17++) {
				if (arg3 >= var15.field8671[var17] && var15.field8671[var17] != 0) {
					var16 = var15.field8629[var17];
				}
			}
			if (var16 != -1) {
				var15 = (ObjType) arg12.get(var16);
			}
		}
		int[] var18 = var15.method14646(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (var18 == null) {
			return null;
		}
		Sprite var19;
		if (arg7) {
			var19 = arg0.method2199(var18, 0, 36, 36, 32);
		} else {
			var19 = arg1.method2199(var18, 0, 36, 36, 32);
		}
		if (!arg7) {
			class736 var20 = new class736();
			var20.field8607 = arg1.field1595;
			var20.field8602 = arg2;
			var20.field8604 = arg3;
			var20.field8605 = arg4;
			var20.field8606 = arg5;
			var20.field8603 = arg8;
			var20.field8608 = arg10 != null;
			this.field8613.method9654(var19, var20);
		}
		return var19;
	}

	@ObfuscatedName("abr.m(ZB)V")
	public void method14618(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.method14623();
		}
	}

	@ObfuscatedName("abr.k(II)V")
	public void method14619(int arg0) {
		this.field8611 = arg0;
		WeightedCache var2 = this.field8612;
		synchronized (this.field8612) {
			this.field8612.method2924();
		}
	}

	@ObfuscatedName("abr.f(I)V")
	public void method14623() {
		WeightedCache var1 = this.field8612;
		synchronized (this.field8612) {
			this.field8612.method2924();
		}
		class611 var3 = this.field8613;
		synchronized (this.field8613) {
			this.field8613.method9652();
		}
	}

	@ObfuscatedName("abr.w(I)V")
	public void method14621() {
		class611 var1 = this.field8613;
		synchronized (this.field8613) {
			this.field8613.method9652();
		}
	}

	@ObfuscatedName("abr.l(IB)V")
	public void method14624(int arg0) {
		WeightedCache var2 = this.field8612;
		synchronized (this.field8612) {
			this.field8612.method2923(arg0);
		}
		class611 var4 = this.field8613;
		synchronized (this.field8613) {
			this.field8613.method9651(arg0);
		}
	}

	@ObfuscatedName("abr.u(I)V")
	public void method14622() {
		WeightedCache var1 = this.field8612;
		synchronized (this.field8612) {
			this.field8612.method2928();
		}
		class611 var3 = this.field8613;
		synchronized (this.field8613) {
			this.field8613.method9653();
		}
	}
}
