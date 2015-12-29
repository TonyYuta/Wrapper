/**
 *   File Name: Run.java<br>
 *
 *   Yutaka<br>
 *   Created: Dec 18, 2015
 *   
 */

package com.sqa.ao.datatypes.wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Run //ADDD (description of class)
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
public class Run {
	public static void main(String[] args) {
		PrimitiveVsWrapper pw = new PrimitiveVsWrapper();
		
//		byte myPrimitiveByte1 = 100;
//		//Byte myWrapperByte1 = Byte.valueOf(myPrimitiveByte1);
//		// or
//		Byte myWrapperByte1 = myPrimitiveByte1;
//		System.out.println(myPrimitiveByte1);
//		
//		char myPrimitiveChar1 = 'a';
//		//Character myWrapperCharacter1 = Character.valueOf(myPrimitiveChar1);
//		// or
//		Character myWrapperCharacter1 = myPrimitiveChar1;
//		System.out.println(myWrapperCharacter1);
//		
//		boolean myPrimitiveBoolean1 = true;
//		//Boolean myWrapperBoolean1 = Boolean.valueOf(myPrimitiveBoolean1);
//		// or
//		Boolean myWrapperBoolean1 = myPrimitiveBoolean1;
//		System.out.println(myWrapperBoolean1);
//		
//		short myPrimitiveShort1 = 32_767;
//		//Short myWrapperShort1 = Short.valueOf(myPrimitiveShort1);
//		// or
//		Short myWrapperShort1 = myPrimitiveShort1;
//		System.out.println(myWrapperShort1);
//		
//		int myPrimitiveInt1 = 124_761;
//		//Integer myWrapperInteger1 = Integer.valueOf(myPrimitiveInt1);
//		// or
//		Integer myWrapperInteger1 = myPrimitiveInt1;
//		System.out.println(myWrapperInteger1);
//		
//		long myPrimitiveLong1 = 834_124_761_983L;
//		Long myWrapperLong1 = Long.valueOf(myPrimitiveLong1);
//		// or
//		//Long myWrapperLong1 = myPrimitiveLong1;
//		System.out.println(myWrapperLong1);
//		
//		float myPrimitiveFloat1 = 834.364_762F;
//		//Float myWrapperFloat1 = Float.valueOf(myPrimitiveFloat1);
//		// or
//		Float myWrapperFloat1 = myPrimitiveFloat1;
//		System.out.println(myWrapperFloat1);
//		
//		double myPrimitiveDouble1 = 834.364_762_645;
//		Double myWrapperDouble1 = Double.valueOf(myPrimitiveDouble1);
//		// or
//		//Double myWrapperDouble1 = myPrimitiveDouble1;
//		System.out.println(myWrapperDouble1);
		
		
		Byte myWrapperByte1 = 100;
		//byte myPrimitiveByte1 = myWrapperByte1.byteValue();
		// or
		byte myPrimitiveByte1  = myWrapperByte1;
		System.out.println(myPrimitiveByte1);
		
		Character myWrapperCharacter1 = 'b';
		//char myPrimitiveChar1 = myWrapperCharacter1.charValue();
		// or
		char myPrimitiveChar1 = myWrapperCharacter1;
		System.out.println(myPrimitiveChar1);
		
		Boolean myWrapperBoolean1 = true;
		//boolean myPrimitiveBoolean1 = myWrapperBoolean1.booleanValue();
		// or
		boolean myPrimitiveBoolean1  = myWrapperBoolean1;
		System.out.println(myPrimitiveBoolean1);
		
		Short myWrapperShort1 = 32_767;
		short myPrimitiveShort1 = myWrapperShort1.byteValue();
		// or
		//short myPrimitiveShort1  = myWrapperShort1;
		System.out.println(myPrimitiveShort1);
		
		Integer myWrapperInteger1 = 100_200_300;
		int myPrimitiveInt1 = myWrapperInteger1.intValue();
		// or
		//int myPrimitiveInt1  = myWrapperInteger1;
		System.out.println(myPrimitiveInt1);
		
		Long myWrapperLong1 = 100_392_837_723_232L;
		//long myPrimitiveLong1 = myWrapperLong1.byteValue();
		// or
		long myPrimitiveLong1  = myWrapperLong1;
		System.out.println(myPrimitiveLong1);
		
		Float myWrapperFloat1 = 100.534245F;
		//float myPrimitiveFloat1 = myWrapperFloat1.floatValue();
		// or
		float myPrimitiveFloat1  = myWrapperFloat1;
		System.out.println(myPrimitiveFloat1);
		
		Double myWrapperDouble1 = 100.342_546_756;
		//double myPrimitiveDouble1 = myWrapperDouble1.doubleValue();
		// or
		double myPrimitiveDouble1  = myWrapperDouble1;
		System.out.println(myPrimitiveDouble1);
		
//		Character ch1 = 'x';
//		Boolean bl1 = true;
//		Byte bt1 = 127;
//		Short st1 = -32768;
//		Integer in1 = 234_443_234;
//		Long ln1 = 213_234_355_335_344L;
//		Float fl1 = 3453.2344562F;
//		Double db1 = 23453.354_645_645;
//		
//		System.out.println(ch1 + "\n" + bl1 + "\n" + st1 + "\n" + in1 + "\n" + ln1 + "\n" + fl1 + "\n" + db1);
//		
//		
		Character ch1 = 'x';
		char ch2 = ch1.charValue();
		
		Boolean bl1 = true;
		boolean bl2 = bl1.booleanValue();
		
		Byte bt1 = 127;
		byte bt2 = bt1.byteValue();
		
		Short st1 = -32768;
		short st2 = st1.shortValue();
		
		Integer in1 = 234_443_234;
		int in2 = in1.intValue();
		
		Long ln1 = 213_234_355_335_344L;
		long ln2 = ln1.longValue();
		
		Float fl1 = 3453.2344562F;
		float fl2 = fl1.floatValue();
		
		Double db1 = 23453.354_645_645;
		double db2 = db1.doubleValue();
		
		System.out.println(ch1 + "\n" + bl1 + "\n" + st1 + "\n" + in1 + "\n" + ln1 + "\n" + fl1 + "\n" + db1);
		System.out.println(ch2 + "\n" + bl2 + "\n" + st2 + "\n" + in2 + "\n" + ln2 + "\n" + fl2 + "\n" + db2);
		
		byte b01 = 10;
		short s01 = b01;
		System.out.println(s01); 
		// Output: 10
		
		byte b02 = 20;
		int i01 = b02;
		System.out.println(i01); 
		// Output: 20
		
		byte b03 = 30;
		long l01 = b03;
		System.out.println(l01); 
		// Output: 30
		
		byte b04 = 40;
		float f01 = b04;
		System.out.println(f01); 
		// Output: 40.0
		
		byte b05 = 50;
		double d01 = b05;
		System.out.println(d01); 
		// Output: 50.0
		
		short sh01 = 32767;
		int in01 = sh01;
		System.out.println(in01); 
		// Output: 32767
		
		short sh02 = 32767;
		long ln01 = sh02;
		System.out.println(ln01); 
		// Output: 32767
		
		short sh03 = 10000;
		float fl01 = sh03;
		System.out.println(fl01); 
		// Output: 10000.0
		
		short sh04 = -32768;
		double db01 = sh04;
		System.out.println(db01); 
		// Output: -32768.0
		
		char cha01 = 'q';
		int int01 = cha01;
		System.out.println(int01); 
		// Output: 113
		
		char cha02 = 'w';
		long lon01 = cha02;
		System.out.println(lon01); 
		// Output: 119
		
		char cha03 = 'y';
		float flo01 = cha03;
		System.out.println(flo01); 
		// Output: 121.0
		
		char cha04 = '1';
		double dob01 = cha04;
		System.out.println(dob01); 
		// Output: 49.0
		
		int int001 = -947_873;
		long lon001 = int001;
		System.out.println(lon001); 
		// Output: -947873
		
		int int002 = 746_835_724;
		float flo001 = int002;
		System.out.println(flo001); 
		// Output: 7.4683571E8
		
		int int003 = 66554433;
		double dob001 = int003;
		System.out.println(dob001); 
		// Output: 6.6554433E7
		
		long long001 = 546_867_937_069_846L;
		float float001 = long001;
		System.out.println(float001); 
		// Output: 	5.46867952E14
		
		long long002 = -1223344556677823L;
		double double001 = long002;
		System.out.println(double001); 
		// Output: -1.223344556677823E15

		float f0001 = 6723.84756F;
		double d0001 = f0001;
		System.out.println(d0001); 
		// Output: 6723.84765625

//		1.     byte to char
		byte b_01 = 124;
		char c_01 = (char)b_01;
		System.out.println(c_01); 
		// Output: |
		
//		2.     short to byte
		short s_02 = 3244;
		byte b_02 = (byte)s_02;
		System.out.println(b_02); 
		// Output: -84
//		3.     short to char
		short s_03 = 90;
		char c_03 = (char)s_03;
		System.out.println(c_03); 
		// Output: 
//		4.     char to byte
		char c_04 = 'Z';
		byte b_04 = (byte)c_04;
		System.out.println(b_04); 
		// Output: 90
//		5.     char to short
		char c_05 = '.';
		short s_05 = (short)c_05;
		System.out.println(s_05); 
		// Output: 46
//		6.     int to byte
		int i_06 = -100;
		byte b_06 = (byte)i_06;
		System.out.println(b_06); 
		// Output: -100
//		7.     int to short
		int i_07 = 32767;
		short s_07 = (short)i_07;
		System.out.println(s_07); 
		// Output: 32767
//		8.     int to char
		int i_08 = 112;
		char c_08 = (char)i_08;
		System.out.println(c_08); 
		// Output: p
//		9.     long to byte
		long l_09 = 127L;
		byte b_09 = (byte)l_09;
		System.out.println(b_09); 
		// Output: 127
//		10.long to short
		long l_010 = 199;
		short s_010 = (short)l_010;
		System.out.println(s_010); 
		// Output: 199
//		11.long to char
		long l_011 = 44;
		char c_011 = (char)l_011;
		System.out.println(c_011); 
		// Output: ,
//		12.long to int
		long l_012 = 345_567_098L;
		int i_012 = (int)l_012;
		System.out.println(i_012); 
		// Output: 345567098
//		13.float to byte
		float f_013 = 10.01F;
		byte b_013 = (byte)f_013;
		System.out.println(b_013); 
		// Output: 10
//		14.float to short
		float f_014 = 0.1F;
		short s_014 = (short)f_014;
		System.out.println(s_014); 
		// Output: 0
//		15.float to char
		float f_015 = 111.111F;
		char c_015 = (char)f_015;
		System.out.println(c_015); 
		// Output: o
//		16.float to int
		float f_016 = -111.222_333F;
		int i_016 = (int)f_016;
		System.out.println(i_016); 
		// Output: -111
//		17.float to long
		float f_017 = 555.555F;
		long l_017 = (long)f_017;
		System.out.println(l_017); 
		// Output: 555
//		18.double to byte
		double d_018 = 0.999_999_999_999;
		byte b_018 = (byte)d_018;
		System.out.println(b_018); 
		// Output: 0
//		19.double to short
		double d_019 = 10.999_999_999_999;
		short s_019 = (short)d_019;
		System.out.println(s_019); 
		// Output: 10
//		20.double to char
		double d_020 = 55.999_999_999_999;
		char c_020 = (char)d_020;
		System.out.println(c_020); 
		// Output: 7
//		21.double to int
		double d_021 = 1.999_999_999_999_999;
		int i_021 = (int)d_021;
		System.out.println(i_021); 
		// Output: 1
//		22.double to long
		double d_022 = 0.999_999_999_999_999;
		long l_022 = (long)d_022;
		System.out.println(l_022); 
		// Output: 0
//		23.double to float
		double d_023 = 1.012_345_678_901;
		float f_023 = (float)d_023;
		System.out.println(f_023); 
		// Output: 1.0123457

	
		

//		System.out.println("byte myPrimitiveByte = " + pw.getMyPrimitiveByte1());
//		System.out.println("byte myPrimitiveByte = " + pw.getMyPrimitiveByte2());
//		System.out.println("Byte myWrapperByte1 = " + pw.getMyWrapperByte1());
//		System.out.println("Byte myWrapperByte2 = " + pw.getMyWrapperByte2());
//		
//		System.out.println("pw.getMyWrapperByte1().byteValue() = " + pw.getMyWrapperByte1().byteValue());
//		System.out.println("pw.getMyWrapperByte1().hashCode() = " + pw.getMyWrapperByte1().hashCode());
//		System.out.println("pw.getMyWrapperByte1().MAX_VALUE) = " + pw.getMyWrapperByte1().MAX_VALUE);
//		System.out.println("pw.getMyWrapperByte1().SIZE) = " + pw.getMyWrapperByte1().SIZE);
//		
//		Byte myWrapperByte3 = 30;
//		//byte myPrimitiveByte3 = myWrapperByte3.byteValue();
//		byte myPrimitiveByte3 = myWrapperByte3;
//		System.out.println(myPrimitiveByte3);
		
		
		
//	//	a.     byte
//		byte[] byteArray01;
//
//		//b.     short
//		short[] shortArray01;
//
//		//c.      int
//		int[] intArray01;
//
//		// d.     long
//		long[] longArray01;
//
//		// e.     float
//		float[] floatArray01;
//
//		// f.      double
//		double[] doubleArray01;
//
//		// g.     Byte
//		Byte[] wrByteArray01;
//
//		// h.     Short
//		Short[] wrShortArray01;
//
//		// i.      Integer
//		Integer[] wrIntegerArray01;
//
//		// j.      BigInteger
//		BigInteger[] wrBigIntegerArray01;
//
//		// k.     Float
//		Float[] wrFloatArray01;
//
//		// l.      Decimal
//		Double[] myDoubleArray01;
//
//		// m.   BigDecimal
//		BigDecimal[] myBigDecimalArray01;
//
//		// n.    String
//		String[] myStringArray01;
//		
//		// o.    StringBuffer
//		StringBuffer[] mtStringBufferArray01;
//	
//		
//		
////		a.     byte
//			byteArray01 = new byte[3];
//
//			//b.     short
//			shortArray01 = new short[17];
//
//			//c.      int
//			intArray01 = new int[9];
//
//			// d.     long
//			longArray01 = new long[11];
//
//			// e.     float
//			floatArray01 = new float[2];
//
//			// f.      double
//			doubleArray01 = new double[8];
//
//			// g.     Byte
//			wrByteArray01 = new Byte[22];
//
//			// h.     Short
//			wrShortArray01 = new Short[6];
//
//			// i.      Integer
//			wrIntegerArray01 = new Integer[17];
//
//			// j.      BigInteger
//			wrBigIntegerArray01 = new BigInteger[12];
//
//			// k.     Float
//			wrFloatArray01 = new Float[0];
//
//			// l.      Decimal
//			myDoubleArray01 = new Double[2];
//
//			// m.   BigDecimal
//			myBigDecimalArray01 = new BigDecimal[7];
//
//			// n.    String
//			myStringArray01 = new String[25];
//			
//			// o.    StringBuffer
//			mtStringBufferArray01 = new StringBuffer[11];
			
			
////			a.     byte
//				byteArray01[0] = 11;
//
//				//b.     short
//				shortArray01[1] = 5;
//
//				//c.      int
//				intArray01[0] = 546_746_992;	
//
//				// d.     long
//				longArray01[3] = 674563853532L;
//
//				// e.     float
//				floatArray01[1] = 652.35235F;
//
//				// f.      double
//				doubleArray01[2] = 2432523.213_352_756_756_332_469;
//
//				// g.     Byte
//				wrByteArray01[1] = 127;
//
//				// h.     Short
//				wrShortArray01[1] = 32_767;
//
//				// i.      Integer
//				wrIntegerArray01[1] = 434_564_756;
//
//				// j.      BigInteger
//				BigInteger bigNum = new BigInteger("2143254325346453765845535242675425546265432654563245643256");
//				wrBigIntegerArray01[0] = bigNum;
//
//				// k.     Float
//				wrFloatArray01[0] = 564.2344F;
//				// Thread [main] (Suspended (exception ArrayIndexOutOfBoundsException))	
//
//				// l.      Double
//				myDoubleArray01[1] = -736454.2342353253464363;
//
//				// m.   BigDecimal
//				BigDecimal bdNumber = new BigDecimal("12423.21324234534534");
//				myBigDecimalArray01[0] = bdNumber;
//
//				// n.    String
//				myStringArray01[2] = "My String";
//				
//				// o.    StringBuffer
//				StringBuffer sb = new StringBuffer("My changeble String");
//				mtStringBufferArray01[0] = sb;
//				
		
		//	a.     byte
		byte[] byteArray01 = new byte[] {11};

		//b.     short
		short[] shortArray01 = new short[] {10, 20, 30, 40};

		//c.      int
		int[] intArray01 = new int[] {-7324534, 0, 325235436, 234234234};

		// d.     long
		long[] longArray01 = new long[] {1214235436456456L, 65765768675875987L, -123_234_645_756_645L};

		// e.     float
		float[] floatArray01 = new float[] {-122324.12324F, 646463.6574893F};

		// f.      double
		double[] doubleArray01 = new double[] {213.32454354654, -222.222333444555};

		// g.     Byte
		Byte[] wrByteArray01 = new Byte[] {-128, -1,0, 1, 127};

		// h.     Short
		Short[] wrShortArray01 = new Short[] {-32_768, -100, 0, 200, 32767};

		// i.      Integer
		Integer[] wrIntegerArray01 = new Integer[] {-1232423535, 543542454};

		// j.      BigInteger
		BigInteger bi01 = new BigInteger("2142345256547658798605678564565475675");
		BigInteger bi02 = new BigInteger("2142345256547658798605678564234223424565475675");
		BigInteger bi03 = new BigInteger("214234525654765879860567856345344565475675");
		BigInteger[] wrBigIntegerArray01 = new BigInteger[] {bi01, bi02, bi03};

		// k.     Float
		Float[] wrFloatArray01 = new Float[] {111.1234567F, 3.32421F};

		// l.      Decimal
		Double[] myDoubleArray01 = new Double[] {-546363.423_645_867_857_846, 645323.75687373645};

		// m.   BigDecimal
		BigDecimal bd01 = new BigDecimal("13253462.634353454645365347537563734");
		BigDecimal bd02 = new BigDecimal("124235423523523.345634");
		BigDecimal bd03 = new BigDecimal("1.53436457365484685485547346346344");
		BigDecimal bd04 = new BigDecimal("1456457457.346465475475434");
		BigDecimal[] myBigDecimalArray01 = new BigDecimal[] {bd01, bd02, bd03, bd04};

		// n.    String
		String[] myStringArray01 = new String[] {"hweqfgwehfew", "ewfew ewf ew g we gw", "werf3y7f2uh32f32f43  t45 tv 45ybv6 v56 "};
		
		// o.    StringBuffer
		StringBuffer sb01 = new StringBuffer("wqewreytrfewfgwe");
		StringBuffer sb02 = new StringBuffer("wqugfgwe");
		StringBuffer sb03 = new StringBuffer("wq576 7 57 g hg e");
		StringBuffer[] mtStringBufferArray01 = new StringBuffer[] {sb01, sb02, sb03};
//	
//		
//		
//		a.     byte
//			byteArray01 = new byte[3];
//
//			//b.     short
//			shortArray01 = new short[17];
//
//			//c.      int
//			intArray01 = new int[9];
//
//			// d.     long
//			longArray01 = new long[11];
//
//			// e.     float
//			floatArray01 = new float[2];
//
//			// f.      double
//			doubleArray01 = new double[8];
//
//			// g.     Byte
//			wrByteArray01 = new Byte[22];
//
//			// h.     Short
//			wrShortArray01 = new Short[6];
//
//			// i.      Integer
//			wrIntegerArray01 = new Integer[17];
//
//			// j.      BigInteger
//			wrBigIntegerArray01 = new BigInteger[12];
//
//			// k.     Float
//			wrFloatArray01 = new Float[0];
//
//			// l.      Decimal
//			myDoubleArray01 = new Double[2];
//
//			// m.   BigDecimal
//			myBigDecimalArray01 = new BigDecimal[7];
//
//			// n.    String
//			myStringArray01 = new String[25];
//			
//			// o.    StringBuffer
//			mtStringBufferArray01 = new StringBuffer[11];	
//		
		
////		a.     byte
//			byteArray01[0] = 11;
//
//			//b.     short
//			shortArray01[1] = 5;
//
//			//c.      int
//			intArray01[0] = 546_746_992;	
//
//			// d.     long
//			longArray01[3] = 674563853532L;
//
//			// e.     float
//			floatArray01[1] = 652.35235F;
//
//			// f.      double
//			doubleArray01[2] = 2432523.213_352_756_756_332_469;
//
//			// g.     Byte
//			wrByteArray01[1] = 127;
//
//			// h.     Short
//			wrShortArray01[1] = 32_767;
//
//			// i.      Integer
//			wrIntegerArray01[1] = 434_564_756;
//
//			// j.      BigInteger
//			BigInteger bigNum = new BigInteger("2143254325346453765845535242675425546265432654563245643256");
//			wrBigIntegerArray01[0] = bigNum;
//
//			// k.     Float
//			wrFloatArray01[0] = 564.2344F;
//			// Thread [main] (Suspended (exception ArrayIndexOutOfBoundsException))	
//
//			// l.      Double
//			myDoubleArray01[1] = -736454.2342353253464363;
//
//			// m.   BigDecimal
//			BigDecimal bdNumber = new BigDecimal("12423.21324234534534");
//			myBigDecimalArray01[0] = bdNumber;
//
//			// n.    String
//			myStringArray01[2] = "My String";
//			
//			// o.    StringBuffer
//			StringBuffer sb = new StringBuffer("My changeble String");
//			mtStringBufferArray01[0] = sb;
		
		
	}
}
