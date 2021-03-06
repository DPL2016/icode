/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-09-05 00:39:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>CRM-客户关系管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- MetisMenu CSS -->\r\n");
      out.write("    <link href=\"/static/js/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"/static/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"/static/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/js/datatables/css/dataTables.bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("admin", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("    <div id=\"page-wrapper\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"panel panel-default top_panel\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <i class=\"fa fa-users\"></i> 客户列表\r\n");
      out.write("                            <a href=\"\" style=\"margin-left: 15px;\" class=\"pull-right btn btn-primary btn-xs\">\r\n");
      out.write("                                <i class=\"fa fa-file-excel-o\"></i> 导出\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"javascript:;\" id=\"newCustomer\" class=\"pull-right btn btn-success btn-xs\">\r\n");
      out.write("                                <i class=\"fa fa-plus\"></i> 新增\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <table class=\"table\"  id=\"userTable\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>ID</th>\r\n");
      out.write("                                    <th>姓名</th>\r\n");
      out.write("                                    <th>联系电话</th>\r\n");
      out.write("                                    <th>状态</th>\r\n");
      out.write("                                    <th>角色</th>\r\n");
      out.write("                                    <th width=\"100\">#</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- /.col-lg-12 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"newCustomer_Modal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\"><i class=\"fa fa-plus\"></i> 新增客户</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>客户名称</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>联系人</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>联系电话</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>地址</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>电子邮件</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>微信</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>QQ</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>备注</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- /.modal-content -->\r\n");
      out.write("    </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"/static/js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"/static/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("<script src=\"/static/js/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Theme JavaScript -->\r\n");
      out.write("<script src=\"/static/js/sb-admin-2.js\"></script>\r\n");
      out.write("<script src=\"/static/js/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/datatables/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        var dt = $(\"#userTable\").DataTable({\r\n");
      out.write("            \"processing\": true, //loding效果\r\n");
      out.write("            \"serverSide\":true, //服务端处理\r\n");
      out.write("            \"searchDelay\": 1000,//搜索延迟\r\n");
      out.write("            \"order\":[[0,'desc']],//默认排序方式\r\n");
      out.write("            \"lengthMenu\":[5,10,25,50,100],//每页显示数据条数菜单\r\n");
      out.write("            \"ajax\":{\r\n");
      out.write("                url:\"/admin/users.json\", //获取数据的URL\r\n");
      out.write("                type:\"get\" //获取数据的方式\r\n");
      out.write("            },\r\n");
      out.write("            \"columns\":[  //返回的JSON中的对象和列的对应关系\r\n");
      out.write("                {\"data\":\"id\",\"name\":\"id\"},\r\n");
      out.write("                {\"data\":\"username\",\"name\":\"username\"},\r\n");
      out.write("                {\"data\":\"tel\",\"name\":\"tel\"},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    if(row.state == \"禁用\") {\r\n");
      out.write("                        return \"<span class='label label-danger'>\"+row.state+\"</span>\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        return row.state;\r\n");
      out.write("                    }\r\n");
      out.write("                },\"name\":\"state\"},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    var roleName = \"\";\r\n");
      out.write("                    for(var i = 0;i < row.roleList.length;i++) {\r\n");
      out.write("                        var role = row.roleList[i];\r\n");
      out.write("                        roleName = roleName + role.rolename + \"&nbsp&nbsp\";\r\n");
      out.write("                    }\r\n");
      out.write("                    return roleName;\r\n");
      out.write("                }},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    return \"<a href='javascript:;' class='editLink' data-id='\"+row.id+\"'>编辑</a> <a href='javascript:;' class='delLink' data-id='\"+row.id+\"'>删除</a>\";\r\n");
      out.write("                }}\r\n");
      out.write("            ],\r\n");
      out.write("            \"columnDefs\":[ //具体列的定义\r\n");
      out.write("                {\r\n");
      out.write("                    \"targets\":[0],\r\n");
      out.write("                    \"visible\":false\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    \"targets\":[3],\r\n");
      out.write("                    \"orderable\":true\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    \"targets\":[1,2,4,5],\r\n");
      out.write("                    \"orderable\":false\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("            \"language\":{\r\n");
      out.write("                \"lengthMenu\":\"显示 _MENU_ 条记录\",\r\n");
      out.write("                \"search\":\"搜索:\",\r\n");
      out.write("                \"info\": \"从 _START_ 到 _END_ 共 _TOTAL_ 条记录\",\r\n");
      out.write("                \"processing\":\"加载中...\",\r\n");
      out.write("                \"zeroRecords\":\"暂无数据\",\r\n");
      out.write("                \"infoEmpty\": \"从 0 到 0 共 0 条记录\",\r\n");
      out.write("                \"infoFiltered\":\"(从 _MAX_ 条记录中读取)\",\r\n");
      out.write("                \"paginate\": {\r\n");
      out.write("                    \"first\":      \"首页\",\r\n");
      out.write("                    \"last\":       \"末页\",\r\n");
      out.write("                    \"next\":       \"下一页\",\r\n");
      out.write("                    \"previous\":   \"上一页\"\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
