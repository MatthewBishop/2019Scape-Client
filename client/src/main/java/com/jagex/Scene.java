package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("tx")
public class Scene {

	@ObfuscatedName("tx.e")
	public static boolean field6937 = true;

	@ObfuscatedName("tx.n")
	public final int field6900;

	@ObfuscatedName("tx.m")
	public final int field6901;

	@ObfuscatedName("tx.k")
	public final int field6924;

	@ObfuscatedName("tx.f")
	public final int field6903 = 16;

	@ObfuscatedName("tx.w")
	public final Renderer field6907;

	@ObfuscatedName("tx.l")
	public class767 field6912;

	@ObfuscatedName("tx.u")
	public final boolean field6906;

	@ObfuscatedName("tx.z")
	public boolean field6955;

	@ObfuscatedName("tx.p")
	public final class555 field6930;

	@ObfuscatedName("tx.d")
	public int field6909;

	@ObfuscatedName("tx.c")
	public final int field6910;

	@ObfuscatedName("tx.r")
	public final int field6911;

	@ObfuscatedName("tx.v")
	public class551[][][] field6928;

	@ObfuscatedName("tx.o")
	public FloorModel[] field6913;

	@ObfuscatedName("tx.s")
	public class551[][][] field6904;

	@ObfuscatedName("tx.y")
	public FloorModel[] field6915;

	@ObfuscatedName("tx.q")
	public class551[][][] field6914;

	@ObfuscatedName("tx.x")
	public FloorModel[] field6917;

	@ObfuscatedName("tx.b")
	public int[][] field6923;

	@ObfuscatedName("tx.h")
	public short[][] field6919;

	@ObfuscatedName("tx.a")
	public byte[][] field6936;

	@ObfuscatedName("tx.g")
	public byte[][] field6921;

	@ObfuscatedName("tx.i")
	public byte[][] field6963;

	@ObfuscatedName("tx.j")
	public byte[][] field6905;

	@ObfuscatedName("tx.t")
	public int field6961 = 0;

	@ObfuscatedName("tx.ae")
	public final int field6925 = 10078;

	@ObfuscatedName("tx.ag")
	public final int field6899 = 5096;

	@ObfuscatedName("tx.ah")
	public final int field6932 = 5005;

	@ObfuscatedName("tx.al")
	public final GraphEntity[] field6916;

	@ObfuscatedName("tx.ac")
	public final GraphEntity[] field6929;

	@ObfuscatedName("tx.ai")
	public final GraphEntity[] field6945;

	@ObfuscatedName("tx.aw")
	public int field6931;

	@ObfuscatedName("tx.as")
	public int field6918;

	@ObfuscatedName("tx.at")
	public final GraphEntity[] field6933;

	@ObfuscatedName("tx.ad")
	public final GraphEntity[] field6934;

	@ObfuscatedName("tx.am")
	public final PrimaryLayerEntity[] field6935;

	@ObfuscatedName("tx.au")
	public int field6902;

	@ObfuscatedName("tx.ar")
	public int field6947;

	@ObfuscatedName("tx.ap")
	public int field6938;

	@ObfuscatedName("tx.aq")
	public int field6939;

	@ObfuscatedName("tx.ax")
	public int field6940;

	@ObfuscatedName("tx.av")
	public int field6941;

	@ObfuscatedName("tx.ao")
	public int field6942;

	@ObfuscatedName("tx.aj")
	public int field6943;

	@ObfuscatedName("tx.ay")
	public int field6944;

	@ObfuscatedName("tx.ab")
	public int field6949;

	@ObfuscatedName("tx.az")
	public int field6946;

	@ObfuscatedName("tx.aa")
	public int field6920;

	@ObfuscatedName("tx.af")
	public int field6948;

	@ObfuscatedName("tx.ak")
	public final float[] field6927 = new float[3];

	@ObfuscatedName("tx.an")
	public final Light[] field6950 = new Light[8];

	@ObfuscatedName("tx.bf")
	public final int field6951 = 1;

	@ObfuscatedName("tx.bk")
	public int field6953;

	@ObfuscatedName("tx.bh")
	public long[][][] field6954;

	@ObfuscatedName("tx.bx")
	public class554[] field6926;

	@ObfuscatedName("tx.bd")
	public boolean[] field6956;

	@ObfuscatedName("tx.bc")
	public HashMap field6957 = new HashMap();

	@ObfuscatedName("tx.bi")
	public HashMap field6958 = new HashMap();

	@ObfuscatedName("tx.bn")
	public class548 field6959;

	@ObfuscatedName("tx.bt")
	public boolean[][] field6960;

	@ObfuscatedName("tx.bq")
	public final int[] field6908;

	@ObfuscatedName("tx.bm")
	public boolean[][] field6962;

	@ObfuscatedName("tx.bb")
	public boolean[][] field6922;

	public Scene(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		this.field6907 = arg0;
		this.field6906 = this.field6907.method2114() > 0;
		this.field6900 = arg1;
		this.field6901 = 0x1 << this.field6900;
		this.field6924 = this.field6901 >> 1;
		this.field6909 = arg2;
		this.field6910 = arg3;
		this.field6911 = arg4;
		this.field6942 = arg5;
		this.field6912 = new class767();
		this.field6930 = new class555(this);
		this.field6904 = new class551[arg2][this.field6910][this.field6911];
		this.field6915 = new FloorModel[arg2];
		if (arg6) {
			this.field6923 = new int[this.field6910][this.field6911];
			this.field6936 = new byte[this.field6910][this.field6911];
			this.field6919 = new short[this.field6910][this.field6911];
			this.field6921 = new byte[this.field6910][this.field6911];
			this.field6963 = new byte[this.field6910][this.field6911];
			this.field6905 = new byte[this.field6910][this.field6911];
			this.field6914 = new class551[1][this.field6910][this.field6911];
			this.field6917 = new FloorModel[1];
		}
		if (arg7) {
			this.field6954 = new long[arg2][arg3][arg4];
			this.field6926 = new class554[65253];
			this.field6956 = new boolean[65253];
			this.field6953 = 0;
		}
		this.method8703(false);
		this.field6916 = new GraphEntity[2];
		this.field6929 = new GraphEntity[2];
		this.field6945 = new GraphEntity[2];
		this.field6934 = new GraphEntity[10078];
		this.field6931 = 0;
		this.field6933 = new GraphEntity[5096];
		this.field6918 = 0;
		this.field6935 = new PrimaryLayerEntity[5005];
		this.field6961 = 0;
		this.field6962 = new boolean[this.field6942 + this.field6942 + 1][this.field6942 + this.field6942 + 1];
		this.field6960 = new boolean[this.field6942 + this.field6942 + 2][this.field6942 + this.field6942 + 2];
		this.field6908 = new int[this.field6942 + this.field6942 + 2];
		this.field6959 = new class548(false);
	}

	@ObfuscatedName("tx.e(IB)V")
	public void method8701(int arg0) {
	}

	@ObfuscatedName("tx.n(Leu;B)V")
	public void method8737(class140 arg0) {
	}

	@ObfuscatedName("tx.m(ZI)V")
	public void method8703(boolean arg0) {
		if (arg0) {
			this.field6928 = this.field6914;
			this.field6913 = this.field6917;
		} else {
			this.field6928 = this.field6904;
			this.field6913 = this.field6915;
		}
		this.field6909 = this.field6928.length;
	}

	@ObfuscatedName("tx.k(I)V")
	public void method8875() {
		for (int var1 = 0; var1 < this.field6910; var1++) {
			for (int var2 = 0; var2 < this.field6911; var2++) {
				if (this.field6928[0][var1][var2] == null) {
					this.field6928[0][var1][var2] = new class551(0);
				}
			}
		}
	}

	@ObfuscatedName("tx.f(III)V")
	public void method8705(int arg0, int arg1) {
		class551 var3 = this.field6928[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			class551 var5 = this.field6928[var4][arg0][arg1] = this.field6928[var4 + 1][arg0][arg1];
			if (var5 != null) {
				for (PrimaryLayerEntityList var6 = var5.field6964; var6 != null; var6 = var6.field7058) {
					PrimaryLayerEntity var7 = var6.field7057;
					if (var7.field12471 == arg0 && var7.field12468 == arg1) {
						var7.field11717--;
					}
				}
				if (var5.field6974 != null) {
					var5.field6974.field11717--;
				}
				if (var5.field6966 != null) {
					var5.field6966.field11717--;
				}
				if (var5.field6967 != null) {
					var5.field6967.field11717--;
				}
				if (var5.field6968 != null) {
					var5.field6968.field11717--;
				}
				if (var5.field6976 != null) {
					var5.field6976.field11717--;
				}
			}
		}
		if (this.field6928[0][arg0][arg1] == null) {
			this.field6928[0][arg0][arg1] = new class551(0);
			this.field6928[0][arg0][arg1].field6970 = 1;
		}
		this.field6928[0][arg0][arg1].field6965 = var3;
		this.field6928[3][arg0][arg1] = null;
	}

	@ObfuscatedName("tx.w(IIIB)Ltk;")
	public class551 method8706(int arg0, int arg1, int arg2) {
		if (this.field6928[arg0][arg1][arg2] == null) {
			boolean var4 = this.field6928[0][arg1][arg2] != null && this.field6928[0][arg1][arg2].field6965 != null;
			if (var4 && arg0 >= this.field6909 - 1) {
				return null;
			}
			this.method8851(arg0, arg1, arg2);
		}
		return this.field6928[arg0][arg1][arg2];
	}

	@ObfuscatedName("tx.l(IIIB)Ltk;")
	public class551 method8707(int arg0, int arg1, int arg2) {
		return this.method8706(arg0, Math.min(this.field6910 - 1, Math.max(0, arg1)), Math.min(this.field6911 - 1, Math.max(0, arg2)));
	}

	@ObfuscatedName("tx.u(IIII)V")
	public void method8851(int arg0, int arg1, int arg2) {
		boolean var4 = this.field6928[0][arg1][arg2] != null && this.field6928[0][arg1][arg2].field6965 != null;
		for (int var5 = arg0; var5 >= 0; var5--) {
			if (this.field6928[var5][arg1][arg2] == null) {
				class551 var6 = this.field6928[var5][arg1][arg2] = new class551(var5);
				if (var4) {
					var6.field6970++;
				}
			}
		}
	}

	@ObfuscatedName("tx.z(ILcb;I)V")
	public void method8709(int arg0, FloorModel arg1) {
		this.field6913[arg0] = arg1;
	}

	@ObfuscatedName("tx.p(III)I")
	public int method8710(int arg0, int arg1) {
		return this.field6919 == null ? 0 : this.field6919[arg0][arg1] & 0xFFFF;
	}

	@ObfuscatedName("tx.d(IIB)I")
	public int method8729(int arg0, int arg1) {
		return this.field6923 == null ? 0 : this.field6923[arg0][arg1] & 0xFFFFFF;
	}

	@ObfuscatedName("tx.c(III)I")
	public int method8790(int arg0, int arg1) {
		return this.field6936 == null ? 0 : this.field6936[arg0][arg1] & 0xFF;
	}

	@ObfuscatedName("tx.r(IIS)I")
	public int method8713(int arg0, int arg1) {
		return this.field6921 == null ? 0 : this.field6921[arg0][arg1] & 0xFF;
	}

	@ObfuscatedName("tx.v(IIB)I")
	public int method8760(int arg0, int arg1) {
		return this.field6963 == null ? 0 : this.field6963[arg0][arg1] & 0xFF;
	}

	@ObfuscatedName("tx.o(IIB)I")
	public int method8715(int arg0, int arg1) {
		return this.field6905 == null ? 0 : this.field6905[arg0][arg1] & 0xFF;
	}

	@ObfuscatedName("tx.s(IIIIIIIII)V")
	public void method8716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field6923 != null) {
			this.field6923[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.field6919 != null) {
			this.field6919[arg0][arg1] = (short) arg3;
		}
		if (this.field6936 != null) {
			this.field6936[arg0][arg1] = (byte) arg4;
		}
		if (this.field6921 != null) {
			this.field6921[arg0][arg1] = (byte) arg5;
		}
		if (this.field6963 != null) {
			this.field6963[arg0][arg1] = (byte) arg6;
		}
		if (this.field6905 != null) {
			this.field6905[arg0][arg1] = (byte) arg7;
		}
	}

	@ObfuscatedName("tx.y(IIILasv;B)V")
	public void method8717(int arg0, int arg1, int arg2, GroundDecorLayerEntity arg3) {
		class551 var5 = this.method8706(arg0, arg1, arg2);
		if (var5 == null) {
			return;
		}
		var5.field6974 = arg3;
		int var6 = this.field6917 == this.field6913 ? 1 : 0;
		if (!arg3.method16488()) {
			arg3.field11712 = this.field6945[var6];
			this.field6945[var6] = arg3;
		} else if (arg3.method16489()) {
			arg3.field11712 = this.field6929[var6];
			this.field6929[var6] = arg3;
		} else {
			arg3.field11712 = this.field6916[var6];
			this.field6916[var6] = arg3;
		}
	}

	@ObfuscatedName("tx.q(IIIILast;S)V")
	public void method8718(int arg0, int arg1, int arg2, int arg3, class1199 arg4) {
		class551 var6 = this.method8706(arg0, arg1, arg2);
		if (var6 == null) {
			return;
		}
		arg4.method10531(new Vector3((float) ((arg1 << this.field6900) + this.field6924), (float) arg3, (float) ((arg2 << this.field6900) + this.field6924)));
		var6.field6971 = arg4;
		int var7 = this.field6917 == this.field6913 ? 1 : 0;
		if (!arg4.method16488()) {
			arg4.field11712 = this.field6945[var7];
			this.field6945[var7] = arg4;
		} else if (arg4.method16489()) {
			arg4.field11712 = this.field6929[var7];
			this.field6929[var7] = arg4;
		} else {
			arg4.field11712 = this.field6916[var7];
			this.field6916[var7] = arg4;
		}
	}

	@ObfuscatedName("tx.x(IIILasw;Lasw;I)V")
	public void method8719(int arg0, int arg1, int arg2, WallLayerEntity arg3, WallLayerEntity arg4) {
		class551 var6 = this.method8706(arg0, arg1, arg2);
		if (var6 == null) {
			return;
		}
		var6.field6966 = arg3;
		var6.field6967 = arg4;
		int var7 = this.field6917 == this.field6913 ? 1 : 0;
		if (!arg3.method16488()) {
			arg3.field11712 = this.field6945[var7];
			this.field6945[var7] = arg3;
		} else if (arg3.method16489()) {
			arg3.field11712 = this.field6929[var7];
			this.field6929[var7] = arg3;
		} else {
			arg3.field11712 = this.field6916[var7];
			this.field6916[var7] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method16488()) {
			arg4.field11712 = this.field6945[var7];
			this.field6945[var7] = arg4;
		} else if (arg4.method16489()) {
			arg4.field11712 = this.field6929[var7];
			this.field6929[var7] = arg4;
		} else {
			arg4.field11712 = this.field6916[var7];
			this.field6916[var7] = arg4;
		}
	}

	@ObfuscatedName("tx.b(IIILasm;Lasm;B)V")
	public void method8752(int arg0, int arg1, int arg2, WallDecorLayerEntity arg3, WallDecorLayerEntity arg4) {
		class551 var6 = this.method8706(arg0, arg1, arg2);
		if (var6 == null) {
			return;
		}
		var6.field6968 = arg3;
		var6.field6976 = arg4;
		int var7 = this.field6917 == this.field6913 ? 1 : 0;
		if (!arg3.method16488()) {
			arg3.field11712 = this.field6945[var7];
			this.field6945[var7] = arg3;
		} else if (arg3.method16489()) {
			arg3.field11712 = this.field6929[var7];
			this.field6929[var7] = arg3;
		} else {
			arg3.field11712 = this.field6916[var7];
			this.field6916[var7] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method16488()) {
			arg4.field11712 = this.field6945[var7];
			this.field6945[var7] = arg4;
		} else if (arg4.method16489()) {
			arg4.field11712 = this.field6929[var7];
			this.field6929[var7] = arg4;
		} else {
			arg4.field11712 = this.field6916[var7];
			this.field6916[var7] = arg4;
		}
	}

	@ObfuscatedName("tx.h(Lash;ZI)Z")
	public boolean method8768(PrimaryLayerEntity arg0, boolean arg1) {
		boolean var3 = this.field6917 == this.field6913;
		int var4 = 0;
		short var5 = 0;
		byte var6 = 0;
		arg0.method16529();
		short var7 = 0;
		int var8 = Math.min(this.field6910 - 1, Math.max(0, arg0.field12471));
		int var9 = Math.min(this.field6910 - 1, Math.max(0, arg0.field12472));
		int var10 = Math.min(this.field6911 - 1, Math.max(0, arg0.field12468));
		int var11 = Math.min(this.field6911 - 1, Math.max(0, arg0.field12467));
		for (int var12 = var8; var12 <= var9; var12++) {
			for (int var13 = var10; var13 <= var11; var13++) {
				class551 var14 = this.method8707(arg0.field11717, var12, var13);
				if (var14 != null) {
					PrimaryLayerEntityList var15 = PrimaryLayerEntityList.method644(arg0);
					PrimaryLayerEntityList var16 = var14.field6964;
					if (var16 == null) {
						var14.field6964 = var15;
					} else {
						while (var16.field7058 != null) {
							var16 = var16.field7058;
						}
						var16.field7058 = var15;
					}
					if (var3 && (this.field6923[var12][var13] & 0xFF000000) != 0) {
						var4 = this.field6923[var12][var13];
						var5 = this.field6919[var12][var13];
						var6 = this.field6936[var12][var13];
					}
					if (!arg1 && var14.field6974 != null && var14.field6974.field12448 > var7) {
						var7 = var14.field6974.field12448;
					}
				}
			}
		}
		if (var3 && (var4 & 0xFF000000) != 0) {
			for (int var17 = var8; var17 <= var9; var17++) {
				for (int var18 = var10; var18 <= var11; var18++) {
					if ((this.field6923[var17][var18] & 0xFF000000) == 0) {
						this.field6923[var17][var18] = var4;
						this.field6919[var17][var18] = var5;
						this.field6936[var17][var18] = var6;
					}
				}
			}
		}
		if (arg1) {
			this.field6935[++this.field6961 - 1] = arg0;
			arg0.field11716 = this;
		} else {
			int var19 = this.field6917 == this.field6913 ? 1 : 0;
			if (!arg0.method16488()) {
				arg0.field11712 = this.field6945[var19];
				this.field6945[var19] = arg0;
			} else if (arg0.method16489()) {
				arg0.field11712 = this.field6929[var19];
				this.field6929[var19] = arg0;
			} else {
				arg0.field11712 = this.field6916[var19];
				this.field6916[var19] = arg0;
			}
		}
		if (arg1) {
			Vector3 var20 = Vector3.method6484(arg0.method10536().field4298);
			var20.field4311 -= var7;
			arg0.method10531(var20);
			var20.method6486();
		}
		return true;
	}

	@ObfuscatedName("tx.a(IIIII)V")
	public void method8765(int arg0, int arg1, int arg2, int arg3) {
		class551 var5 = this.field6928[arg0][arg1][arg2];
		if (var5 == null) {
			return;
		}
		WallDecorLayerEntity var6 = var5.field6968;
		WallDecorLayerEntity var7 = var5.field6976;
		if (var6 != null) {
			var6.field12452 = (short) (var6.field12452 * arg3 / (0x10 << this.field6900 - 7));
			var6.field12451 = (short) (var6.field12451 * arg3 / (0x10 << this.field6900 - 7));
		}
		if (var7 != null) {
			var7.field12452 = (short) (var7.field12452 * arg3 / (0x10 << this.field6900 - 7));
			var7.field12451 = (short) (var7.field12451 * arg3 / (0x10 << this.field6900 - 7));
		}
	}

	@ObfuscatedName("tx.g(I)V")
	public void method8723() {
		for (int var1 = 0; var1 < this.field6961; var1++) {
			PrimaryLayerEntity var2 = this.field6935[var1];
			this.method8708(var2, true);
			this.field6935[var1] = null;
		}
		this.field6961 = 0;
	}

	@ObfuscatedName("tx.i(IIIB)Lasw;")
	public WallLayerEntity method8724(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 != null) {
			this.method8732(var4.field6966);
			if (var4.field6966 != null) {
				WallLayerEntity var5 = var4.field6966;
				var4.field6966 = null;
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.j(IIIB)Lasw;")
	public WallLayerEntity method8881(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 != null) {
			this.method8732(var4.field6967);
			if (var4.field6967 != null) {
				WallLayerEntity var5 = var4.field6967;
				var4.field6967 = null;
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.t(IIII)Lasm;")
	public WallDecorLayerEntity method8726(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 != null) {
			this.method8732(var4.field6968);
			if (var4.field6968 != null) {
				WallDecorLayerEntity var5 = var4.field6968;
				var4.field6968 = null;
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ae(IIII)Lasm;")
	public WallDecorLayerEntity method8727(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 != null) {
			this.method8732(var4.field6976);
			if (var4.field6976 != null) {
				WallDecorLayerEntity var5 = var4.field6976;
				var4.field6976 = null;
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ag(IIIB)Lasv;")
	public GroundDecorLayerEntity method8728(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		this.method8732(var4.field6974);
		if (var4.field6974 == null) {
			return null;
		} else {
			GroundDecorLayerEntity var5 = var4.field6974;
			var4.field6974 = null;
			return var5;
		}
	}

	@ObfuscatedName("tx.ah(IIIB)Last;")
	public class1199 method8742(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		} else {
			class1199 var5 = var4.field6971;
			var4.field6971 = null;
			this.method8732(var5);
			return var5;
		}
	}

	@ObfuscatedName("tx.al(IIILtd;I)Lash;")
	public PrimaryLayerEntity method8712(int arg0, int arg1, int arg2, class553 arg3) {
		class551 var5 = this.field6928[arg0][arg1][arg2];
		if (var5 == null) {
			return null;
		}
		for (PrimaryLayerEntityList var6 = var5.field6964; var6 != null; var6 = var6.field7058) {
			PrimaryLayerEntity var7 = var6.field7057;
			if ((arg3 == null || arg3.method478(var7)) && var7.field12471 == arg1 && var7.field12468 == arg2) {
				this.method8708(var7, false);
				return var7;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.ac(Lash;ZI)V")
	public void method8708(PrimaryLayerEntity arg0, boolean arg1) {
		int var3 = Math.min(this.field6910 - 1, Math.max(0, arg0.field12471));
		int var4 = Math.min(this.field6910 - 1, Math.max(0, arg0.field12472));
		int var5 = Math.min(this.field6911 - 1, Math.max(0, arg0.field12468));
		int var6 = Math.min(this.field6911 - 1, Math.max(0, arg0.field12467));
		for (int var7 = var3; var7 <= var4; var7++) {
			for (int var8 = var5; var8 <= var6; var8++) {
				class551 var9 = this.field6928[arg0.field11717][var7][var8];
				if (var9 != null) {
					PrimaryLayerEntityList var10 = var9.field6964;
					PrimaryLayerEntityList var11 = null;
					while (var10 != null) {
						if (var10.field7057 == arg0) {
							if (var11 == null) {
								var9.field6964 = var10.field7058;
							} else {
								var11.field7058 = var10.field7058;
							}
							var10.method8973();
							break;
						}
						var11 = var10;
						var10 = var10.field7058;
					}
				}
			}
		}
		if (!arg1) {
			this.method8732(arg0);
		}
	}

	@ObfuscatedName("tx.ai(Lalh;B)V")
	public void method8732(GraphEntity arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method10537();
		for (int var2 = 0; var2 < 2; var2++) {
			GraphEntity var3 = null;
			for (GraphEntity var4 = this.field6916[var2]; var4 != null; var4 = var4.field11712) {
				if (arg0 == var4) {
					if (var3 == null) {
						this.field6916[var2] = var4.field11712;
					} else {
						var3.field11712 = var4.field11712;
					}
					return;
				}
				var3 = var4;
			}
			GraphEntity var5 = null;
			for (GraphEntity var6 = this.field6929[var2]; var6 != null; var6 = var6.field11712) {
				if (arg0 == var6) {
					if (var5 == null) {
						this.field6929[var2] = var6.field11712;
					} else {
						var5.field11712 = var6.field11712;
					}
					return;
				}
				var5 = var6;
			}
			GraphEntity var7 = null;
			for (GraphEntity var8 = this.field6945[var2]; var8 != null; var8 = var8.field11712) {
				if (arg0 == var8) {
					if (var7 == null) {
						this.field6945[var2] = var8.field11712;
					} else {
						var7.field11712 = var8.field11712;
					}
					return;
				}
				var7 = var8;
			}
		}
	}

	@ObfuscatedName("tx.aw(IIII)Lasw;")
	public WallLayerEntity method8711(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null ? null : var4.field6966;
	}

	@ObfuscatedName("tx.as(IIII)Lasw;")
	public WallLayerEntity method8880(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null ? null : var4.field6967;
	}

	@ObfuscatedName("tx.at(IIII)Lasm;")
	public WallDecorLayerEntity method8735(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null ? null : var4.field6968;
	}

	@ObfuscatedName("tx.ad(IIIB)Last;")
	public class1199 method8736(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null ? null : var4.field6971;
	}

	@ObfuscatedName("tx.am(IIILtd;B)Lash;")
	public PrimaryLayerEntity method8856(int arg0, int arg1, int arg2, class553 arg3) {
		class551 var5 = this.field6928[arg0][arg1][arg2];
		if (var5 == null) {
			return null;
		}
		for (PrimaryLayerEntityList var6 = var5.field6964; var6 != null; var6 = var6.field7058) {
			PrimaryLayerEntity var7 = var6.field7057;
			if ((arg3 == null || arg3.method478(var7)) && var7.field12471 == arg1 && var7.field12468 == arg2) {
				return var7;
			}
		}
		return null;
	}

	@ObfuscatedName("tx.au(IIIB)Luc;")
	public PrimaryLayerEntityList method8738(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null ? null : var4.field6964;
	}

	@ObfuscatedName("tx.ar(IIII)Lasv;")
	public GroundDecorLayerEntity method8767(int arg0, int arg1, int arg2) {
		class551 var4 = this.field6928[arg0][arg1][arg2];
		return var4 == null || var4.field6974 == null ? null : var4.field6974;
	}

	@ObfuscatedName("tx.ap()V")
	public void method8740() {
		for (int var1 = 0; var1 < this.field6909; var1++) {
			for (int var2 = 0; var2 < this.field6910; var2++) {
				for (int var3 = 0; var3 < this.field6911; var3++) {
					class551 var4 = this.field6928[var1][var2][var3];
					if (var4 != null) {
						WallLayerEntity var5 = var4.field6966;
						WallLayerEntity var6 = var4.field6967;
						if (var5 != null && var5.method17379()) {
							this.method8842(var5, var1, var2, var3, 1, 1);
							if (var6 != null && var6.method17379()) {
								this.method8842(var6, var1, var2, var3, 1, 1);
								var6.method17377(this.field6907, var5, 0, 0, 0, false);
								var6.method17378();
							}
							var5.method17378();
						}
						for (PrimaryLayerEntityList var7 = var4.field6964; var7 != null; var7 = var7.field7058) {
							PrimaryLayerEntity var8 = var7.field7057;
							if (var8 != null && var8.method17379()) {
								this.method8842(var8, var1, var2, var3, var8.field12472 - var8.field12471 + 1, var8.field12467 - var8.field12468 + 1);
								var8.method17378();
							}
						}
						GroundDecorLayerEntity var9 = var4.field6974;
						if (var9 != null && var9.method17379()) {
							this.method8741(var9, var1, var2, var3);
							var9.method17378();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tx.aq(Lalh;IIIS)V")
	public void method8741(GraphEntity arg0, int arg1, int arg2, int arg3) {
		if (arg2 < this.field6910) {
			class551 var5 = this.field6928[arg1][arg2 + 1][arg3];
			if (var5 != null && var5.field6974 != null && var5.field6974.method17379()) {
				int var6 = (this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3 + 1)) / 4 - (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1)) / 4;
				arg0.method17377(this.field6907, var5.field6974, this.field6901, var6, 0, true);
			}
		}
		if (arg3 < this.field6910) {
			class551 var7 = this.field6928[arg1][arg2][arg3 + 1];
			if (var7 != null && var7.field6974 != null && var7.field6974.method17379()) {
				int var8 = (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1) + this.field6913[arg1].method1529(arg2, arg3 + 1 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1 + 1)) / 4 - (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1)) / 4;
				arg0.method17377(this.field6907, var7.field6974, 0, var8, this.field6901, true);
			}
		}
		if (arg2 < this.field6910 && arg3 < this.field6911) {
			class551 var9 = this.field6928[arg1][arg2 + 1][arg3 + 1];
			if (var9 != null && var9.field6974 != null && var9.field6974.method17379()) {
				int var10 = (this.field6913[arg1].method1529(arg2 + 1, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1 + 1) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3 + 1 + 1)) / 4 - (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1)) / 4;
				arg0.method17377(this.field6907, var9.field6974, this.field6901, var10, this.field6901, true);
			}
		}
		if (arg2 >= this.field6910 || arg3 <= 0) {
			return;
		}
		class551 var11 = this.field6928[arg1][arg2 + 1][arg3 - 1];
		if (var11 != null && var11.field6974 != null && var11.field6974.method17379()) {
			int var12 = (this.field6913[arg1].method1529(arg2 + 1, arg3 - 1) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3 - 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1 - 1) + this.field6913[arg1].method1529(arg2 + 1 + 1, arg3 + 1 - 1)) / 4 - (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1)) / 4;
			arg0.method17377(this.field6907, var11.field6974, this.field6901, var12, -this.field6901, true);
		}
	}

	@ObfuscatedName("tx.ax(Lalh;IIIII)V")
	public void method8842(GraphEntity arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg3 - 1;
		int var11 = arg3 + arg5;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (this.field6909 != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.field6910) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.field6911 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
								class551 var15 = this.field6928[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.field6913[var12].method1529(var13, var14) + this.field6913[var12].method1529(var13 + 1, var14) + this.field6913[var12].method1529(var13, var14 + 1) + this.field6913[var12].method1529(var13 + 1, var14 + 1)) / 4 - (this.field6913[arg1].method1529(arg2, arg3) + this.field6913[arg1].method1529(arg2 + 1, arg3) + this.field6913[arg1].method1529(arg2, arg3 + 1) + this.field6913[arg1].method1529(arg2 + 1, arg3 + 1)) / 4;
									WallLayerEntity var17 = var15.field6966;
									WallLayerEntity var18 = var15.field6967;
									if (var17 != null && var17.method17379()) {
										arg0.method17377(this.field6907, var17, this.field6924 * (1 - arg4) + this.field6901 * (var13 - arg2), var16, this.field6924 * (1 - arg5) + this.field6901 * (var14 - arg3), var7);
									}
									if (var18 != null && var18.method17379()) {
										arg0.method17377(this.field6907, var18, this.field6924 * (1 - arg4) + this.field6901 * (var13 - arg2), var16, this.field6924 * (1 - arg5) + this.field6901 * (var14 - arg3), var7);
									}
									for (PrimaryLayerEntityList var19 = var15.field6964; var19 != null; var19 = var19.field7058) {
										PrimaryLayerEntity var20 = var19.field7057;
										if (var20 != null && var20.method17379() && (var20.field12471 == var13 || var8 == var13) && (var20.field12468 == var14 || var10 == var14)) {
											int var21 = var20.field12472 - var20.field12471 + 1;
											int var22 = var20.field12467 - var20.field12468 + 1;
											arg0.method17377(this.field6907, var20, this.field6924 * (var21 - arg4) + this.field6901 * (var20.field12471 - arg2), var16, this.field6924 * (var22 - arg5) + this.field6901 * (var20.field12468 - arg3), var7);
										}
									}
								}
							}
						}
					}
				}
				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("tx.av(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method8845(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, boolean arg17) {
		this.field6930.field7017 = true;
		this.field6955 = arg15;
		this.field6902 = arg1 >> this.field6900;
		this.field6947 = arg3 >> this.field6900;
		this.field6938 = arg1;
		this.field6939 = arg3;
		this.field6940 = arg2;
		this.field6949 = this.field6902 - this.field6942;
		if (this.field6949 < 0) {
			this.field6943 = -(this.field6949);
			this.field6949 = 0;
		} else {
			this.field6943 = 0;
		}
		this.field6920 = this.field6947 - this.field6942;
		if (this.field6920 < 0) {
			this.field6944 = -(this.field6920);
			this.field6920 = 0;
		} else {
			this.field6944 = 0;
		}
		this.field6946 = this.field6942 + this.field6902;
		if (this.field6946 > this.field6910) {
			this.field6946 = this.field6910;
		}
		this.field6948 = this.field6947 + this.field6942;
		if (this.field6948 > this.field6911) {
			this.field6948 = this.field6911;
		}
		boolean[][] var19 = this.field6962;
		boolean[][] var20 = this.field6960;
		if (this.field6955) {
			for (int var21 = 0; var21 < this.field6942 + this.field6942 + 2; var21++) {
				int var22 = 0;
				int var23 = 0;
				for (int var24 = 0; var24 < this.field6942 + this.field6942 + 2; var24++) {
					if (var24 > 1) {
						this.field6908[var24 - 2] = var22;
					}
					var22 = var23;
					int var25 = this.field6902 - this.field6942 + var21;
					int var26 = this.field6947 - this.field6942 + var24;
					if (var25 >= 0 && var26 >= 0 && var25 < this.field6910 && var26 < this.field6911) {
						int var27 = var25 << this.field6900;
						int var28 = var26 << this.field6900;
						int var29 = this.field6915[this.field6915.length - 1].method1529(var25, var26) - (0x3E8 << this.field6900 - 7);
						int var30 = (this.field6917 == null ? this.field6915[0].method1529(var25, var26) + this.field6901 : this.field6917[0].method1529(var25, var26) + this.field6901) + (0x3E8 << this.field6900 - 7);
						var23 = this.field6907.method2348(var27, var29, var28, var27, var30, var28);
						this.field6960[var21][var24] = var23 == 0;
					} else {
						var23 = -1;
						this.field6960[var21][var24] = false;
					}
					if (var21 > 0 && var24 > 0) {
						int var31 = this.field6908[var24 - 1] & this.field6908[var24] & var22 & var23;
						this.field6962[var21 - 1][var24 - 1] = var31 == 0;
					}
				}
				this.field6908[this.field6942 + this.field6942] = var22;
				this.field6908[this.field6942 + this.field6942 + 1] = var23;
			}
			if (arg17) {
				this.field6930.field7035 = arg5;
				this.field6930.field7036 = arg6;
				this.field6930.field7027 = arg7;
				this.field6930.field7042 = arg8;
				this.field6930.field7039 = arg9;
				this.field6930.method8923(this.field6907, arg10);
			} else {
				this.field6930.field7017 = false;
			}
		} else {
			if (this.field6922 == null) {
				this.field6922 = new boolean[this.field6942 + this.field6942 + 2][this.field6942 + this.field6942 + 2];
			}
			for (int var32 = 0; var32 < this.field6922.length; var32++) {
				for (int var33 = 0; var33 < this.field6922[0].length; var33++) {
					this.field6922[var32][var33] = true;
				}
			}
			this.field6960 = this.field6922;
			this.field6962 = this.field6922;
			this.field6949 = 0;
			this.field6920 = 0;
			this.field6946 = this.field6910;
			this.field6948 = this.field6911;
			this.field6930.field7017 = false;
		}
		class633.method8460(this, this.field6907);
		if (!this.field6959.field6884) {
			Iterator var34 = this.field6959.field6885.iterator();
			while (var34.hasNext()) {
				PickableEntity var35 = (PickableEntity) var34.next();
				var34.remove();
				Statics.method3657(var35);
			}
		}
		if (this.field6906) {
			for (int var36 = 0; var36 < this.field6953; var36++) {
				this.field6926[var36].method8898(arg0, arg14);
			}
		}
		if (this.field6914 != null) {
			this.method8703(true);
			this.field6907.method2245(-1, new class131(1583160, 40, 127, 63, 0, 0, 0));
			this.method8744(true, arg4, arg10, arg11, arg16);
			this.field6907.method2247();
			this.method8703(false);
		}
		this.method8744(false, arg4, arg10, arg11, arg16);
		if (!this.field6955) {
			this.field6962 = var19;
			this.field6960 = var20;
		}
	}

	@ObfuscatedName("tx.ao(Z[[[BIBI)V")
	public void method8744(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
		int var6 = arg0 ? 1 : 0;
		this.field6931 = 0;
		this.field6918 = 0;
		this.field6941++;
		if ((arg4 & 0x2) == 0) {
			for (GraphEntity var7 = this.field6916[var6]; var7 != null; var7 = var7.field11712) {
				this.method8745(var7);
				if (var7.field11715 != -1 && !this.method8748(var7, arg0, arg1, arg2, arg3)) {
					this.field6934[++this.field6931 - 1] = var7;
				}
			}
		}
		if ((arg4 & 0x1) == 0) {
			for (GraphEntity var8 = this.field6929[var6]; var8 != null; var8 = var8.field11712) {
				this.method8745(var8);
				if (var8.field11715 != -1 && !this.method8748(var8, arg0, arg1, arg2, arg3)) {
					this.field6933[++this.field6918 - 1] = var8;
				}
			}
			for (GraphEntity var9 = this.field6945[var6]; var9 != null; var9 = var9.field11712) {
				this.method8745(var9);
				if (var9.field11715 != -1 && !this.method8748(var9, arg0, arg1, arg2, arg3)) {
					if (var9.method16489()) {
						this.field6933[++this.field6918 - 1] = var9;
					} else {
						this.field6934[++this.field6931 - 1] = var9;
					}
				}
			}
			if (!arg0) {
				for (int var10 = 0; var10 < this.field6961; var10++) {
					this.method8745(this.field6935[var10]);
					if (this.field6935[var10].field11715 != -1 && !this.method8748(this.field6935[var10], arg0, arg1, arg2, arg3)) {
						if (this.field6935[var10].method16489()) {
							this.field6933[++this.field6918 - 1] = this.field6935[var10];
						} else {
							this.field6934[++this.field6931 - 1] = this.field6935[var10];
						}
					}
				}
			}
		}
		if (this.field6931 > 0) {
			this.method8747(this.field6934, 0, this.field6931 - 1);
			for (int var11 = 0; var11 < this.field6931; var11++) {
				this.method8749(this.field6934[var11], this.field6950);
			}
		}
		if (this.field6906) {
			this.field6907.method2491(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (int var12 = 0; var12 < this.field6909; var12++) {
				if (var12 < arg2 || arg1 == null) {
					int var21 = this.field6962.length;
					if (this.field6949 + this.field6962.length > this.field6910) {
						var21 -= this.field6949 + this.field6962.length - this.field6910;
					}
					int var22 = this.field6962[0].length;
					if (this.field6920 + this.field6962[0].length > this.field6911) {
						var22 -= this.field6920 + this.field6962[0].length - this.field6911;
					}
					boolean[][] var23 = this.field6960;
					if (this.field6955) {
						for (int var24 = this.field6943; var24 < var21; var24++) {
							int var25 = this.field6949 + var24 - this.field6943;
							for (int var26 = this.field6944; var26 < var22; var26++) {
								if (this.field6962[var24][var26] && !this.field6930.method8927(var12, var25, this.field6920 + var26 - this.field6944)) {
									var23[var24][var26] = true;
								} else {
									var23[var24][var26] = false;
								}
							}
						}
					}
					this.field6913[var12].method1548(this.field6902, this.field6947, this.field6942, this.field6960, true, arg4);
				} else {
					int var13 = this.field6962.length;
					if (this.field6949 + this.field6962.length > this.field6910) {
						var13 -= this.field6949 + this.field6962.length - this.field6910;
					}
					int var14 = this.field6962[0].length;
					if (this.field6920 + this.field6962[0].length > this.field6911) {
						var14 -= this.field6920 + this.field6962[0].length - this.field6911;
					}
					boolean[][] var15 = this.field6960;
					if (this.field6955) {
						for (int var16 = this.field6943; var16 < var13; var16++) {
							int var17 = this.field6949 + var16 - this.field6943;
							for (int var18 = this.field6944; var18 < var14; var18++) {
								var15[var16][var18] = false;
								if (this.field6962[var16][var18]) {
									int var19 = this.field6920 + var18 - this.field6944;
									for (int var20 = var12; var20 >= 0; var20--) {
										if (this.field6928[var20][var17][var19] != null && this.field6928[var20][var17][var19].field6970 == var12) {
											if ((var20 < arg2 || arg1[var20][var17][var19] != arg3) && !this.field6930.method8927(var12, var17, var19)) {
												var15[var16][var18] = true;
												break;
											}
											var15[var16][var18] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.field6913[var12].method1548(this.field6902, this.field6947, this.field6942, this.field6960, false, arg4);
				}
			}
		}
		if (this.field6918 > 0) {
			this.method8751(this.field6933, 0, this.field6918 - 1);
			for (int var27 = 0; var27 < this.field6918; var27++) {
				this.method8749(this.field6933[var27], this.field6950);
			}
		}
	}

	@ObfuscatedName("tx.aj(Lalh;I)V")
	public void method8745(GraphEntity arg0) {
		Vector3 var2 = arg0.method10536().field4298;
		this.field6907.method2525((float) var2.field4308, (float) ((int) var2.field4311 + (arg0.method16523() >> 1)), (float) var2.field4313, this.field6927);
		arg0.field11715 = (int) this.field6927[2];
	}

	@ObfuscatedName("tx.ay([Lalh;II)V")
	public void method8751(GraphEntity[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg1 + arg2) / 2;
		int var5 = arg1;
		GraphEntity var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.field11715;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].field11715 > (var8 & 0x1) + var7) {
				GraphEntity var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method8751(arg0, arg1, var5 - 1);
		this.method8751(arg0, var5 + 1, arg2);
	}

	@ObfuscatedName("tx.ab([Lalh;II)V")
	public void method8747(GraphEntity[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg1 + arg2) / 2;
		int var5 = arg1;
		GraphEntity var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.field11715;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].field11715 < (var8 & 0x1) + var7) {
				GraphEntity var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method8747(arg0, arg1, var5 - 1);
		this.method8747(arg0, var5 + 1, arg2);
	}

	@ObfuscatedName("tx.az(Lalh;Z[[[BIB)Z")
	public boolean method8748(GraphEntity arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
		if (!this.field6955) {
			return false;
		} else if (arg0 instanceof PrimaryLayerEntity) {
			short var6 = ((PrimaryLayerEntity) arg0).field12472;
			short var7 = ((PrimaryLayerEntity) arg0).field12467;
			short var8 = ((PrimaryLayerEntity) arg0).field12471;
			short var9 = ((PrimaryLayerEntity) arg0).field12468;
			for (int var10 = var8; var10 <= var6; var10++) {
				for (int var11 = var9; var11 <= var7; var11++) {
					if (arg0.field11714 < this.field6909 && var10 >= this.field6949 && var10 < this.field6946 && var11 >= this.field6920 && var11 < this.field6948) {
						if ((arg2 == null || arg0.field11717 < arg3 || arg2[arg0.field11717][var10][var11] != arg4) && arg0.method18361() && !arg0.method18360(this.field6907)) {
							return false;
						}
						if (!arg1 && var10 >= this.field6902 - 16 && var10 <= this.field6902 + 16 && var11 >= this.field6947 - 16 && var11 <= this.field6947 + 16) {
							arg0.method17373(this.field6907);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			Vector3 var12 = arg0.method10536().field4298;
			int var13 = (int) var12.field4308 >> this.field6900;
			int var14 = (int) var12.field4313 >> this.field6900;
			if (arg0.field11714 >= this.field6909 || var13 < this.field6949 || var13 >= this.field6946 || var14 < this.field6920 || var14 >= this.field6948) {
				return true;
			} else if ((arg2 == null || arg0.field11717 < arg3 || arg2[arg0.field11717][var13][var14] != arg4) && arg0.method18361() && !arg0.method18360(this.field6907)) {
				return false;
			} else {
				if (!arg1 && var13 >= this.field6902 - 16 && var13 <= this.field6902 + 16 && var14 >= this.field6947 - 16 && var14 <= this.field6947 + 16) {
					arg0.method17373(this.field6907);
				}
				return true;
			}
		}
	}

	@ObfuscatedName("tx.aa(Lalh;[Lakf;)V")
	public void method8749(GraphEntity arg0, Light[] arg1) {
		if (this.field6906) {
			int var3 = arg0.method18375(arg1);
			this.field6907.method2491(var3, arg1);
		}
		if (this.field6917 == this.field6913) {
			boolean var4 = false;
			boolean var5 = false;
			Vector3 var6 = arg0.method10536().field4298;
			int var7;
			int var8;
			if (arg0 instanceof PrimaryLayerEntity) {
				var7 = ((PrimaryLayerEntity) arg0).field12471;
				var8 = ((PrimaryLayerEntity) arg0).field12468;
			} else {
				var7 = (int) var6.field4308 >> this.field6900;
				var8 = (int) var6.field4313 >> this.field6900;
			}
			int var9 = Math.min(this.field6910 - 1, Math.max(0, var7));
			int var10 = Math.min(this.field6911 - 1, Math.max(0, var8));
			class131 var11 = new class131();
			var11.field1575 = this.method8729(var9, var10);
			var11.field1573 = this.method8710(var9, var10);
			var11.field1577 = this.method8790(var9, var10);
			var11.field1576 = this.method8713(var9, var10);
			var11.field1578 = this.method8760(var9, var10);
			var11.field1579 = this.method8715(var9, var10);
			this.field6907.method2246(this.field6915[0].method1527((int) var6.field4308, (int) var6.field4313), var11);
		}
		PickableEntity var12 = arg0.method17372(this.field6907);
		if (var12 == null) {
			return;
		}
		if (var12.field6977) {
			var12.field6978 = arg0;
			this.field6959.method8683(var12);
		} else {
			Statics.method3657(var12);
		}
	}

	@ObfuscatedName("tx.af(Lara;III[ZI)Z")
	public boolean method8750(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
		boolean var6 = false;
		if (this.field6917 != this.field6913) {
			int var7 = this.field6915[arg1].method1527(arg2, arg3);
			for (int var8 = 0; var8 <= arg1; var8++) {
				FloorModel var9 = this.field6915[var8];
				if (var9 != null) {
					int var10 = var7 - var9.method1527(arg2, arg3);
					if (arg4 != null) {
						arg4[var8] = var9.method1535(arg0, arg2, var10, arg3, 0, false);
						if (!arg4[var8]) {
							continue;
						}
					}
					var9.method1532(arg0, arg2, var10, arg3, 0, false);
					var6 = true;
				}
			}
		}
		return var6;
	}

	@ObfuscatedName("tx.ak(Lara;III[ZI)V")
	public void method8814(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
		if (this.field6917 == this.field6913) {
			return;
		}
		int var6 = this.field6915[arg1].method1527(arg2, arg3);
		for (int var7 = 0; var7 <= arg1; var7++) {
			if (arg4 == null || arg4[var7]) {
				FloorModel var8 = this.field6915[var7];
				if (var8 != null) {
					var8.method1543(arg0, arg2, var6 - var8.method1527(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("tx.an(III)V")
	public void method8870(int arg0, int arg1) {
		HardShadow var3 = null;
		for (int var4 = arg0; var4 < arg1; var4++) {
			FloorModel var5 = this.field6915[var4];
			if (var5 != null) {
				for (int var6 = 0; var6 < this.field6911; var6++) {
					for (int var7 = 0; var7 < this.field6910; var7++) {
						var3 = var5.method1531(var7, var6, var3);
						if (var3 != null) {
							int var8 = var7 << this.field6900;
							int var9 = var6 << this.field6900;
							for (int var10 = var4 - 1; var10 >= 0; var10--) {
								FloorModel var11 = this.field6915[var10];
								if (var11 != null) {
									int var12 = var5.method1529(var7, var6) - var11.method1529(var7, var6);
									int var13 = var5.method1529(var7 + 1, var6) - var11.method1529(var7 + 1, var6);
									int var14 = var5.method1529(var7 + 1, var6 + 1) - var11.method1529(var7 + 1, var6 + 1);
									int var15 = var5.method1529(var7, var6 + 1) - var11.method1529(var7, var6 + 1);
									var11.method1532(var3, var8, (var12 + var13 + var14 + var15) / 4, var9, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tx.bf(I)V")
	public void method8753() {
		this.method8870(1, this.field6909);
	}

	@ObfuscatedName("tx.bl(Lul;B)V")
	public void method8754(class554 arg0) {
		if (this.field6953 >= 65253) {
			return;
		}
		Light var2 = arg0.field7003;
		this.field6926[this.field6953] = arg0;
		this.field6956[this.field6953] = false;
		this.field6953++;
		int var3 = arg0.field7006;
		if (arg0.field7005) {
			var3 = 0;
		}
		int var4 = arg0.field7006;
		if (arg0.field7004) {
			var4 = this.field6909 - 1;
		}
		for (int var5 = var3; var5 <= var4; var5++) {
			int var6 = 0;
			int var7 = var2.method17607() - var2.method17608() + this.field6924 >> this.field6900;
			if (var7 < 0) {
				var6 -= var7;
				var7 = 0;
			}
			int var8 = var2.method17607() + var2.method17608() - this.field6924 >> this.field6900;
			if (var8 >= this.field6911) {
				var8 = this.field6911 - 1;
			}
			for (int var9 = var7; var9 <= var8; var9++) {
				short var10 = arg0.field6981[var6++];
				int var11 = (var2.method17605() - var2.method17608() + this.field6924 >> this.field6900) + (var10 >>> 8);
				int var12 = (var10 & 0xFF) + var11 - 1;
				if (var11 < 0) {
					var11 = 0;
				}
				if (var12 >= this.field6910) {
					var12 = this.field6910 - 1;
				}
				for (int var13 = var11; var13 <= var12; var13++) {
					long var14 = this.field6954[var5][var13][var9];
					if ((var14 & 0xFFFFL) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953;
					} else if ((var14 & 0xFFFF0000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 16;
					} else if ((var14 & 0xFFFF00000000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 32;
					} else if ((var14 & 0xFFFF000000000000L) == 0L) {
						this.field6954[var5][var13][var9] = var14 | (long) this.field6953 << 48;
					}
				}
			}
		}
		if (arg0.field6990 == -1) {
			return;
		}
		List var16 = (List) this.field6957.get(arg0.field6990);
		if (var16 == null) {
			var16 = new ArrayList();
			this.field6957.put(arg0.field6990, var16);
		}
		var16.add(arg0);
		Light var17 = (Light) this.field6958.get(arg0.field6990);
		if (var17 != null) {
			arg0.field7003.method17618(var17.method17624());
			arg0.field7003.method17620(var17.method17656(), var17.method17615());
			arg0.field7003.method17636(var17.method17652());
			arg0.field7003.method17621(var17.method17629(), var17.method17617());
		}
	}

	@ObfuscatedName("tx.bk(I)V")
	public void method8755() {
		for (int var1 = 0; var1 < this.field6953; var1++) {
			if (!this.field6956[var1]) {
				class554 var2 = this.field6926[var1];
				Light var3 = var2.field7003;
				int var4 = var2.field7006;
				int var5 = var3.method17608() - this.field6924;
				int var6 = (var5 * 2 >> this.field6900) + 1;
				int var7 = 0;
				int[] var8 = new int[var6 * var6];
				int var9 = var3.method17605() - var5 >> this.field6900;
				int var10 = var3.method17607() - var5 >> this.field6900;
				int var11 = var3.method17607() + var5 >> this.field6900;
				if (var10 < 0) {
					var7 -= var10;
					var10 = 0;
				}
				if (var11 >= this.field6911) {
					var11 = this.field6911 - 1;
				}
				for (int var12 = var10; var12 <= var11; var12++) {
					short var13 = var2.field6981[var7];
					int var14 = var13 >>> 8;
					int var15 = var6 * var7 + var14;
					int var16 = (var13 >>> 8) + var9;
					int var17 = (var13 & 0xFF) + var16 - 1;
					if (var16 < 0) {
						var15 -= var16;
						var16 = 0;
					}
					if (var17 >= this.field6910) {
						var17 = this.field6910 - 1;
					}
					for (int var18 = var16; var18 <= var17; var18++) {
						byte var19 = 1;
						PrimaryLayerEntity var20 = this.method8856(var4, var18, var12, null);
						if (var20 != null && var20.field12469 != 0) {
							if (var20.field12469 == 1) {
								boolean var21 = var18 - 1 >= var16;
								boolean var22 = var18 + 1 <= var17;
								if (!var21 && var12 + 1 <= var11) {
									short var23 = var2.field6981[var7 + 1];
									int var24 = (var23 >>> 8) + var9;
									int var25 = (var23 & 0xFF) + var24;
									var21 = var18 > var24 && var18 < var25;
								}
								if (!var22 && var12 - 1 >= var10) {
									short var26 = var2.field6981[var7 - 1];
									int var27 = (var26 >>> 8) + var9;
									int var28 = (var26 & 0xFF) + var27;
									var22 = var18 > var27 && var18 < var28;
								}
								if (var21 && !var22) {
									var19 = 4;
								} else if (var22 && !var21) {
									var19 = 2;
								}
							} else {
								boolean var29 = var18 - 1 >= var16;
								boolean var30 = var18 + 1 <= var17;
								if (!var29 && var12 - 1 >= var10) {
									short var31 = var2.field6981[var7 - 1];
									int var32 = (var31 >>> 8) + var9;
									int var33 = (var31 & 0xFF) + var32;
									var29 = var18 > var32 && var18 < var33;
								}
								if (!var30 && var12 + 1 <= var11) {
									short var34 = var2.field6981[var7 + 1];
									int var35 = (var34 >>> 8) + var9;
									int var36 = (var34 & 0xFF) + var35;
									var30 = var18 > var35 && var18 < var36;
								}
								if (var29 && !var30) {
									var19 = 3;
								} else if (var30 && !var29) {
									var19 = 5;
								}
							}
						}
						var8[var15++] = var19;
					}
					var7++;
				}
				this.field6956[var1] = true;
				if (field6937) {
					this.field6913[var4].method1549(var3, var8);
				}
			}
		}
	}

	@ObfuscatedName("tx.bh(IIII)V")
	public void method8756(int arg0, int arg1, int arg2) {
		List var4 = (List) this.field6957.get(arg0);
		if (var4 == null) {
			return;
		}
		Iterator var5 = var4.iterator();
		while (var5.hasNext()) {
			class554 var6 = (class554) var5.next();
			var6.field7003.method17620(arg1, arg2);
		}
	}

	@ObfuscatedName("tx.bx(IIIB)V")
	public void method8757(int arg0, int arg1, int arg2) {
		List var4 = (List) this.field6957.get(arg0);
		if (var4 == null) {
			return;
		}
		float var5 = arg1 < 0 ? -1.0F : (float) arg1 / 100.0F;
		Iterator var6 = var4.iterator();
		while (var6.hasNext()) {
			class554 var7 = (class554) var6.next();
			var7.field7003.method17621(var5, arg2);
		}
	}

	@ObfuscatedName("tx.bd(I)Ljava/util/HashMap;")
	public HashMap method8733() {
		this.field6958.clear();
		Iterator var1 = this.field6957.entrySet().iterator();
		while (var1.hasNext()) {
			Entry var2 = (Entry) var1.next();
			this.field6958.put(var2.getKey(), ((class554) ((List) var2.getValue()).get(0)).field7003);
		}
		return this.field6958;
	}

	@ObfuscatedName("tx.bc(Ljava/util/HashMap;B)V")
	public void method8759(HashMap arg0) {
		this.field6958 = arg0;
	}
}
