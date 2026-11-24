package com.revised.exception.throwss2;

public class OrderDispatch 
{
	public void placeOrder(String orderId)
	{
		dispatchOrder(orderId);
	}
	
	private void dispatchOrder(String orderId)
	{
		try
		{
			validateOrderid(orderId);
		}
		catch(InvalidOrderIdException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	private void validateOrderid(String orderId) throws InvalidOrderIdException
	{
        if (orderId == null) {
            throw new InvalidOrderIdException("Order ID is required");
        }

        if (!orderId.startsWith("ORD-")) {
            throw new InvalidOrderIdException("Order ID must start with ORD-");
        }

        if (orderId.equals("ORD-")) {
            throw new InvalidOrderIdException("Order ID must include a value after ORD-");
        }
	}
}
