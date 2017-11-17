<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.syw.tree.treeBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <link rel="StyleSheet" href="dtree.css" type="text/css" />
        <script type="text/javascript" src="dtree.js"></script>
    </head>
    <body>
        <div style="display:none" id="tree"><%=treeBean.tree()%></div>
        <script type="text/javascript">
        <!--
        d = new dTree('d');
        //从treeBean中获取js代码
        var treecontent = document.getElementById("tree").innerHTML;
        //执行代码
        eval(treecontent);
        document.write(d); 
        //-->
    </script>
   </div>
    </body>
</html>