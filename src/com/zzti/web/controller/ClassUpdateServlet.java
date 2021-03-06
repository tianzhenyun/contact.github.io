﻿package com.zzti.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzti.business.ClassBusiness;
import com.zzti.bean.Class;
import com.zzti.bean.Result;
import com.zzti.common.HttpBaseServlet;
import com.zzti.utils.WebUtils;
import com.zzti.web.formbean.ClassForm;

/**
 * Servlet implementation class ClassUpdateServlet
 */
@WebServlet("/ClassUpdateServlet")
public class ClassUpdateServlet extends HttpBaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassUpdateServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doDeal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassForm form = WebUtils.requestToBean(request, ClassForm.class);
		boolean flag = form.validate();
		if(!flag)
		{
			request.setAttribute("form", form);
			request.getRequestDispatcher("/WEB-INF/jsp/class/class_update.jsp").forward(request, response);
			return;
		}
		
		Class data = new Class();
		WebUtils.copyBean(form, data);
		Result result= new ClassBusiness().update(data);
		if(result.getResult() !=1)
		{
			request.setAttribute("message", result.getMessage());
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			return;
		}
		
		response.sendRedirect(request.getContextPath()+"/servlet/ClassListUIServlet");
		
	}
}
