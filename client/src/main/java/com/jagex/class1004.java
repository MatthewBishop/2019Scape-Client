package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

@ObfuscatedName("alj")
public class class1004 extends WorldMap {

	@ObfuscatedName("alj.bv")
	public static int field11657 = 0;

	@ObfuscatedName("alj.br")
	public static int field11646 = 1;

	@ObfuscatedName("alj.bg")
	public static int field11673 = 2;

	@ObfuscatedName("alj.ba")
	public static int field11648 = 8;

	@ObfuscatedName("alj.bp")
	public static int field11649 = 3;

	@ObfuscatedName("alj.bj")
	public static int field11650 = 50;

	@ObfuscatedName("alj.bs")
	public static int field11651 = 0;

	@ObfuscatedName("alj.ci")
	public static int field11665 = -1;

	@ObfuscatedName("alj.cn")
	public static int field11653 = -1;

	@ObfuscatedName("alj.cx")
	public static boolean field11663 = false;

	@ObfuscatedName("alj.ct")
	public static int field11656 = -1;

	@ObfuscatedName("alj.cf")
	public static int field11647 = -1;

	@ObfuscatedName("alj.co")
	public static boolean field11672 = false;

	@ObfuscatedName("alj.cr")
	public static class140[][] field11659 = new class140[3][5];

	@ObfuscatedName("alj.cm")
	public static FontMetrics[][] field11660 = new FontMetrics[3][5];

	@ObfuscatedName("alj.cb")
	public static HashMap field11661 = new HashMap();

	@ObfuscatedName("alj.cs")
	public static HashMap field11662 = new HashMap();

	@ObfuscatedName("alj.cy")
	public static int field11645 = field11649;

	@ObfuscatedName("alj.cc")
	public static int field11664 = field11650;

	@ObfuscatedName("alj.cz")
	public static boolean field11671 = false;

	@ObfuscatedName("alj.cj")
	public static boolean field11658 = false;

	@ObfuscatedName("alj.cd")
	public static IterableMap field11667 = new IterableMap(8);

	@ObfuscatedName("alj.dd")
	public static IterableMap field11668 = new IterableMap(8);

	@ObfuscatedName("alj.dr")
	public static IterableQueueIterator field11669 = new IterableQueueIterator(new IterableQueue());

	@ObfuscatedName("alj.da")
	public static boolean field11670 = false;

	@ObfuscatedName("alj.dt")
	public static boolean field11666 = false;

	@ObfuscatedName("alj.do")
	public static boolean field11675 = false;

	@ObfuscatedName("alj.dz")
	public static boolean field11655 = false;

	@ObfuscatedName("alj.dv")
	public static boolean field11652 = false;

	@ObfuscatedName("alj.dm")
	public static boolean field11674 = false;

	public class1004() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uu.du(Ldh;Ldf;I)V")
	public static final void method9231(Renderer arg0, MaterialList arg1) {
		if (field11651 == 100 || Statics.field6811 == null) {
			return;
		}
		MonotonicTime.method3655();
		MonotonicTime.method3655();
		if (field11651 < 10) {
			for (int var2 = 0; var2 < field11659.length; var2++) {
				for (int var3 = 0; var3 < field11659[var2].length; var3++) {
					Statics.field10317.method6889(Statics.field6792.field7697[var2][var3]);
					Statics.field7672.method6889(Statics.field6792.field7697[var2][var3]);
				}
			}
			if (!Statics.field6795.method6886(Statics.field6811.field12351)) {
				field11651 = Statics.field8332.method6880(Statics.field6811.field12351) / 10;
				return;
			}
			field11651 = 10;
		}
		if (field11651 == 10) {
			Statics.field6786 = Statics.field6811.field12357 >> 6 << 6;
			Statics.field6808 = Statics.field6811.field12361 >> 6 << 6;
			Statics.field6812 = (Statics.field6811.field12358 >> 6 << 6) - Statics.field6786 + 64;
			Statics.field6810 = (Statics.field6811.field12360 >> 6 << 6) - Statics.field6808 + 64;
			int[] var4 = new int[3];
			int var5 = -1;
			int var6 = -1;
			Vector3 var7 = Statics.field4490.method10536().field4298;
			CoordGrid var8 = client.world.method7727();
			if (Statics.field6811.method19471(Statics.field4490.field11717, ((int) var7.field4308 >> 9) + var8.field7426, ((int) var7.field4313 >> 9) + var8.field7427, var4)) {
				var5 = var4[1] - Statics.field6786;
				var6 = var4[2] - Statics.field6808;
			}
			if (!field11672 && var5 >= 0 && var5 < Statics.field6812 && var6 >= 0 && var6 < Statics.field6810) {
				int var9 = var5 + ((int) (Math.random() * 10.0D) - 5);
				int var10 = var6 + ((int) (Math.random() * 10.0D) - 5);
				Statics.field11443 = var9;
				Statics.field11654 = var10;
			} else if (field11656 == -1 || field11647 == -1) {
				Statics.field6811.method19470(Statics.field6811.field12354 >> 14 & 0x3FFF, Statics.field6811.field12354 & 0x3FFF, var4);
				Statics.field11443 = var4[1] - Statics.field6786;
				Statics.field11654 = var4[2] - Statics.field6808;
			} else {
				Statics.field6811.method19470(field11656, field11647, var4);
				if (var4 != null) {
					Statics.field11443 = var4[1] - Statics.field6786;
					Statics.field11654 = var4[2] - Statics.field6808;
				}
				field11647 = -1;
				field11656 = -1;
				field11672 = false;
			}
			if (Statics.field6811.field12356 == 25) {
				Statics.field6803 = 2.0F;
				Statics.field6804 = 2.0F;
			} else if (Statics.field6811.field12356 == 37) {
				Statics.field6803 = 3.0F;
				Statics.field6804 = 3.0F;
			} else if (Statics.field6811.field12356 == 50) {
				Statics.field6803 = 4.0F;
				Statics.field6804 = 4.0F;
			} else if (Statics.field6811.field12356 == 75) {
				Statics.field6803 = 6.0F;
				Statics.field6804 = 6.0F;
			} else if (Statics.field6811.field12356 == 100) {
				Statics.field6803 = 8.0F;
				Statics.field6804 = 8.0F;
			} else if (Statics.field6811.field12356 == 200) {
				Statics.field6803 = 16.0F;
				Statics.field6804 = 16.0F;
			} else {
				Statics.field6803 = 8.0F;
				Statics.field6804 = 8.0F;
			}
			Statics.field6840 = (int) Statics.field6804 >> 1;
			Statics.field6799 = class537.method18477(Statics.field6840);
			method4643();
			method8619();
			Statics.field11253 = new IterableQueue();
			field6797 += (int) (Math.random() * 5.0D) - 2;
			if (field6797 < -8) {
				field6797 = -8;
			}
			if (field6797 > 8) {
				field6797 = 8;
			}
			field6798 += (int) (Math.random() * 5.0D) - 2;
			if (field6798 < -16) {
				field6798 = -16;
			}
			if (field6798 > 16) {
				field6798 = 16;
			}
			method8514(arg1, field6797 >> 2 << 10, field6798 >> 1);
			Statics.field6788.method18871(1024, 256);
			Statics.field6789.method18915(256, 256);
			Statics.field6785.method14910(4096);
			Statics.field8736.method14910(256);
			field11651 = 20;
		} else if (field11651 == 20) {
			if (!field6842) {
				class492.method6969(true);
				method8542(arg0, field6797, field6798, field6842);
				field11651 = 60;
				class492.method6969(true);
				GameShell.method135();
			} else if (method8542(arg0, field6797, field6798, field6842)) {
				field11651 = 60;
			}
		} else if (field11651 == 60) {
			if (Statics.field6795.method6904(Statics.field6811.field12351)) {
				if (!Statics.field6795.method6886(Statics.field6811.field12351)) {
					return;
				}
				Statics.field6805 = class539.method6046(Statics.field6795, Statics.field6811.field12351, client.field10948);
			} else {
				Statics.field6805 = new class539(0);
			}
			method8505();
			field11651 = 70;
			class492.method6969(true);
			GameShell.method135();
		} else if (field11651 >= 70) {
			int var11 = 0;
			while (true) {
				if (var11 >= 3) {
					field11651 = 100;
					System.gc();
					break;
				}
				for (int var12 = 0; var12 < 5; var12++) {
					if (field11659[var11][var12] == null || field11660[var11][var12] == null) {
						field11659[var11][var12] = (class140) Statics.field7538.method6188(client.field10833, Statics.field6792.field7697[var11][var12], true, true);
						field11660[var11][var12] = Statics.field7538.method6163(client.field10833, Statics.field6792.field7697[var11][var12]);
						if (field11659[var11][var12] == null || field11660[var11][var12] == null) {
							return;
						}
						field11651 += 3;
					}
				}
				var11++;
			}
		}
	}

	@ObfuscatedName("jd.dl(I)V")
	public static void method4643() {
		if (Statics.field11443 < 0) {
			Statics.field11443 = 0;
			field11665 = -1;
			field11653 = -1;
		}
		if (Statics.field11443 > Statics.field6812) {
			Statics.field11443 = Statics.field6812;
			field11665 = -1;
			field11653 = -1;
		}
		if (Statics.field11654 < 0) {
			Statics.field11654 = 0;
			field11665 = -1;
			field11653 = -1;
		}
		if (Statics.field11654 > Statics.field6810) {
			Statics.field11654 = Statics.field6810;
			field11665 = -1;
			field11653 = -1;
		}
	}

	@ObfuscatedName("abv.dp(B)V")
	public static void method14689() {
		Statics.field11253 = null;
		field11651 = 0;
		field6793 = 0;
		Statics.field3044 = null;
		method8508();
		field6806.method14152();
		Statics.field6805 = null;
		field6831.method2924();
		field6832.method2924();
		Statics.field7241 = null;
		field11665 = -1;
		field11653 = -1;
		if (Statics.field6788 != null) {
			Statics.field6788.method14895();
			Statics.field6788.method18871(128, 64);
		}
		if (Statics.field6789 != null) {
			Statics.field6789.method18915(64, 64);
		}
		if (Statics.field6785 != null) {
			Statics.field6785.method14910(256);
		}
		Statics.field8736.method14910(64);
	}

	@ObfuscatedName("amr.dy(I)V")
	public static void method18566() {
		int var0 = -1;
		if (Statics.field6811 != null) {
			var0 = Statics.field6811.field12359;
		}
		method14689();
		for (int var1 = 0; var1 < 3; var1++) {
			for (int var2 = 0; var2 < 5; var2++) {
				field11659[var1][var2] = null;
				field11660[var1][var2] = null;
			}
		}
		Statics.field6811 = null;
		if (var0 != -1) {
			method3141(var0, -1, -1, false);
		}
	}

	@ObfuscatedName("na.db(B)V")
	public static void method6003() {
		method14689();
		Statics.field6811 = null;
		Statics.field7280 = null;
		field11667.method14499();
		field11668.method14499();
		for (int var0 = 0; var0 < 3; var0++) {
			for (int var1 = 0; var1 < 5; var1++) {
				field11659[var0][var1] = null;
				field11660[var0][var1] = null;
			}
		}
	}

	@ObfuscatedName("pf.dh(Ldh;IIIIS)V")
	public static void method7008(Renderer arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0.method2168(arg1, arg2, arg1 + arg3, arg2 + arg4);
		if (field11651 < 100) {
			byte var5 = 20;
			int var6 = arg3 / 2 + arg1;
			int var7 = arg4 / 2 + arg2 - 18 - var5;
			arg0.method2354(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method2179(var6 - 152, var7, 304, 34, client.field10825[client.field10773].getRGB(), 0);
			arg0.method2354(var6 - 150, var7 + 2, field11651 * 3, 30, client.field10824[client.field10773].getRGB(), 0);
			Statics.field10355.method2683(LocalisedText.LOADINGDOTDOTDOT.method15021(Statics.field1680), var6, var5 + var7, client.field10826[client.field10773].getRGB(), -1);
			return;
		}
		int var8 = Statics.field11443 - (int) ((float) arg3 / Statics.field6803);
		int var9 = Statics.field11654 + (int) ((float) arg4 / Statics.field6803);
		int var10 = Statics.field11443 + (int) ((float) arg3 / Statics.field6803);
		int var11 = Statics.field11654 - (int) ((float) arg4 / Statics.field6803);
		Statics.field2606 = Statics.field11443 - (int) ((float) arg3 / Statics.field6803);
		Statics.field8055 = Statics.field11654 - (int) ((float) arg4 / Statics.field6803);
		Statics.field3121 = (int) ((float) (arg3 * 2) / Statics.field6803);
		Statics.field4603 = (int) ((float) (arg4 * 2) / Statics.field6803);
		field6833 = field6831;
		method8620(Statics.field6786 + var8, Statics.field6808 + var9, Statics.field6786 + var10, Statics.field6808 + var11, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		method8523(arg0, !field11655, !field11652, client.field10948, false);
		IterableQueue var12 = method8602(arg0);
		method928(arg0, var12, 0, 0);
		if (client.field10794) {
			int var13 = arg1 + arg3 - 5;
			int var14 = arg2 + arg4 - 8;
			Statics.field9184.method2682("Fps: " + GameShell.fps + " (" + GameShell.fpsAverage + " ms)", var13, var14, 16776960, -1);
			int var18 = var14 - 15;
			Runtime var15 = Runtime.getRuntime();
			int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
			int var17 = 16776960;
			if (var16 > 65536) {
				var17 = 16711680;
			}
			Statics.field9184.method2682("Mem:" + var16 + "k", var13, var18, var17, -1);
			var14 = var18 - 15;
		}
		field6831.method2923(5);
	}

	@ObfuscatedName("aq.dx(Ldh;Laat;IIB)V")
	public static void method928(Renderer arg0, IterableQueue arg1, int arg2, int arg3) {
		Statics.field11253.method14152();
		if (field11658) {
			return;
		}
		for (class990 var4 = (class990) arg1.method14191(); var4 != null; var4 = (class990) arg1.method14161()) {
			MapElementType var5 = (MapElementType) Statics.field6788.get(var4.field11446);
			if (Statics.method18887(var5)) {
				boolean var6 = method3589(arg0, var4, var5, arg2, arg3);
				if (var6) {
					method14999(arg0, var4, var5);
				}
			}
		}
	}

	@ObfuscatedName("gt.de(Ldh;Laks;Lhs;IIB)Z")
	public static boolean method3589(Renderer arg0, class990 arg1, MapElementType arg2, int arg3, int arg4) {
		if (field6819 && !client.field10948 && !method8534(arg1.field11448, arg1.field11452)) {
			return false;
		}
		if (arg2.field2392 != null) {
			arg2 = arg2.method4024(Statics.field6791, Statics.field6790);
			if (arg2 == null) {
				return false;
			}
		}
		int var5 = Integer.MAX_VALUE;
		int var6 = Integer.MIN_VALUE;
		int var7 = Integer.MAX_VALUE;
		int var8 = Integer.MIN_VALUE;
		if (arg2.field2393 != null) {
			var5 = (arg1.field11448 + arg2.field2373 - Statics.field6845) * (Statics.field6851 - Statics.field6801) / (Statics.field6847 - Statics.field6845) + Statics.field6801;
			var6 = (arg1.field11448 + arg2.field2396 - Statics.field6845) * (Statics.field6851 - Statics.field6801) / (Statics.field6847 - Statics.field6845) + Statics.field6801;
			var8 = Statics.field6852 - (arg1.field11452 + arg2.field2395 - Statics.field6848) * (Statics.field6852 - Statics.field6837) / (Statics.field6846 - Statics.field6848);
			var7 = Statics.field6852 - (arg1.field11452 + arg2.field2397 - Statics.field6848) * (Statics.field6852 - Statics.field6837) / (Statics.field6846 - Statics.field6848);
		}
		Sprite var9 = null;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;
		int var13 = 0;
		if (arg2.field2400 != -1) {
			if (arg1.field11450 && arg2.field2403 != -1) {
				var9 = arg2.method4025(arg0, true);
			} else {
				var9 = arg2.method4025(arg0, false);
			}
			if (var9 != null) {
				switch(arg2.field2365.field2419) {
					case 0:
						var10 = arg1.field11449 - var9.method1434();
						var11 = arg1.field11449;
						break;
					case 1:
						var10 = arg1.field11449;
						var11 = arg1.field11449 + var9.method1434();
						break;
					case 2:
						var10 = arg1.field11449 - (var9.method1434() + 1 >> 1);
						var11 = arg1.field11449 + (var9.method1434() + 1 >> 1);
				}
				switch(arg2.field2405.field2425) {
					case 0:
						var12 = arg1.field11451 - var9.method1436();
						var13 = arg1.field11451;
						break;
					case 1:
						var12 = arg1.field11451;
						var13 = arg1.field11451 + var9.method1436();
						break;
					case 2:
						var12 = arg1.field11451 - (var9.method1436() + 1 >> 1);
						var13 = arg1.field11451 + (var9.method1436() + 1 >> 1);
				}
				if (var10 < var5) {
					var5 = var10;
				}
				if (var11 > var6) {
					var6 = var11;
				}
				if (var12 < var7) {
					var7 = var12;
				}
				if (var13 > var8) {
					var8 = var13;
				}
			}
		}
		Sprite var14 = null;
		if (arg2.field2384 != -1) {
			var14 = arg2.method4026(arg0);
		}
		int var15 = 0;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		if (arg2.field2370 != null) {
			Statics.method2678(arg2.field2388);
			if (Statics.field717 != null) {
				var22 = Statics.field10471.method14545(arg2.field2370, Statics.canvasWid, 0, null);
				var17 = Statics.field10471.method14551(arg2.field2370, Statics.canvasWid, null);
				var15 = arg2.field2410 * (Statics.field6851 - Statics.field6801) / (Statics.field6847 - Statics.field6845) + (arg1.field11449 - var17 / 2);
				int var23 = arg1.field11451 - arg2.field2394 * (Statics.field6852 - Statics.field6837) / (Statics.field6846 - Statics.field6848);
				if (var9 == null) {
					var16 = var23 - var22 / 2;
				} else {
					var16 = var23 - ((var9.method1436() >> 1) + var22);
				}
				var18 = arg3 + var15;
				if (var18 < var5) {
					var5 = var18;
				}
				var19 = var15 + var17 + arg3;
				if (var19 > var6) {
					var6 = var19;
				}
				var20 = arg4 + var16;
				if (var20 < var7) {
					var7 = var20;
				}
				var21 = var16 + var22 + arg4;
				if (var21 > var8) {
					var8 = var21;
				}
			}
		}
		if (var6 < Statics.field6801 || var5 > Statics.field6851 || var8 < Statics.field6837 || var7 > Statics.field6852) {
			return true;
		}
		method8533(arg0, arg1, arg2);
		if (var9 != null) {
			int var24 = 0;
			int var25 = 0;
			int var26 = 0;
			int var27 = 0;
			int var28 = 0;
			int var29 = 0;
			switch(arg2.field2365.field2419) {
				case 0:
					var24 = var9.method1459();
					var25 = (var9.method1459() + 1) / 2;
					var26 = var9.method1434();
					break;
				case 1:
					var25 = -(var9.method1459() + 1) / 2;
					break;
				case 2:
					var24 = var9.method1459() / 2;
					var26 = var9.method1434() >> 1;
			}
			switch(arg2.field2405.field2425) {
				case 0:
					var27 = var9.method1459();
					var28 = (var9.method1459() + 1) / 2;
					var29 = var9.method1436();
					break;
				case 1:
					var28 = -(var9.method1459() + 1) / 2;
					break;
				case 2:
					var27 = var9.method1459() / 2;
					var29 = var9.method1436() >> 1;
			}
			class32 var30 = (class32) field11661.get(arg1.field11446);
			if (var30 == null) {
				var30 = (class32) field11662.get(arg2.field2374);
			}
			if (var30 != null && arg2.field2384 == -1) {
				int var31;
				if (var30.field619 > field11664 / 2) {
					var31 = (field11664 * 255 - var30.field619 * 255) / field11664;
				} else {
					var31 = var30.field619 * 255 / field11664;
				}
				int var32 = var31 << 24 | 0xFFFF00;
				if (arg0 instanceof GpuRenderer) {
					arg0.method2301(arg1.field11449 - var24 - 7, arg1.field11451 - var27 - 7, var9.method1459() + 14, var9.method1459() + 14, var32);
					arg0.method2301(arg1.field11449 - var24 - 5, arg1.field11451 - var27 - 5, var9.method1459() + 10, var9.method1459() + 10, var32);
					arg0.method2301(arg1.field11449 - var24 - 3, arg1.field11451 - var27 - 3, var9.method1459() + 6, var9.method1459() + 6, var32);
					arg0.method2301(arg1.field11449 - var24 - 1, arg1.field11451 - var27 - 1, var9.method1459() + 2, var9.method1459() + 2, var32);
					arg0.method2301(arg1.field11449 - var24, arg1.field11451 - var27, var9.method1459(), var9.method1459(), var32);
				} else {
					arg0.method2175(arg1.field11449 - var25, arg1.field11451 - var28, var9.method1459() / 2 + 7, var32);
					arg0.method2175(arg1.field11449 - var25, arg1.field11451 - var28 - var28 == 0 ? 0 : 1, var9.method1459() / 2 + 5, var32);
					arg0.method2175(arg1.field11449 - var25, arg1.field11451 - var28 - var28 == 0 ? 0 : 1, var9.method1459() / 2 + 3, var32);
					arg0.method2175(arg1.field11449 - var25, arg1.field11451 - var28 - var28 == 0 ? 0 : 1, var9.method1459() / 2 + 1, var32);
					arg0.method2175(arg1.field11449 - var25, arg1.field11451 - var28 - var28 == 0 ? 0 : 1, var9.method1459() / 2, var32);
				}
			}
			var9.method1439(arg1.field11449 - var26, arg1.field11451 - var29);
			int var33 = 0;
			int var34 = 0;
			if (var30 != null && var14 != null) {
				switch(arg2.field2365.field2419) {
					case 0:
					default:
						break;
					case 1:
						var33 = var14.method1434();
						break;
					case 2:
						var33 = var14.method1434() >> 1;
				}
				switch(arg2.field2405.field2425) {
					case 0:
						var34 = (var14.method1436() + var9.method1436()) / 2;
					case 1:
					default:
						break;
					case 2:
						var34 = (var14.method1436() / 2 + var9.method1436()) / 2;
				}
				int var35;
				if (var30.field619 > field11664 / 2) {
					var35 = (field11664 * 255 - var30.field619 * 255) / field11664;
				} else {
					var35 = var30.field619 * 255 / field11664;
				}
				int var36 = var35 << 24 | 0xFFFF00;
				var14.method1443(arg1.field11449 - var33, arg1.field11451 - var34, 0, var36, 1);
			}
		}
		if (arg2.field2370 != null && Statics.field717 != null) {
			method4287(arg0, arg1, arg2, var15, var16, var22, var17);
		}
		if (arg2.field2400 != -1 || arg2.field2370 != null) {
			class963 var37 = new class963(arg1);
			var37.field11251 = var10;
			var37.field11249 = var11;
			var37.field11246 = var12;
			var37.field11248 = var13;
			var37.field11244 = var18;
			var37.field11247 = var19;
			var37.field11250 = var20;
			var37.field11245 = var21;
			Statics.field11253.method14153(var37);
		}
		return false;
	}

	@ObfuscatedName("acc.dj(Ldh;Laks;Lhs;I)V")
	public static void method14999(Renderer arg0, class990 arg1, MapElementType arg2) {
		Sprite var3 = arg2.method4027(arg0);
		if (var3 == null) {
			return;
		}
		int var4 = var3.method1459();
		if (var3.method1435() > var4) {
			var4 = var3.method1435();
		}
		byte var5 = 10;
		int var6 = arg1.field11449;
		int var7 = arg1.field11451;
		int var8 = 0;
		int var9 = 0;
		if (arg2.field2370 != null) {
			var9 = Statics.field10471.method14545(arg2.field2370, Statics.canvasWid, 0, null);
			var8 = Statics.field10471.method14551(arg2.field2370, Statics.canvasWid, null);
		}
		int var10 = var4 / 2 + arg1.field11449;
		int var11 = arg1.field11451;
		if (var6 < Statics.field6801 + var4) {
			var6 = Statics.field6801;
			var10 = var8 / 2 + var4 / 2 + Statics.field6801 + var5 + 5;
		} else if (var6 > Statics.field6851 - var4) {
			var6 = Statics.field6851 - var4;
			var10 = Statics.field6851 - var4 / 2 - var5 - var8 / 2 - 5;
		}
		if (var7 < Statics.field6837 + var4) {
			var7 = Statics.field6837;
			var11 = var4 / 2 + Statics.field6837 + var5;
		} else if (var7 > Statics.field6852 - var4) {
			var7 = Statics.field6852 - var4;
			var11 = Statics.field6852 - var4 / 2 - var5 - var9;
		}
		int var12 = (int) (Math.atan2((double) (var6 - arg1.field11449), (double) (var7 - arg1.field11451)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		var3.method1451((float) var4 / 2.0F + (float) var6, (float) var4 / 2.0F + (float) var7, 4096, var12);
		int var13 = -2;
		int var14 = -2;
		int var15 = -2;
		int var16 = -2;
		if (arg2.field2370 != null) {
			var13 = var10 - var8 / 2 - 5;
			var14 = var11;
			var15 = var8 + var13 + 10;
			var16 = var9 + var11 + 3;
			if (arg2.field2377 != 0) {
				arg0.method2301(var13, var11, var15 - var13, var16 - var11, arg2.field2377);
			}
			if (arg2.field2378 != 0) {
				arg0.method2173(var13, var11, var15 - var13, var16 - var11, arg2.field2378);
			}
			Statics.field717.method2720(arg2.field2370, var10, var11, var8, var9, arg2.field2366 | 0xFF000000, Statics.field6792.field7686, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.field2400 == -1 && arg2.field2370 == null) {
			return;
		}
		class963 var17 = new class963(arg1);
		var17.field11251 = var6 - var4 / 2;
		var17.field11249 = var4 / 2 + var6;
		var17.field11246 = var7 - var4;
		var17.field11248 = var7;
		var17.field11244 = var13;
		var17.field11247 = var15;
		var17.field11250 = var14;
		var17.field11245 = var16;
		Statics.field11253.method14153(var17);
	}

	@ObfuscatedName("hj.ey(Ldh;Laks;Lhs;IIIII)V")
	public static void method4287(Renderer arg0, class990 arg1, MapElementType arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg3 - 5;
		int var8 = arg4 + 2;
		if (arg2.field2377 != 0) {
			arg0.method2301(var7, var8, arg6 + 10, arg4 + arg5 - var8 + 1, arg2.field2377);
		}
		if (arg2.field2378 != 0) {
			arg0.method2173(var7, var8, arg6 + 10, arg4 + arg5 - var8 + 1, arg2.field2378);
		}
		int var9 = arg2.field2366;
		if (arg1.field11450 && arg2.field2372 != -1) {
			var9 = arg2.field2372;
		}
		Statics.field717.method2720(arg2.field2370, arg3, arg4, arg6, arg5, var9 | 0xFF000000, Statics.field6792.field7686, 1, 0, 0, null, null, null, 0, 0);
	}

	@ObfuscatedName("aq.ed(IIB)V")
	public static final void method929(int arg0, int arg1) {
		if (Statics.field6803 < Statics.field6804) {
			Statics.field6803 = (float) ((double) Statics.field6803 / 30.0D + (double) Statics.field6803);
			if (Statics.field6803 > Statics.field6804) {
				Statics.field6803 = Statics.field6804;
			}
			method4643();
			Statics.field6840 = (int) Statics.field6804 >> 1;
			Statics.field6799 = class537.method18477(Statics.field6840);
		} else if (Statics.field6803 > Statics.field6804) {
			Statics.field6803 = (float) ((double) Statics.field6803 - (double) Statics.field6803 / 30.0D);
			if (Statics.field6803 < Statics.field6804) {
				Statics.field6803 = Statics.field6804;
			}
			method4643();
			Statics.field6840 = (int) Statics.field6804 >> 1;
			Statics.field6799 = class537.method18477(Statics.field6840);
		}
		if (field11665 != -1 && field11653 != -1) {
			int var2 = field11665 - Statics.field11443;
			if (var2 != 0) {
				var2 /= Math.min(field11648, Math.abs(var2));
			}
			int var3 = field11653 - Statics.field11654;
			if (var3 != 0) {
				var3 /= Math.min(field11648, Math.abs(var3));
			}
			Statics.field11443 += var2;
			Statics.field11654 += var3;
			if (var2 == 0 && var3 == 0) {
				field11665 = -1;
				field11653 = -1;
			}
			method4643();
		}
		Iterator var4 = field11661.entrySet().iterator();
		while (true) {
			while (true) {
				class32 var5;
				do {
					if (!var4.hasNext()) {
						Iterator var6 = field11662.entrySet().iterator();
						while (true) {
							while (true) {
								class32 var7;
								do {
									if (!var6.hasNext()) {
										if (field11663 && Statics.field11253 != null) {
											for (class963 var8 = (class963) Statics.field11253.method14191(); var8 != null; var8 = (class963) Statics.field11253.method14161()) {
												MapElementType var9 = (MapElementType) Statics.field6788.get(var8.field11252.field11446);
												if (var8.method17518(arg0, arg1)) {
													if (var9.field2381 != null) {
														if (var9.field2381[4] != null) {
															MiniMenu.method3042(var9.field2381[4], var9.field2382, -1, 1012, -1, (long) var8.field11252.field11446, var9.field2374, 0, true, false, (long) var8.field11252.field11446, false);
														}
														if (var9.field2381[3] != null) {
															MiniMenu.method3042(var9.field2381[3], var9.field2382, -1, 1011, -1, (long) var8.field11252.field11446, var9.field2374, 0, true, false, (long) var8.field11252.field11446, false);
														}
														if (var9.field2381[2] != null) {
															MiniMenu.method3042(var9.field2381[2], var9.field2382, -1, 1010, -1, (long) var8.field11252.field11446, var9.field2374, 0, true, false, (long) var8.field11252.field11446, false);
														}
														if (var9.field2381[1] != null) {
															MiniMenu.method3042(var9.field2381[1], var9.field2382, -1, 1009, -1, (long) var8.field11252.field11446, var9.field2374, 0, true, false, (long) var8.field11252.field11446, false);
														}
														if (var9.field2381[0] != null) {
															MiniMenu.method3042(var9.field2381[0], var9.field2382, -1, 1008, -1, (long) var8.field11252.field11446, var9.field2374, 0, true, false, (long) var8.field11252.field11446, false);
														}
													}
													if (!var8.field11252.field11450) {
														var8.field11252.field11450 = true;
														Statics.method830(ClientTriggerType.field7263, var8.field11252.field11446, var9.field2374);
													}
													if (var8.field11252.field11450) {
														Statics.method830(ClientTriggerType.field7255, var8.field11252.field11446, var9.field2374);
													}
												} else if (var8.field11252.field11450) {
													var8.field11252.field11450 = false;
													Statics.method830(ClientTriggerType.field7254, var8.field11252.field11446, var9.field2374);
												}
											}
										}
										return;
									}
									var7 = (class32) ((Entry) var6.next()).getValue();
									var7.field619--;
								} while (var7.field619 != 0);
								if (var7.field620 > 1 || field11671) {
									var7.field620--;
									var7.field619 = field11664;
								} else {
									var6.remove();
								}
							}
						}
					}
					var5 = (class32) ((Entry) var4.next()).getValue();
					var5.field619--;
				} while (var5.field619 != 0);
				if (var5.field620 > 1 || field11671) {
					var5.field620--;
					var5.field619 = field11664;
				} else {
					var4.remove();
				}
			}
		}
	}

	@ObfuscatedName("fl.es(IIIZI)V")
	public static void method3141(int arg0, int arg1, int arg2, boolean arg3) {
		WorldMapAreaMetadata var4 = Statics.field6811;
		method8521(arg0);
		field6842 = false;
		if (Statics.field6811 != var4) {
			method14689();
		}
		field11656 = arg1;
		field11647 = arg2;
		field11672 = arg3;
	}

	@ObfuscatedName("kb.ei(I)V")
	public static void method5250() {
		method3079(true);
	}

	@ObfuscatedName("akb.el(B)Lasy;")
	public static WorldMapAreaMetadata method17877() {
		return Statics.field6811;
	}

	@ObfuscatedName("ft.ej(ZB)V")
	public static void method3079(boolean arg0) {
		CoordGrid var1 = Statics.field4490.method16521();
		WorldMapAreaMetadata var2 = method8511(var1.field7426, var1.field7427);
		if (var2 == null) {
			var2 = method8512(Statics.field6792.field7695);
		}
		if (Statics.field7280 == var2 && !arg0) {
			return;
		}
		Statics.field7280 = var2;
		boolean var3 = method8510(var2);
		if (var3) {
			field6842 = true;
			method14689();
		}
	}

	@ObfuscatedName("tr.ep(IB)V")
	public static void method8432(int arg0) {
		Statics.field11443 = arg0;
		field11665 = -1;
		field11653 = -1;
		method4643();
	}

	@ObfuscatedName("vh.ev(IB)V")
	public static void method9548(int arg0) {
		Statics.field11654 = arg0;
		field11653 = -1;
		field11653 = -1;
		method4643();
	}

	@ObfuscatedName("ali.ec(II)V")
	public static void method18180(int arg0) {
		if (arg0 == 25) {
			Statics.field6804 = 2.0F;
		} else if (arg0 == 37) {
			Statics.field6804 = 3.0F;
		} else if (arg0 == 50) {
			Statics.field6804 = 4.0F;
		} else if (arg0 == 75) {
			Statics.field6804 = 6.0F;
		} else if (arg0 == 100) {
			Statics.field6804 = 8.0F;
		} else if (arg0 == 200) {
			Statics.field6804 = 16.0F;
		}
		field11653 = -1;
		field11653 = -1;
	}

	@ObfuscatedName("wt.ek(IIIIB)V")
	public static void method9843(int arg0, int arg1, int arg2, int arg3) {
		float var4 = (float) Statics.field6810 / (float) Statics.field6812;
		int var5 = arg2;
		int var6 = arg3;
		if (var4 < 1.0F) {
			var6 = (int) ((float) arg2 * var4);
		} else {
			var5 = (int) ((float) arg3 / var4);
		}
		int var7 = arg0 - (arg2 - var5) / 2;
		int var8 = arg1 - (arg3 - var6) / 2;
		Statics.field11443 = Statics.field6812 * var7 / var5;
		Statics.field11654 = Statics.field6810 - Statics.field6810 * var8 / var6;
		field11665 = -1;
		field11653 = -1;
		method4643();
	}

	@ObfuscatedName("fy.eh(II)V")
	public static void method3368(int arg0) {
		class32 var1 = (class32) field11661.get(arg0);
		if (var1 == null) {
			var1 = new class32();
		}
		var1.field620 = field11645;
		var1.field619 = field11664;
		field11661.put(arg0, var1);
	}

	@ObfuscatedName("y.eq(II)V")
	public static void method541(int arg0) {
		class32 var1 = (class32) field11662.get(arg0);
		if (var1 == null) {
			var1 = new class32();
		}
		var1.field620 = field11645;
		var1.field619 = field11664;
		field11662.put(arg0, var1);
	}

	@ObfuscatedName("adc.eg(II)V")
	public static void method15173(int arg0) {
		if (arg0 < 1) {
			field11645 = field11649;
		} else {
			field11645 = arg0;
		}
	}

	@ObfuscatedName("tw.ez(IB)V")
	public static void method8498(int arg0) {
		if (arg0 < 1) {
			field11664 = field11650;
		} else {
			field11664 = arg0;
		}
	}

	@ObfuscatedName("ij.ef(ZI)V")
	public static void method4337(boolean arg0) {
		field11671 = arg0;
	}

	@ObfuscatedName("sk.ea(IIII)I")
	public static int method8145(int arg0, int arg1, int arg2) {
		if (field11651 < 100) {
			return -2;
		}
		int var3 = -2;
		int var4 = Integer.MAX_VALUE;
		int var5 = arg1 - Statics.field6786;
		int var6 = arg2 - Statics.field6808;
		for (class990 var7 = (class990) field6806.method14191(); var7 != null; var7 = (class990) field6806.method14161()) {
			if (var7.field11446 == arg0) {
				int var8 = var7.field11448;
				int var9 = var7.field11452;
				int var10 = Statics.field6786 + var8 << 14 | Statics.field6808 + var9;
				int var11 = (var5 - var8) * (var5 - var8) + (var6 - var9) * (var6 - var9);
				if (var3 < 0 || var11 < var4) {
					var3 = var10;
					var4 = var11;
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("wf.ew(B)Laks;")
	public static class990 method9829() {
		if (field6806 == null || field11669 == null) {
			return null;
		}
		field11669.method14283(field6806);
		class990 var0 = (class990) field11669.method14294();
		if (var0 == null) {
			return null;
		} else {
			MapElementType var1 = (MapElementType) Statics.field6788.get(var0.field11446);
			return var1 != null && var1.field2409 && var1.method4030(Statics.field6791, Statics.field6790) ? var0 : Statics.method13882();
		}
	}

	@ObfuscatedName("aga.en(III)V")
	public static void method16438(int arg0, int arg1) {
		field11665 = arg0 - Statics.field6786;
		field11653 = arg1 - Statics.field6808;
	}

	@ObfuscatedName("wl.fg(II)I")
	public static int method9736(int arg0) {
		if (field11657 == arg0) {
			return field11674 ? 1 : 0;
		} else if (field11646 == arg0) {
			return field11655 ? 1 : 0;
		} else if (field11673 == arg0) {
			return field11652 ? 1 : 0;
		} else {
			return -1;
		}
	}
}
