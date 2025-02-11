package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("alp")
public class NativeMouseLogger extends MouseLogger {

	@ObfuscatedName("alp.w")
	public final Queue field11710 = new LinkedList();

	@ObfuscatedName("alp.i(Lasp;B)V")
	public void method18343(class1188 arg0) {
		this.field11710.add(arg0);
		if (this.field11710.size() > 10) {
			this.field11710.poll();
		}
	}

	@ObfuscatedName("alp.l(I)V")
	public void method10270() {
		class1188 var1 = (class1188) this.field11710.poll();
		if (var1 == null) {
			return;
		}
		ClientMessage var2 = Statics.method1604(ClientProt.EVENT_NATIVE_MOUSE_CLICK, client.field10849.field794);
		var2.field11432.p4(var1.method17831() | var1.method17832() << 16);
		var2.field11432.p2_alt1(this.method10262(var1, 65535));
		var2.field11432.p1_alt1(var1.method19539() << 1 | var1.method19537() & 0x1);
		client.field10849.method934(var2);
		var1.method17835();
	}

	@ObfuscatedName("alp.u(I)Z")
	public boolean method10272() {
		return !this.field11710.isEmpty() || this.field7953 < MonotonicTime.method3655() - 2000L;
	}

	@ObfuscatedName("alp.z(S)Lakl;")
	public ClientMessage method10267() {
		return Statics.method1604(ClientProt.EVENT_NATIVE_MOUSE_MOVE, client.field10849.field794);
	}

	@ObfuscatedName("alp.j(Lalw;Lasp;I)V")
	public void method18345(Packet arg0, class1188 arg1) {
		arg0.p1(arg1.method19537());
	}

	@ObfuscatedName("alp.f(I)I")
	public int method10263() {
		return 1;
	}

	@ObfuscatedName("alp.w(Lalw;Lakm;I)V")
	public void method10264(Packet arg0, class993 arg1) {
		this.method18345(arg0, (class1188) arg1);
	}
}
