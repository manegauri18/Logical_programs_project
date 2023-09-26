package Generelization;

public class Airtel implements Simcard
{
	public void sms()
	{
		System.out.println("sms: 100");
	}
	
	public void audio_calling()
	{
		System.out.println("audio_call: 200/day");
	}
	
	public void data()
	{
		System.out.println("data: 1GB");
	}
	
	public void featureA()
	{
		System.out.println("features of A");
	}

}
