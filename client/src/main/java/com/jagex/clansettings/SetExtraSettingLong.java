package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("arg")
public class SetExtraSettingLong extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("arg.k")
	public int field12220;

	@ObfuscatedName("arg.f")
	public long field12221;

	public SetExtraSettingLong(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("arg.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		this.field12220 = arg0.g4s();
		this.field12221 = arg0.g8();
	}

	@ObfuscatedName("arg.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5272(this.field12220, this.field12221);
	}
}
