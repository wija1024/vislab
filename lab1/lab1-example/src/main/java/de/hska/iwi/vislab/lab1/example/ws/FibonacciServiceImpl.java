package de.hska.iwi.vislab.lab1.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "de.hska.iwi.vislab.lab1.example.ws.FibonacciServiceIntf")
public class FibonacciServiceImpl implements FibonacciServiceIntf {
	@Override
	public int getFibonacci(int n) {
		if(n == 0)
		    return 0;
        else if (n == 1)
            return 1;
        else 
            return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
}