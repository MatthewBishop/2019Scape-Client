package com.jagex;

import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.List;

@ObfuscatedName("we")
public class class613 implements class614 {

	@ObfuscatedName("we.e")
	public SoundBackend field7617;

	@ObfuscatedName("we.n")
	public class615 field7616 = class615.field7627;

	@ObfuscatedName("we.m")
	public int field7615;

	@ObfuscatedName("we.k")
	public Js5 field7621;

	@ObfuscatedName("we.f")
	public class612 field7619;

	@ObfuscatedName("we.w")
	public byte[] field7620;

	@ObfuscatedName("we.l")
	public boolean field7618;

	@ObfuscatedName("we.u")
	public int field7622;

	@ObfuscatedName("we.z")
	public WeightedCache field7623;

	@ObfuscatedName("we.p")
	public boolean field7624;

	public class613(Js5 arg0, int arg1, SoundBackend arg2, class612 arg3, WeightedCache arg4) {
		this.field7621 = arg0;
		this.field7615 = arg1;
		this.field7617 = arg2;
		this.field7619 = arg3;
		this.field7623 = arg4;
		this.field7624 = this.field7623 != null;
		this.field7616 = class615.field7625;
	}

	@ObfuscatedName("we.e(B)V")
	public void method9672() {
		if (class615.field7625 != this.field7616) {
			return;
		}
		byte[] var1 = this.field7621.method6894(this.field7615);
		if (var1 == null) {
			return;
		}
		this.field7620 = var1;
		this.method9676();
		this.field7616 = class615.field7626;
		if (this.field7619 != null) {
			this.field7619.method3130(this, var1.length, this.field7615, false);
		}
	}

	@ObfuscatedName("we.n(B)Lrw;")
	public Sound method9710() {
		Sound var1 = new Sound(this.field7617);
		var1.method7376(this);
		return var1;
	}

	@ObfuscatedName("we.m(I)Lwl;")
	public class615 method9674() {
		return this.field7616;
	}

	@ObfuscatedName("we.k(I)Z")
	public boolean method9675() {
		return false;
	}

	@ObfuscatedName("we.f(I)V")
	public void method9676() {
	}

	@ObfuscatedName("we.w(II)[B")
	public byte[] method9673(int arg0) {
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		return this.field7620;
	}

	@ObfuscatedName("we.l(I)I")
	public int method9678() {
		return this.field7620 == null ? 0 : this.field7620.length;
	}

	@ObfuscatedName("we.u(I)Lqk;")
	public class473 method9679() {
		return class473.field4851;
	}

	@ObfuscatedName("we.z(B)I")
	public int method9680() {
		return this.field7615;
	}

	@ObfuscatedName("we.p(Lalw;B)V")
	public void method9681(Packet arg0) {
		if (this.field7623 == null) {
			return;
		}
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		if (this.field7618) {
			throw new RuntimeException("");
		}
		WeightedCache var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = this.method9689();
			if (var3 != null) {
				var3.add(arg0);
				this.field7622 += arg0.data.length;
				this.method9688(var3, this.field7622);
			}
		}
	}

	@ObfuscatedName("we.d(II)Lalw;")
	public Packet method9686(int arg0) {
		if (this.field7623 == null) {
			return null;
		}
		Packet var2 = null;
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		WeightedCache var3 = this.field7623;
		synchronized (this.field7623) {
			List var4 = this.method9689();
			if (var4.size() > arg0) {
				var2 = (Packet) var4.get(arg0);
			}
			return var2;
		}
	}

	@ObfuscatedName("we.c(II)Z")
	public boolean method9683(int arg0) {
		if (this.field7623 == null) {
			return false;
		}
		boolean var2 = false;
		WeightedCache var3 = this.field7623;
		synchronized (this.field7623) {
			List var4 = this.method9689();
			if (var4 != null && var4.size() > arg0) {
				var2 = var4.get(arg0) != null;
			}
			return var2;
		}
	}

	@ObfuscatedName("we.r(I)Z")
	public boolean method9702() {
		return this.field7623 != null && this.field7624;
	}

	@ObfuscatedName("we.v(B)I")
	public int method9685() {
		if (this.field7623 == null) {
			return 0;
		}
		int var1 = 0;
		WeightedCache var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = this.method9689();
			if (var3 != null) {
				var1 = var3.size();
			}
			return var1;
		}
	}

	@ObfuscatedName("we.o(ZB)V")
	public void method9671(boolean arg0) {
		if (this.field7619 != null) {
			this.field7619.method3131(this);
		}
		this.field7618 = arg0;
	}

	@ObfuscatedName("we.s(S)Z")
	public boolean method9687() {
		if (this.field7623 == null) {
			return false;
		}
		List var1 = this.method9689();
		if (var1 == null || var1.size() <= 0) {
			this.field7618 = false;
		}
		return this.field7618;
	}

	@ObfuscatedName("we.y(Ljava/util/List;II)V")
	public void method9688(List arg0, int arg1) {
		if (this.field7623 == null || arg0 == null || arg1 < 0) {
			return;
		}
		WeightedCache var3 = this.field7623;
		synchronized (this.field7623) {
			this.field7623.method2957((long) this.field7615);
			if (arg1 <= this.field7623.method2925()) {
				this.field7623.method2922(arg0, (long) this.field7615, arg1);
			} else {
				this.field7624 = false;
				this.field7618 = false;
				this.field7622 = 0;
			}
		}
	}

	@ObfuscatedName("we.q(S)Ljava/util/List;")
	public List method9689() {
		if (this.field7623 == null || !this.field7624) {
			return null;
		}
		Object var1 = null;
		WeightedCache var2 = this.field7623;
		synchronized (this.field7623) {
			List var3 = (List) this.field7623.method2930((long) this.field7615);
			if (var3 == null && this.field7624) {
				var3 = new ArrayList();
				this.field7623.method2922(var3, (long) this.field7615, 0);
			}
			return var3;
		}
	}
}
