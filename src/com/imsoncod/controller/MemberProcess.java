package com.imsoncod.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imsoncod.model.MemberDAO;
import com.imsoncod.model.MemberDTO;

public class MemberProcess extends HttpServlet{
	//doGet, doPost, service
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String uri = request.getRequestURI();
		//System.out.println("uri = " + uri);
		
		//uri를 명령어 부분만 잘라냄
		String command = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf(".do"));
		if(command != null && command.trim().equals("register")) {
			
			String num = request.getParameter("num");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String addr = request.getParameter("addr");
			
			MemberDTO dto = new MemberDTO();
			dto.setNum(Integer.parseInt(num));
			dto.setName(name);
			dto.setTel(tel);
			dto.setAddr(addr);
			
			MemberDAO dao = new MemberDAO();
			boolean bool = dao.insertMember(dto);
			if(bool) {
				response.sendRedirect("Success.html");
			}else {
				response.sendRedirect("Fail.html");
			}
			
		}else if(command.trim().equals("update")) {
			//Update	
		}
	}
}
