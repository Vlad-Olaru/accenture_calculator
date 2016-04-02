package com.accenture.calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet(description = "CalculatorServlet", urlPatterns = { "/CalculatorServlet" })
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String operation = request.getParameter("operation");
		String firstNumber = request.getParameter("firstNumber");
		String secondNumber = request.getParameter("secondNumber");

		Integer result = null;
		
		try {

			int firstNumberInt = Integer.valueOf(firstNumber).intValue();
			int secondNumberInt = Integer.valueOf(secondNumber).intValue();
	
			Calculator calculator = new Calculator();
	
			int operationInt = Integer.valueOf(operation).intValue();
	
			switch (operationInt) {
			case 1:
				result = calculator.add(firstNumberInt, secondNumberInt);
				break;
			case 2:
				result = calculator.substract(firstNumberInt, secondNumberInt);
				break;
			case 3:
				result = calculator.multiply(firstNumberInt, secondNumberInt);
				break;
			case 4:
				result = calculator.divide(firstNumberInt, secondNumberInt);
				break;
			case 5:
				result = calculator.power(firstNumberInt, secondNumberInt);
				break;
			case 6:
				result = calculator.average(firstNumberInt, secondNumberInt);
				break;
			case 7:
				result = calculator.minimum(firstNumberInt, secondNumberInt);
				break;
			case 8:
				result = calculator.maximum(firstNumberInt, secondNumberInt);
				break;
			case 9:
				result = calculator.mod(firstNumberInt, secondNumberInt);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("/calculator.jsp").include(request, response);
	}

}
