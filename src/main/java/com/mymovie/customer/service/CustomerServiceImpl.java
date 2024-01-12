package com.mymovie.customer.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myproject.model.CustomerDAO;
import com.myproject.model.CustomerVO;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao = CustomerDAO.getInstance();


	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {

		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");

		System.out.println(id);


		int result = dao.idCheck(id);



		if(result==1) {
			return result;

		}else {
			CustomerVO vo = new CustomerVO(id,name,Integer.parseInt(age),pw,email,address,phone);
			dao.insertCustomer(vo);
			return 0;
		}

	}





	@Override
	public CustomerVO login(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pass");

		CustomerVO vo = dao.login(id,pw);

		return vo;
	}






	@Override
	public CustomerVO getinfo(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();

		String id =(String)session.getAttribute("customerId");

		CustomerVO vo = dao.getInfo(id);



		return vo;
	}





	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		String id =(String)session.getAttribute("customerId");

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		int result = dao.update(id,name, email,address);

		return result;
	}





	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String id=request.getParameter("id");//틀릴수도 있음
		String pw= request.getParameter("pw");

		CustomerVO vo=dao.login(id,pw);

		if(vo !=null) {
			dao.delete(id,pw);
			session.invalidate();

			return 1;
		}else {
			return 0;
		}




	}
}