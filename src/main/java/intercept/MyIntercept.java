package intercept;

import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import page.Page;

public class MyIntercept implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		return null;
	}

	@Override
	public Object plugin(Object target) {
		return null;
	}

	@Override
	public void setProperties(Properties properties) {
		
	}
	
	/**
	 * 获取Mysql数据库的分页查询语句 
	 * @param page	分页对象 
	 * @param sqlBuffer	包含原sql语句的StringBuffer对象 
	 * @return	Mysql数据库分页语句 
	 */	
	public String getMysqlPageSql(Page<?> page, StringBuffer sqlBuffer) {
		//计算第一条记录的位置，Mysql中记录的位置是从0开始的。  
		int offset = (page.getPageNo() - 1) * page.getPageSize();
		sqlBuffer.append(" limit ").append(offset).append(",").append(page.getPageNo() * page.getPageSize());
		return sqlBuffer.toString();
	}

	public void setTotalRecord(Page<?> page, MappedStatement mappedStatement, Connection connection) {
		//获取对应的BoundSql，这个BoundSql其实跟我们利用StatementHandler获取到的BoundSql是同一个对象。
		//delegate里面的boundSql也是通过mappedStatement.getBoundSql(paramObj)方法获取到的。
		BoundSql boundSql = mappedStatement.getBoundSql(page); 		//参数的意义及getBoundSql的作用
		//获取到我们自己写在Mapper映射语句中对应的Sql语句
		String sql = boundSql.getSql();
		//通过查询Sql语句获取到对应的计算总记录数的sql语句
		String countSql = this.getCountSql(sql);
		//通过BoundSql获取对应的参数映射
		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
	}

	private String getCountSql(String sql) {
		return "SELECT COUNT(1) FROM (" + sql + ")";
	}
	
}
