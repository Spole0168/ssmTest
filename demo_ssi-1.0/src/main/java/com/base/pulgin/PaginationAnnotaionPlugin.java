package com.base.pulgin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.IntrospectedTable.TargetRuntime;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class PaginationAnnotaionPlugin extends PluginAdapter {

	
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
	
	/**生成ibatis的分页dao
	 * @param interfaze
	 * @param topLevelClass
	 * @param introspectedTable
	 */
	private void ibatisPageGenerate(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable){
		topLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
		String shortName = interfaze.getType().getShortName();
		shortName = shortName.substring(0,1).toLowerCase()+shortName.substring(1);
		topLevelClass.addAnnotation("@Repository(\""+interfaze.getType().getShortName()+"\")");
	}

	public boolean validate(List<String> warnings) {
		return true;
	}

}
