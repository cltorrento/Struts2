package action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import bean.UserBean;
import dao.User;

public class ListAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	ResultSet rs = null;
	UserBean bean = null;
	List<UserBean> beanList = null;
	User user = new User();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<UserBean>();
			rs = user.report();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new UserBean();		
					bean.setFirstname(rs.getString("firstname"));
					bean.setSurname(rs.getString("surname"));
					bean.setUsername(rs.getString("username"));
					bean.setEmail(rs.getString("email"));
					bean.setPasswd(rs.getString("passwd"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REPORT";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}

	public List<UserBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<UserBean> beanList) {
		this.beanList = beanList;
	}

}
