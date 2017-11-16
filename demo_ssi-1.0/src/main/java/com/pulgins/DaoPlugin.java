package com.pulgins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.IntrospectedTable.TargetRuntime;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
/**
 * 设置dao层生成信息
 * @author Spole
 *
 */
public class DaoPlugin extends PluginAdapter {
	
	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if(introspectedTable.getTargetRuntime() == TargetRuntime.IBATIS2){
			ibatisPageGenerate(interfaze , topLevelClass , introspectedTable);
		}else if(introspectedTable.getTargetRuntime() == TargetRuntime.MYBATIS3){
			mybatisPageGenerate(interfaze , topLevelClass , introspectedTable);
		}
		return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
	}
	
	private void mybatisPageGenerate(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable){
		
	}
	
	/**生成ibatis的Dao 继承BaseDao 
	 * 加入@Repository 标签
	 * @param interfaze
	 * @param topLevelClass
	 * @param introspectedTable
	 */
	private void ibatisPageGenerate(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable){
		String superClazz = getProperties().getProperty("extends");
		if(superClazz != null && superClazz.trim().length()>0){
			FullyQualifiedJavaType superType = new FullyQualifiedJavaType(superClazz);
			topLevelClass.setSuperClass(superType);
			topLevelClass.addImportedType(superType);
		}
		
		topLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
		String shortName = interfaze.getType().getShortName();
		shortName = shortName.substring(0,1).toLowerCase()+shortName.substring(1);
		System.out.println(shortName);
		topLevelClass.addAnnotation("@Repository(\""+shortName+"\")");
	}

	public boolean validate(List<String> warnings) {
		return true;
	}

}
