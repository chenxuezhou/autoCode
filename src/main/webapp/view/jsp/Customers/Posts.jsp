<%@page import="org.durcframework.autocode.common.AutoCodeContext"%>
<c:set var="base"
       value='<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" %>'/>

<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>posts</title>
    <jsp:include page="../../../easyui_lib.jsp"></jsp:include>
    <style type="text/css">
        .fm_lab {
            text-align: right;
            padding: 10px;
        }
    </style>
</head>
<body>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="crud.add()">添加</a>
</div>

<div id="templateTb">
    uid: <input id="uidSch" class="easyui-textbox"
                type="text"></input>
    title: <input id="titleSch" class="easyui-textbox"
                  type="text"></input>
    content: <input id="contentSch" class="easyui-textbox"
                    type="text"></input>
    id: <input id="idSch" class="easyui-textbox"
               type="text"></input>
    time

        <input id="createdStartSch" class="easyui-datebox" style="width: 100px"/>
            -
            <input id="createdEndSch" class="easyui-datebox" style="width: 100px"/>


    <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="searchTemplate(); return false;">搜索</a>
</div>
<table id="dg"></table>
<div id="dlg" class="easyui-dialog" style="width:520px;height:220px;padding:10px 20px"
     closed="true" modal="true" buttons="#dlg-buttons">
    <form id="fm" method="post">
        <table>
            <tr>
                <td class="fm_lab">uid</td>
                <td><input id="uid" name="uid"
                           class="easyui-validatebox" required="true"></td>
            </tr>
            <tr>
                <td class="fm_lab">title</td>
                <td><input id="title" name="title"
                           class="easyui-validatebox" required="true"></td>
            </tr>
            <tr>
                <td class="fm_lab">content</td>
                <td><input id="content" name="content"
                           class="easyui-validatebox" required="true"></td>
            </tr>
            <tr>
                <th>id</th>
                <td><input id="id"  name="id"
                           class="textbox" style="height: 22px;"/></td>
            </tr>
            <tr>
                <td class="fm_lab">time</td>
                <td><input id="time" name="time"
                           data-options="disabled:false" class="easyui-datetimebox" />
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="crud.save(); return false;">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="crud.closeDlg(); return false;">取消</a>
</div>

<script type="text/javascript">
    var crud = Crud.create({
        pk: 'username'
        , listUrl: ctx + 'listPosts.do'
        , addUrl: ctx + 'addPosts.do'
        , updateUrl: ctx + 'updatePosts.do'
        , delUrl: ctx + 'delPosts.do'
        , dlgId: 'dlg'
        , formId: 'fm'
        , gridId: 'dg'
    });

    crud.buildGrid([
        {field:'uid',title:'uid'},
        {field:'title',title:'title'},
        {field:'content',title:'content'},
        {field:'id',title:'id'},
        {field:'time',title:'time'},
        crud.createOperColumn()
    ]);

    function searchTemplate() {
        $('#dg').datagrid('load', {

            uidSch: $('#uidSch').val(),

            titleSch: $('#titleSch').val(),

            contentSch: $('#contentSch').val(),
            createdStartSch: $('#createdStartSch + span input+span+input').val(),
            createdEndSch: $('#createdEndSch + span input+span+input').val(),
        });
    }

</script>
</body>
</html>