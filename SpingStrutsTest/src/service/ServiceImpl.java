/**
 * 
 */
package service;

import dao.Dao;

/**
 * @author DUCHAO
 * 
 */
public class ServiceImpl implements Service {

	private Dao daoImpl ;

	public Dao getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(Dao daoImpl) {
		this.daoImpl = daoImpl;
	}

	@Override
	public void execute(String str) {
		// TODO Auto-generated method stub
		System.out.print("HELLO" + str);
	}

	@Override
	public String selectSysDate() {
		// TODO Auto-generated method stub
		String str = "";
		try {
			str = daoImpl.selectSysDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
