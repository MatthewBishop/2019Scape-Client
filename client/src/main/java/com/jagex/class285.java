package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jj")
public abstract class class285 {

	@ObfuscatedName("jj.n")
	public GpuRenderer field2963;

	@ObfuscatedName("jj.m")
	public float[] field2964 = new float[16];

	@ObfuscatedName("jj.k")
	public float[] field2965 = new float[16];

	@ObfuscatedName("jj.f")
	public GpuTexture field2966;

	@ObfuscatedName("jj.w")
	public GpuCubeTexture field2967;

	@ObfuscatedName("jj.l")
	public final Matrix4x4 field2982 = new Matrix4x4();

	@ObfuscatedName("jj.u")
	public final Vector3 field2969 = new Vector3();

	@ObfuscatedName("jj.z")
	public float field2970;

	@ObfuscatedName("jj.p")
	public float field2971;

	@ObfuscatedName("jj.d")
	public final class415 field2979 = new class415();

	@ObfuscatedName("jj.c")
	public final Vector3 field2973 = new Vector3();

	@ObfuscatedName("jj.r")
	public final class415 field2984 = new class415();

	@ObfuscatedName("jj.v")
	public final Vector3 field2975 = new Vector3();

	@ObfuscatedName("jj.o")
	public final Vector3 field2976 = new Vector3();

	@ObfuscatedName("jj.s")
	public final Vector3 field2977 = new Vector3();

	@ObfuscatedName("jj.y")
	public final Vector3 field2978 = new Vector3();

	@ObfuscatedName("jj.q")
	public final Vector3 field2968 = new Vector3();

	@ObfuscatedName("jj.x")
	public final Matrix4x4 field2980 = new Matrix4x4();

	@ObfuscatedName("jj.b")
	public int field2981;

	@ObfuscatedName("jj.h")
	public int field2983;

	@ObfuscatedName("jj.a")
	public int field2972;

	@ObfuscatedName("jj.g")
	public int field2962;

	public class285(GpuRenderer arg0) {
		this.field2963 = arg0;
	}

	@ObfuscatedName("jj.e(B)V")
	public void method5036(byte arg0) {
		switch(arg0) {
			case 1:
				this.field2970 = 32.0F;
				this.field2971 = 0.0F;
				break;
			case 2:
				this.field2970 = 4.0F;
				this.field2971 = 0.0F;
				break;
			case 3:
				this.field2970 = 1.0F;
				this.field2971 = 0.0F;
		}
	}

	@ObfuscatedName("jj.n(Lpq;)V")
	public abstract void method5018(Matrix4x4 arg0);

	@ObfuscatedName("jj.m(Z)V")
	public abstract void method5019(boolean arg0);

	@ObfuscatedName("jj.k(I)V")
	public abstract void method5020(int arg0);

	@ObfuscatedName("jj.l()V")
	public abstract void method5023();

	@ObfuscatedName("jj.u()V")
	public abstract void method5024();

	@ObfuscatedName("jj.w(I)V")
	public abstract void method5026(int arg0);

	@ObfuscatedName("jj.f(I)V")
	public abstract void method5031(int arg0);
}
