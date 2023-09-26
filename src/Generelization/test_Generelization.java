package Generelization;

public class test_Generelization 
{
	public static void main(String[] args) 
	{
		System.out.println("---features of Airtel---");
		Airtel a= new Airtel();
		a.sms();
		a.audio_calling();
		a.data();
		a.featureA();
		
		System.out.println("---features of VI---");
		VI V=new VI();
		V.sms();V.audio_calling();
		V.data();
		V.featureB();
		
		
		System.out.println("---features of Jio---");
		JIO J= new JIO();
		J.sms();
		J.audio_calling();
		J.data();
		J.featureC();
		
		
		
	}

}
