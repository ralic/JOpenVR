package com.valvesoftware.vr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_t extends Structure {
	/** @see EVREventType */
	public int eventType;
	public int trackedDeviceIndex;
	public VREvent_Data_t data;
	public float eventAgeSeconds;
	public VREvent_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("eventType", "trackedDeviceIndex", "data", "eventAgeSeconds");
	}
	public VREvent_t(int eventType, int trackedDeviceIndex, VREvent_Data_t data, float eventAgeSeconds) {
		super();
		this.eventType = eventType;
		this.trackedDeviceIndex = trackedDeviceIndex;
		this.data = data;
		this.eventAgeSeconds = eventAgeSeconds;
	}
	public VREvent_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_t implements Structure.ByValue {
		
	};
}
