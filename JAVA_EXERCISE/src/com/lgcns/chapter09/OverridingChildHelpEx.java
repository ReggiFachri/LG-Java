package com.lgcns.chapter09;

public class OverridingChildHelpEx extends OverridingParentHelpEx {

	@Override
	public void methodA() {
		super.methodA();
		super.methodC();
	}

	public void methodAA() {
		System.out.println("AA method");
	}
}