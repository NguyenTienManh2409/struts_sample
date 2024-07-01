package com.mkyong.common.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.DAO.UserDAO;
import com.mkyong.common.form.UserForm;

public class listUserAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	UserDAO userDAO = new UserDAO();
        List<UserForm> listUsers = userDAO.getAllUsers();
        request.setAttribute("listUsers", listUsers);
        return mapping.findForward("success");
    }
}
