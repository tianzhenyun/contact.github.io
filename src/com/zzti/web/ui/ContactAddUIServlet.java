﻿package com.zzti.web.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzti.business.ClassBusiness;
import com.zzti.bean.Class;
import com.zzti.bean.Contact;
import com.zzti.bean.ListResult;
import com.zzti.common.HttpBaseServlet;

/**
 * Servlet implementation class ContactAddUIServlet
 */
@WebServlet("/ContactAddUIServlet")
public class ContactAddUIServlet extends HttpBaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactAddUIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doDeal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//获取班级列表
		ListResult<Class> result = new ClassBusiness().getList();
		if(result.getResult()!=1)
		{
			request.setAttribute("message", result.getMessage());
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			return;
		}
		request.setAttribute("list", result.getList());
		request.getRequestDispatcher("/WEB-INF/jsp/contact/contact_add.jsp").forward(request, response);
	}
}
