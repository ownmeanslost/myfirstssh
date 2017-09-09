package com.myfirstssh.common.service.impl;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;

import com.myfirstssh.common.service.BaseDataSourceFactory;
import com.myfirstssh.resume.vo.BeanArgsVO;
import com.myfirstssh.resume.vo.ResumeClazzVO;


/**
 *  beanjson就是reportdetail中的类反射类型和值
 *  周期报表取数据源， map中有相对应的值key要 与reportdetial中的args的key一致
 *
 */
public class JavaBeanDataSourceFactory {
	
	
	public static  BaseDataSourceFactory getBaseDataSourceFactory(String beanJson,Map<String, Object> parameter){
		BaseDataSourceFactory baseDataSourceFactory=null;
		/*{"clazz":"com.vrv.soc.report.service.impl.MapRegionJRDataSourceFactoryImpl",
		 * "args":[{"index":"1","key":"securityId","clazzType":"java.lang.String"}]}*/
		if (StringUtils.isEmpty(beanJson)) {
			throw new RuntimeException("使用javabean填充数据，beanJson不能为空");
		}
		ResumeClazzVO vo=new  Gson().fromJson(beanJson, ResumeClazzVO.class);
		List<BeanArgsVO> list = vo.getArgs();
		/**
		 * 只需要判断vo是否存在
		 * 
		 */
		if(vo!=null){
			try{
				Class<?>[] cl = new Class<?>[list.size()];
				Object[] ps = new Object[list.size()];
				Class<?> clazz = Class.forName(vo.getClazz());
				//适用于有参和无参数构造
				for (int index = 0; index < list.size(); index++) {
					BeanArgsVO beanArgsVO = list.get(index);
					// 构造器中的参数列表说明， 通过index确定参数类型及值，在sql中参数的index是从1开始的
					if (beanArgsVO.getIndex().equals(String.valueOf(index + 1))) {
						cl[index] = Class.forName(beanArgsVO.getClazzType());
						if (!StringUtils.isEmpty(beanArgsVO.getDefVal())) {
							ps[index] = beanArgsVO.getDefVal();
						} else {
							ps[index] = parameter.get(beanArgsVO.getKey());
						}
					}
				}
				//调用有参构造
				Constructor<?> cons = clazz.getDeclaredConstructor(cl);
				baseDataSourceFactory = (BaseDataSourceFactory) cons.newInstance(ps);
			}catch(Exception e){
				throw new RuntimeException("使用javabean填充数据源错误， json解析失败");
			}
		}
		
		return baseDataSourceFactory;
		
	}
}
