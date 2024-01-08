package com.example.client3;

public class Make_JointData {
	public static void Make_Joint_Command(Make_Joint receivedData) {
		   byte subCommandType = receivedData.getSubCommandType();
		   
		   if(subCommandType == 0x00) { //Smooth
			   Make_Joint_Smooth(receivedData);
		   } else if (subCommandType == 0x01) { //Tick
			   Make_Joint_Tick(receivedData);

		   }
	}
	
	private static void Make_Joint_Smooth(Make_Joint receivedData) {
		float joint1 = receivedData.getJoint1();
        float joint2 = receivedData.getJoint2();
        float joint3 = receivedData.getJoint3();
        float joint4 = receivedData.getJoint4();
        

        // 데이터 출력 또는 처리
        System.out.println("Main Command Type: " + receivedData.getMainCommandType());
        System.out.println("Sub Command Type: " + receivedData.getSubCommandType());
        System.out.println("Joint1: " + joint1);
        System.out.println("Joint2: " + joint2);
        System.out.println("Joint3: " + joint3);
        System.out.println("Joint4: " + joint4);
      
	}
	
	private static void Make_Joint_Tick(Make_Joint receivedData) {
		float joint1 = receivedData.getJoint1();
        float joint2 = receivedData.getJoint2();
        float joint3 = receivedData.getJoint3();
        float joint4 = receivedData.getJoint4();
        float dist = receivedData.getDist();
        float ori = receivedData.getOri();
        float joint = receivedData.getJoint();
        
        System.out.println("Main Command Type: " + receivedData.getMainCommandType());
        System.out.println("Sub Command Type: " + receivedData.getSubCommandType());
        System.out.println("Joint1: " + joint1);
        System.out.println("Joint2: " + joint2);
        System.out.println("Joint3: " + joint3);
        System.out.println("Joint4: " + joint4);
        System.out.println("dist: " + dist);
        System.out.println("ori: " + ori);
        System.out.println("joint: " + joint);
	}



}