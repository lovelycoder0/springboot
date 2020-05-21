<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/21
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<fieldset>
    <legend align="center">学生名单</legend>
    <table align="center" width="960" border="1"
           bgcolor="black" cellpadding="1" cellspacing="1">
        <tr align="center" height="30" bgcolor="#5f9ea0">
            <td>学生学号</td>
            <td>学生姓名</td>
        </tr>
        <c:forEach items="${students}" var="s" varStatus="st">
            <tr align="center" bgcolor="white">
                <td>${s.stuid}</td>
                <td>${s.stuname}</td>
            </tr>
        </c:forEach>
    </table>
</fieldset>

<fieldset>
    <legend align="center">已留作业</legend>
    <table align="center" width="960" border="1"
           bgcolor="black" cellpadding="1" cellspacing="1">
        <tr align="center" height="30" bgcolor="#5f9ea0">
            <td>作业编号</td>
            <td>作业题目</td>
        </tr>
        <c:forEach items="${homework}" var="h" varStatus="ho">
            <tr align="center" bgcolor="white">
                <td>${h.homeworkid}</td>
                <td>${h.homeworktitle}</td>
            </tr>
        </c:forEach>
    </table>
</fieldset>


<fieldset>
    <legend align="center">已提交作业列表</legend>
    <table align="center" width="960" border="1"
           bgcolor="black" cellpadding="1" cellspacing="1">
        <tr align="center" height="30" bgcolor="#5f9ea0">
            <td>学生学号</td>
            <td>作业编号</td>
            <td>作业标题</td>
            <td>作业内容</td>
            <td>创建时间</td>
            <td>更新时间</td>
        </tr>
        <c:forEach items="${studentHomeworks}" var="sh" varStatus="sho">
            <tr align="center" bgcolor="white">
                <td>${sh.stuid}</td>
                <td>${sh.homeworkid}</td>
                <td>${sh.homeworktitle}</td>
                <td>${sh.homeworkContent}</td>
                <td>${sh.createtime}</td>
                <td>${sh.updatetime}</td>
            </tr>
        </c:forEach>

        <tr bgcolor="#5f9ea0">
            <td colspan="6" style="text-align: center;">
                <a href="#">提交作业</a>
            </td>
        </tr>
    </table>
</fieldset>




