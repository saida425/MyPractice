package com.dl.pro.two;

import com.dl.pro.one.Client;

public class ClientImpl extends Client {
	public static void main(String[] args) {
		ClientImpl clientImpl = new ClientImpl();
		Client client = new Client();
		System.out.println(clientImpl.a);
		System.out.println(clientImpl.b);

	}
	
}
