package com.zzti.web.formbean;

import java.util.HashMap;
import java.util.Map;

import com.zzti.utils.RegexUtil;

public class ForgotPasswordForm {
	private String email;
	private Map<String,String> errors =new HashMap<String,String>();
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	/**
	 * validate form data
	 * @return
	 */
	public boolean validate()
	{
		boolean flag =true;
		if(this.email==null || this.email.trim().equals(""))
		{
			flag =false;
			this.errors.put("email", "邮箱不能为空!");
		}
		else if(!RegexUtil.isEmail(this.email))
		{
			flag= false;
			this.errors.put("email", "请输入正确的邮箱地址！");
		}
		return flag;
	}
}
