import java.util.*;
class Buffer
{
	String data;
	boolean avail=false;
	public synchronized void put(String data)
	{
		while(avail==true)
		{
			try
			{
				wait();
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
		}
		this.data=data;
		System.out.println("Produced:"+data);
		avail = true;
		notify();
		}
		public synchronized String get()
		{
			while(avail==false)
			{
				try
				{
					wait();
					}
					catch (InterruptedException ie)
					{
						System.out.println(ie);
					}
			}
			avail = false;
			notify();
			return data;
			}
			}
			class Producer extends Thread
			{
				String data;
				Scanner sc=new Scanner(System.in);
				Buffer buf;
				public Producer(Buffer buf)
				{
					super("Producer");
					this.buf=buf;
					}
					public void run()
					{
						try
						{
							while(true)
							{
								System.out.println("Enter data");
								data=sc.nextLine();
								buf.put(data);
								Thread.sleep(1000);
							}
						}
						catch(InterruptedException e)
						{
							System.out.println(e);
							}
					}
			}
			class Consumer extends Thread
			{
				Buffer buf;
				public Consumer(Buffer buf)
				{
					super("Consumer");
					this.buf=buf;
					}
					public void run()
					{
						try
						{
							while(true)
							{
								System.out.println("Consumed:"+ buf.get());
								Thread.sleep (1000);
							}
						}

						catch(InterruptedException e)
						{
							System.out.println(e);
							}
					}
			}
			public class PCDemo
			{
				public static void main(String args [])
				{
					Buffer buf = new Buffer ();
					Producer p = new Producer (buf);
					Consumer c = new Consumer (buf);
					p.start();
					c.start();
				}
			}