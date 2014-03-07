/**
 * 
 */
package dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author DUCHAO
 * 
 */
public class DaoImpl extends SqlMapClientDaoSupport implements Dao {

	@Override
	public String selectSysDate() {
		// TODO Auto-generated method stub
		String str= "";
		try {
			str = (String) this.getSqlMapClientTemplate().queryForObject(
					"sysdate.selectSysDate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
