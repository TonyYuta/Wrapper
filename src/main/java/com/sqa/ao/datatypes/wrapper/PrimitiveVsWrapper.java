/**
 *   File Name: PrimitiveVsWrapper.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 18, 2015
 *   
 */

package com.sqa.ao.datatypes.wrapper;

/**
 * PrimitiveVsWrapper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */

public class PrimitiveVsWrapper {
	private byte myPrimitiveByte1 = 110;
	private byte myPrimitiveByte2 = 120;
	private Byte myWrapperByte1 = Byte.valueOf(myPrimitiveByte1);
	private Byte myWrapperByte2 = myPrimitiveByte2;
	
	private Byte myWrapperByte3 = 30;

	/**
	 * @return the myPrimitiveByte
	 */
	public byte getMyPrimitiveByte1() {
		return myPrimitiveByte1;
	}

	/**
	 * @param myPrimitiveByte the myPrimitiveByte to set
	 */
	public void setMyPrimitiveByte1(byte myPrimitiveByte) {
		this.myPrimitiveByte1 = myPrimitiveByte;
	}

	public byte getMyPrimitiveByte2() {
		return myPrimitiveByte2;
	}
	
	public Byte getMyWrapperByte1() {
		return myWrapperByte1;
	}
	
	public Byte getMyWrapperByte2() {
		return myWrapperByte2;
	}
	
	public void setMyPrimitiveByte2(byte aMyPrimitiveByte2) {
		this.myPrimitiveByte2 = aMyPrimitiveByte2;
	}
	
	public void setMyWrapperByte2(Byte aMyWrapperByte2) {
		this.myWrapperByte2 = aMyWrapperByte2;
	}

	

}