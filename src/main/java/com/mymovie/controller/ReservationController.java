package com.mymovie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.reservation.service.ReservationService;
import com.myproject.reservation.service.ReservationServiceImpl;


@WebServlet("*.reservation")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ReservationService service = new ReservationServiceImpl();

	public ReservationController() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());

		System.out.println(path);

		if(path.equals("/customer/seat.reservation")) {

			String movie = request.getParameter("reservation");
			String time = request.getParameter("Time");

			if(movie.equals("1") && time.equals("1")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat.jsp").forward(request, response);
			}
			if(movie.equals("1") && time.equals("2")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat2.jsp").forward(request, response);
			}
			if(movie.equals("1") && time.equals("3")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat3.jsp").forward(request, response);
			}
			if(movie.equals("2") && time.equals("1")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat4.jsp").forward(request, response);
			}
			if(movie.equals("2") && time.equals("2")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat5.jsp").forward(request, response);
			}
			if(movie.equals("2") && time.equals("3")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat6.jsp").forward(request, response);
			}
			if(movie.equals("3") && time.equals("1")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat7.jsp").forward(request, response);
			}
			if(movie.equals("3") && time.equals("2")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat8.jsp").forward(request, response);
			}
			if(movie.equals("3") && time.equals("3")) {
				request.setAttribute("movie", movie);
				request.setAttribute("time", time);
				request.getRequestDispatcher("../reservation/reservationSeat9.jsp").forward(request, response);
			}
		}

		else if(path.equals("/customer/seatok.reservation")){

			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", time);


			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat.jsp';");
				out.println("</script>");

			}
		}else if(path.equals("/customer/seatok2.reservation")) {

			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);


			int result = service.seatreservation(request, response);
			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK2.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK2.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat2.jsp';");
				out.println("</script>");

			}

		}else if(path.equals("/customer/seatok3.reservation")) {

			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK3.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK3.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat3.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok4.reservation")){

			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", time);


			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK4.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK4.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat4.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok5.reservation")) {


			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK5.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK5.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat5.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok6.reservation")) {


			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK6.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK6.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat6.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok7.reservation")) {


			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK7.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK7.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat7.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok8.reservation")) {


			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK8.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK8.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat8.jsp';");
				out.println("</script>");

			}
		}
		else if(path.equals("/customer/seatok9.reservation")) {


			String movie = request.getParameter("movie");
			String time = request.getParameter("time");

			request.setAttribute("movie", movie);
			request.setAttribute("time", movie);

			int result = service.seatreservation(request, response);

			if(result==1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('예매성공');");
				out.println("location.href='../reservation/reservationSeatOK9.jsp';");
				out.println("</script>");
				request.getRequestDispatcher("../reservation/reservationSeatOK9.jsp").forward(request, response);
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");	
				out.println("alert('예매실패');");
				out.println("location.href='../reservation/reservationSeat9.jsp';");
				out.println("</script>");

			}
		}
	}

}

