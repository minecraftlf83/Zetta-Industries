package com.bymarcin.zettaindustries.mods.battery.erogenousbeef.core.multiblock;

/**
 * An exception thrown when trying to validate a multiblock. Requires a string describing why the multiblock
 * could not assemble.
 * @author Erogenous Beef
 */
@SuppressWarnings("serial")
public class MultiblockValidationException extends Exception {

	public MultiblockValidationException(String reason) {
		super(reason);
	}
}
