package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lu")
public class class335 {

	@ObfuscatedName("lu.e")
	public final GpuRenderer field3269;

	@ObfuscatedName("lu.n")
	public final TextureList field3268;

	@ObfuscatedName("lu.m")
	public WeightedCache field3267 = new WeightedCache(10485760, 256);

	public class335(GpuRenderer arg0, TextureList arg1) {
		this.field3269 = arg0;
		this.field3268 = arg1;
	}

	@ObfuscatedName("lu.e(Ldv;)Llz;")
	public GpuTexture method5639(Material arg0) {
		return this.method5645(arg0, arg0.field1357);
	}

	@ObfuscatedName("lu.n(Ldv;I)Llz;")
	public GpuTexture method5645(Material arg0, int arg1) {
		long var3 = (long) (arg1 << 16 | arg0.field1329);
		GpuTexture var5 = (GpuTexture) this.field3267.method2930(var3);
		if (var5 != null) {
			return var5;
		} else if (this.method5642(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.field1357;
			}
			GpuTexture var7;
			if (arg0.field1336 && this.field3269.method2242()) {
				float[] var6 = this.field3268.method1984(class605.field7586, arg0.field1334, arg0.field1302, 0.7F, arg1, arg1, false);
				var7 = this.field3269.method15992(TextureFormat.field1273, arg1, arg1, true, var6);
			} else {
				int[] var8;
				if (class603.field7575 == arg0.field1340 && Material.method261(arg0.field1308)) {
					var8 = this.field3268.method1986(class605.field7586, arg0.field1334, 0.7F, arg1, arg1, true);
				} else {
					var8 = this.field3268.method1983(class605.field7586, arg0.field1334, 0.7F, arg1, arg1, false);
				}
				if (var8 == null) {
					return null;
				}
				var7 = this.field3269.method16204(arg1, arg1, true, var8);
			}
			var7.method5700(arg0.field1307 == 1, arg0.field1343 == 1);
			this.field3267.method2922(var7, var3, arg1 * arg1);
			return var7;
		} else {
			return null;
		}
	}

	@ObfuscatedName("lu.m(Ldv;I)Z")
	public boolean method5642(Material arg0, int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.field1357;
		}
		if (arg0.field1336 && this.field3269.method2242()) {
			return this.field3268.method1977(class605.field7586, arg0.field1334, arg0.field1302, class602.field7570, 0.7F, arg1, arg1, false);
		} else if (class603.field7575 == arg0.field1340 && Material.method261(arg0.field1308)) {
			return this.field3268.method1977(class605.field7586, arg0.field1334, -1, class602.field7568, 0.7F, arg1, arg1, true);
		} else {
			return this.field3268.method1977(class605.field7586, arg0.field1334, -1, class602.field7569, 0.7F, arg1, arg1, false);
		}
	}

	@ObfuscatedName("lu.k()V")
	public void method5643() {
		this.field3267.method2923(5);
	}

	@ObfuscatedName("lu.f()V")
	public void method5644() {
		this.field3267.method2924();
	}
}
