package com.mkyong.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.DAO.UserDAO;
import com.mkyong.common.form.UserForm;

public class CreateUserAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		
		HttpSession ses = request.getSession(true);
		
		if (!"POST".equalsIgnoreCase(request.getMethod())) {
            return mapping.findForward("input");
        }
		
		UserForm registerForm = (UserForm) form;
		String name = registerForm.getName();
		String email = registerForm.getEmail();
		UserDAO dao = new UserDAO();
		
		ses.setAttribute("name", name);
		ses.setAttribute("email", email);
		if (name.equals("") || email.equals("")) {
			return mapping.findForward("error");
		} else {
			dao.insertData(name, email);
			return mapping.findForward("success");
		}
	}
}
