package com.jagex;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("apm")
public class BrokenOutputStream extends OutputStream {

	public void write(int arg0) throws IOException {
		throw new IOException();
	}
}
