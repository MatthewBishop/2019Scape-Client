package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("agl")
public class OpenGLProgram extends Program {

	@ObfuscatedName("agl.l")
	public OpenGLRenderer field10371;

	@ObfuscatedName("agl.u")
	public class890 field10385;

	@ObfuscatedName("agl.z")
	public int field10373;

	@ObfuscatedName("agl.p")
	public int field10374;

	@ObfuscatedName("agl.d")
	public int field10375;

	@ObfuscatedName("agl.c")
	public boolean field10372;

	@ObfuscatedName("agl.r")
	public int[] field10377;

	@ObfuscatedName("agl.v")
	public static final int[] field10378 = new int[2];

	@ObfuscatedName("agl.o")
	public static final float[] field10380 = new float[16];

	@ObfuscatedName("agl.s")
	public final Map field10368;

	@ObfuscatedName("agl.y")
	public final Map field10381;

	@ObfuscatedName("agl.q")
	public final Map field10383;

	@ObfuscatedName("agl.x")
	public final Map field10382;

	@ObfuscatedName("agl.b")
	public final Map field10384;

	@ObfuscatedName("agl.h")
	public String field10379;

	@ObfuscatedName("agl.a")
	public String field10386;

	public OpenGLProgram(OpenGLRenderer arg0, class890 arg1, class233 arg2) {
		this(arg0, arg2);
		this.field10385 = arg1;
		this.field10371 = arg0;
	}

	public OpenGLProgram(OpenGLRenderer arg0, class233 arg1) {
		this.field10373 = 0;
		this.field10374 = 0;
		this.field10375 = 0;
		this.field10372 = false;
		this.field10377 = new int[13];
		this.field10368 = new HashMap();
		this.field10381 = new HashMap();
		this.field10383 = new HashMap();
		this.field10382 = new HashMap();
		this.field10384 = new HashMap();
		this.field2435 = arg1.field2432;
		StringBuilder var3 = new StringBuilder();
		if (arg1.field2428 != null) {
			this.field2434 = arg1.field2428;
			if (arg1.field2429 != null) {
				class237[] var4 = arg1.field2429;
				for (int var5 = 0; var5 < var4.length; var5++) {
					class237 var6 = var4[var5];
					var3.append("#define " + var6.field2566 + " " + var6.field2565 + '\n');
				}
			}
			var3.append(new String(arg0.method19089(this.field2434)));
			this.field10379 = var3.toString();
		}
		if (arg1.field2430 != null) {
			this.field2436 = arg1.field2430;
			var3.setLength(0);
			if (arg1.field2431 != null) {
				class237[] var7 = arg1.field2431;
				for (int var8 = 0; var8 < var7.length; var8++) {
					class237 var9 = var7[var8];
					var3.append("#define " + var9.field2566 + " " + var9.field2565 + '\n');
				}
			}
			var3.append(new String(arg0.method19089(this.field2436)));
			this.field10386 = var3.toString();
		}
		class701.method14009(this.field10377, 0, this.field10377.length, -1);
	}

	@ObfuscatedName("agl.af(ILjava/lang/String;Ljava/lang/String;)I")
	public int method16478(int arg0, String arg1, String arg2) {
		if (arg1 == null) {
			return 0;
		}
		int var4 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(var4, arg1);
		OpenGL.glCompileShader(var4);
		OpenGL.glGetShaderiv(var4, 35713, field10378, 0);
		if (field10378[0] == 0) {
			OpenGL.glDeleteShader(var4);
			var4 = 0;
		}
		return var4;
	}

	@ObfuscatedName("agl.n()Z")
	public boolean method4083() {
		if (this.field10372) {
			return true;
		}
		this.field10371.field12015 = null;
		this.field10374 = this.method16478(35633, this.field10379, this.field2434);
		this.field10375 = this.method16478(35632, this.field10386, this.field2436);
		if (this.field10374 == 0 || this.field10375 == 0) {
			if (this.field10374 != 0) {
				OpenGL.glDeleteShader(this.field10374);
			}
			if (this.field10375 != 0) {
				OpenGL.glDeleteShader(this.field10375);
			}
			return false;
		}
		this.field10373 = OpenGL.glCreateProgram();
		if (this.field10374 != 0) {
			OpenGL.glAttachShader(this.field10373, this.field10374);
		}
		if (this.field10375 != 0) {
			OpenGL.glAttachShader(this.field10373, this.field10375);
		}
		OpenGL.glLinkProgram(this.field10373);
		OpenGL.glGetProgramiv(this.field10373, 35714, field10378, 0);
		if (field10378[0] == 0) {
			if (this.field10374 != 0) {
				OpenGL.glDetachShader(this.field10373, this.field10374);
				OpenGL.glDeleteShader(this.field10374);
			}
			if (this.field10375 != 0) {
				OpenGL.glDetachShader(this.field10373, this.field10375);
				OpenGL.glDeleteShader(this.field10375);
			}
			OpenGL.glDeleteProgram(this.field10373);
			return false;
		}
		OpenGL.glUseProgram(this.field10373);
		int var1 = -1;
		for (int var2 = 0; var2 < this.field10385.method4158(); var2++) {
			if (this.field10385.method4159(var2) == this) {
				var1 = var2;
				break;
			}
		}
		if (var1 == -1) {
			return false;
		}
		for (int var3 = 0; var3 < this.field10385.method4189(); var3++) {
			ProgramUniform var4 = this.field10385.method4160(var3);
			if (var4 != null) {
				var4.method19245(var1);
			}
		}
		for (int var5 = 0; var5 < this.field10385.method4190(); var5++) {
			ProgramUniform var6 = this.field10385.method4187(var5);
			if (var6 != null) {
				var6.method19245(var1);
			}
		}
		this.field10379 = null;
		this.field10386 = null;
		this.field10372 = true;
		return true;
	}

	@ObfuscatedName("agl.k(Laql;F)V")
	public void method4084(ProgramUniform arg0, float arg1) {
		int var3 = ((class1221) arg0).method19681();
		if (var3 == -1 || this.field10368.get(var3) != null && (Float) this.field10368.get(var3) == arg1) {
			return;
		}
		this.field10368.put(var3, arg1);
		if (arg0.method19247() != class236.field2525 && arg0.method19247() != class236.field2509) {
			throw new OpenGLError(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	@ObfuscatedName("agl.f(Laql;FF)V")
	public void method4085(ProgramUniform arg0, float arg1, float arg2) {
		int var4 = ((class1221) arg0).method19681();
		if (var4 == -1 || this.field10368.get(var4) != null && this.field10381.get(var4) != null && (Float) this.field10368.get(var4) == arg1 && (Float) this.field10381.get(var4) == arg2) {
			return;
		}
		this.field10368.put(var4, arg1);
		this.field10381.put(var4, arg2);
		if (arg0.method19247() != class236.field2495) {
			throw new OpenGLError(arg0, "");
		}
		OpenGL.glUniform2f(var4, arg1, arg2);
	}

	@ObfuscatedName("agl.w(Laql;FFF)V")
	public void method4108(ProgramUniform arg0, float arg1, float arg2, float arg3) {
		int var5 = ((class1221) arg0).method19681();
		if (var5 == -1 || this.field10368.get(var5) != null && this.field10381.get(var5) != null && this.field10383.get(var5) != null && (Float) this.field10368.get(var5) == arg1 && (Float) this.field10381.get(var5) == arg2 && (Float) this.field10383.get(var5) == arg3) {
			return;
		}
		this.field10368.put(var5, arg1);
		this.field10381.put(var5, arg2);
		this.field10383.put(var5, arg3);
		if (arg0.method19247() != class236.field2540) {
			throw new OpenGLError(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	@ObfuscatedName("agl.l(Laql;FFFF)V")
	public void method4087(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((class1221) arg0).method19681();
		if (var6 == -1 || this.field10368.get(var6) != null && this.field10381.get(var6) != null && this.field10383.get(var6) != null && this.field10382.get(var6) != null && (Float) this.field10368.get(var6) == arg1 && (Float) this.field10381.get(var6) == arg2 && (Float) this.field10383.get(var6) == arg3 && (Float) this.field10382.get(var6) == arg4) {
			return;
		}
		this.field10368.put(var6, arg1);
		this.field10381.put(var6, arg2);
		this.field10383.put(var6, arg3);
		this.field10382.put(var6, arg4);
		if (arg0.method19247() != class236.field2466) {
			throw new OpenGLError(arg0, "");
		}
		OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("agl.z(Laql;[FI)V")
	public void method4086(ProgramUniform arg0, float[] arg1, int arg2) {
		int var4 = ((class1221) arg0).method19681();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	@ObfuscatedName("agl.p(Laql;Lpq;)V")
	public void method4089(ProgramUniform arg0, Matrix4x4 arg1) {
		assert arg0.method19247() == class236.field2480;
		int var3 = ((class1221) arg0).method19681();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method6682(field10380), 0);
		}
	}

	@ObfuscatedName("agl.d(Laql;Lpq;)V")
	public void method4101(ProgramUniform arg0, Matrix4x4 arg1) {
		assert arg0.method19247() == class236.field2482;
		int var3 = ((class1221) arg0).method19681();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method6594(field10380), 0);
		}
	}

	@ObfuscatedName("agl.c(Laql;ILmq;)V")
	public void method4081(ProgramUniform arg0, int arg1, BaseTexture arg2) {
		int var4 = ((class1221) arg0).method19681();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.field10371.field10140;
		}
		if (arg1 < this.field10371.field10186) {
			this.field10371.method16038(arg1);
			this.field10371.method16092(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((OpenGLBaseTexture) arg2).field4979, ((OpenGLBaseTexture) arg2).field4974);
		}
		if (this.field10384.get(var4) == null || (Integer) this.field10384.get(var4) != arg1) {
			this.field10384.put(var4, arg1);
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	@ObfuscatedName("agl.r(IFFF)V")
	public void method4088(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agl.v(IFFFF)V")
	public void method4123(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("agl.o(I[FI)V")
	public void method4093(int arg0, float[] arg1, int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@ObfuscatedName("agl.s(ILpq;)V")
	public void method4094(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method6699(field10380), 0);
	}

	@ObfuscatedName("agl.y(ILpq;)V")
	public void method4095(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method6682(field10380), 0);
	}

	@ObfuscatedName("agl.q(ILpq;)V")
	public void method4096(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method6594(field10380), 0);
	}

	@ObfuscatedName("agl.x(IILmq;)V")
	public void method4097(int arg0, int arg1, BaseTexture arg2) {
		this.field10371.method16038(arg1);
		this.field10371.method16092(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@ObfuscatedName("agl.m()V")
	public void method1010() {
		if (this.field10373 == 0) {
			return;
		}
		this.field10371.method19087(this.field10373);
		if (this.field10374 != 0) {
			this.field10371.method19075((long) this.field10374);
		}
		if (this.field10375 != 0) {
			this.field10371.method19075((long) this.field10375);
		}
		this.field10373 = 0;
		this.field10374 = 0;
		this.field10375 = 0;
	}

	public void finalize() {
		this.method1010();
	}
}
