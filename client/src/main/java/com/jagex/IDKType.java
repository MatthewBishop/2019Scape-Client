package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jv")
public class IDKType implements ConfigType {

	@ObfuscatedName("jv.e")
	public final Js5 field2955;

	@ObfuscatedName("jv.n")
	public int[] field2950;

	@ObfuscatedName("jv.m")
	public short[] field2949;

	@ObfuscatedName("jv.k")
	public short[] field2954;

	@ObfuscatedName("jv.f")
	public short[] field2958;

	@ObfuscatedName("jv.w")
	public short[] field2953;

	@ObfuscatedName("jv.l")
	public byte[] field2952;

	@ObfuscatedName("jv.u")
	public byte[] field2956;

	@ObfuscatedName("jv.z")
	public int[] field2957 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("jv.p")
	public static final int[] field2951 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@ObfuscatedName("jv.d")
	public static final int[] field2959 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	public IDKType(int arg0, Js5 arg1) {
		this.field2955 = arg1;
	}

	@ObfuscatedName("jv.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method4997(arg0, var2);
		}
	}

	@ObfuscatedName("jv.u(Lalw;II)V")
	public void method4997(Packet arg0, int arg1) {
		if (arg1 == 1) {
			arg0.g1();
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.field2950 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2950[var4] = arg0.gSmart2or4null();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				int var5 = arg0.g1();
				this.field2949 = new short[var5];
				this.field2954 = new short[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field2949[var6] = (short) arg0.g2();
					this.field2954[var6] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				int var7 = arg0.g1();
				this.field2958 = new short[var7];
				this.field2953 = new short[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					this.field2958[var8] = (short) arg0.g2();
					this.field2953[var8] = (short) arg0.g2();
				}
			} else if (arg1 == 44) {
				int var9 = arg0.g2();
				int var10 = 0;
				for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
					var10++;
				}
				this.field2952 = new byte[var10];
				byte var12 = 0;
				for (int var13 = 0; var13 < var10; var13++) {
					if ((var9 & 0x1 << var13) > 0) {
						this.field2952[var13] = var12++;
					} else {
						this.field2952[var13] = -1;
					}
				}
			} else if (arg1 == 45) {
				int var14 = arg0.g2();
				int var15 = 0;
				for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
					var15++;
				}
				this.field2956 = new byte[var15];
				byte var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					if ((var14 & 0x1 << var18) > 0) {
						this.field2956[var18] = var17++;
					} else {
						this.field2956[var18] = -1;
					}
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.field2957[arg1 - 60] = arg0.gSmart2or4null();
			}
		}
	}

	@ObfuscatedName("jv.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("jv.z(B)Z")
	public boolean method4999() {
		if (this.field2950 == null) {
			return true;
		}
		boolean var1 = true;
		Js5 var2 = this.field2955;
		synchronized (this.field2955) {
			for (int var3 = 0; var3 < this.field2950.length; var3++) {
				if (!this.field2955.method6888(this.field2950[var3], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("jv.p(I)Ldq;")
	public ModelUnlit method5000() {
		if (this.field2950 == null) {
			return null;
		}
		ModelUnlit[] var1 = new ModelUnlit[this.field2950.length];
		Js5 var2 = this.field2955;
		synchronized (this.field2955) {
			int var3 = 0;
			while (true) {
				if (var3 >= this.field2950.length) {
					break;
				}
				var1[var3] = ModelUnlit.method1931(this.field2955, this.field2950[var3], 0);
				var3++;
			}
		}
		for (int var5 = 0; var5 < this.field2950.length; var5++) {
			if (var1[var5].field1372 < 13) {
				var1[var5].method1947(2);
			}
		}
		ModelUnlit var6;
		if (var1.length == 1) {
			var6 = var1[0];
		} else {
			var6 = new ModelUnlit(var1, var1.length);
		}
		if (var6 == null) {
			return null;
		}
		if (this.field2949 != null) {
			for (int var7 = 0; var7 < this.field2949.length; var7++) {
				var6.method1943(this.field2949[var7], this.field2954[var7]);
			}
		}
		if (this.field2958 != null) {
			for (int var8 = 0; var8 < this.field2958.length; var8++) {
				var6.method1937(this.field2958[var8], this.field2953[var8]);
			}
		}
		return var6;
	}

	@ObfuscatedName("jv.d(I)Z")
	public boolean method5001() {
		boolean var1 = true;
		Js5 var2 = this.field2955;
		synchronized (this.field2955) {
			for (int var3 = 0; var3 < 5; var3++) {
				if (this.field2957[var3] != -1 && !this.field2955.method6888(this.field2957[var3], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("jv.c(I)Ldq;")
	public ModelUnlit method5002() {
		ModelUnlit[] var1 = new ModelUnlit[5];
		int var2 = 0;
		Js5 var3 = this.field2955;
		synchronized (this.field2955) {
			int var4 = 0;
			while (true) {
				if (var4 >= 5) {
					break;
				}
				if (this.field2957[var4] != -1) {
					var1[var2++] = ModelUnlit.method1931(this.field2955, this.field2957[var4], 0);
				}
				var4++;
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			if (var1[var6] != null && var1[var6].field1372 < 13) {
				var1[var6].method1947(2);
			}
		}
		ModelUnlit var7 = new ModelUnlit(var1, var2);
		if (this.field2949 != null) {
			for (int var8 = 0; var8 < this.field2949.length; var8++) {
				var7.method1943(this.field2949[var8], this.field2954[var8]);
			}
		}
		if (this.field2958 != null) {
			for (int var9 = 0; var9 < this.field2958.length; var9++) {
				var7.method1937(this.field2958[var9], this.field2953[var9]);
			}
		}
		return var7;
	}
}
