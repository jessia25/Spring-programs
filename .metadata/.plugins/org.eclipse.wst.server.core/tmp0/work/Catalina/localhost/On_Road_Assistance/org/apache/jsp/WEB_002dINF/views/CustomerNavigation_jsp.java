/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-06-17 12:00:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerNavigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/springPrograms/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/On_Road_Assistance/WEB-INF/lib/spring-webmvc-4.0.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1395848244000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1558409875429L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.0.3.RELEASE.jar", Long.valueOf(1558591720303L));
    _jspx_dependants.put("jar:file:/D:/springPrograms/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/On_Road_Assistance/WEB-INF/lib/spring-webmvc-4.0.3.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1395848244000L));
    _jspx_dependants.put("jar:file:/D:/springPrograms/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/On_Road_Assistance/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("<title>On Road Assistance - Navigation</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://bootswatch.com/4/lux/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\twidth: 100vw;\r\n");
      out.write("\theight: 100vh;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".object {\r\n");
      out.write("\tz-index: -10;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input::placeholder {\r\n");
      out.write("\tcolor: white !important;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\tborder: none !important;\r\n");
      out.write("\toutline: none !important;\r\n");
      out.write("\tborder-bottom: 2px solid white !important;\r\n");
      out.write("\tcolor: white !important;\r\n");
      out.write("\tbackground: transparent !important;\r\n");
      out.write("\twidth: 500px !important;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".obj {\r\n");
      out.write("\tz-index: 10;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group {\r\n");
      out.write("\ttext-align: center !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h5 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".trans {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".trans::after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttransform: scaleX(0);\r\n");
      out.write("\theight: 2px;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tbackground-color: crimson;\r\n");
      out.write("\ttransform-origin: bottom right;\r\n");
      out.write("\ttransition: transform 0.25s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".trans:hover::after {\r\n");
      out.write("\ttransform: scaleX(1);\r\n");
      out.write("\ttransform-origin: bottom left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".outer {\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tflex-direction: column;\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("\tmin-height: 15vh;\r\n");
      out.write("\talign-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inner {\r\n");
      out.write("\tbackground-color: #eee;\r\n");
      out.write("\tpadding: 1rem;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star {\r\n");
      out.write("\tfont-size: 2rem;\r\n");
      out.write("\tpadding-right: 0.5rem;\r\n");
      out.write("\tpadding-left: 0.5rem;\r\n");
      out.write("\tcolor: gray;\r\n");
      out.write("\ttransition: all 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #d6c902;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star.hover {\r\n");
      out.write("\tcolor: #d6c902;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".star.hovered {\r\n");
      out.write("\tcolor: #d6c902;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Navbar -->\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/On_Road_Assistance/customer/home\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"logo\"\r\n");
      out.write("\t\t\tclass=\"img-thumbnail\" width=\"40px\" height=\"40px\" /> On road\r\n");
      out.write("\t\t\tassistance</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse text-center\"\r\n");
      out.write("\t\t\t\tid=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"/On_Road_Assistance/customer/home\">Home <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"/On_Road_Assistance/customer/request\">request</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"/On_Road_Assistance/activeRequests\">active request</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"/On_Road_Assistance/logout\">logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navbar Ends -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- main -->\r\n");
      out.write("\t<main> <video src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" autoplay\r\n");
      out.write("\t\tmuted loop class=\"object\"></video>\r\n");
      out.write("\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"d-flex flex-column justify-content-center-align-items-center\">\r\n");
      out.write("\t\t<div class=\"p-5 mt-5 text-center container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" width=\"400px\"\r\n");
      out.write("\t\t\t\t\t\theight=\"400px\" class=\"mb-3\" />\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"p-5 text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"text-danger trans pb-2\">Mechanic details</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mechanic.mechanicName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mechanic.mechanicId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mechanic.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mechanic.contactNumber }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- main ends -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t<footer class=\"bg-primary text-center\">\r\n");
      out.write("\t\t<p class=\"h5 text-light p-3\">All Rights Reserved &copy;2019</p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- footer ends -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$('.star')\r\n");
      out.write("\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\tfunction(index) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tconst prevAll = $(this).prevAll();\r\n");
      out.write("\t\t\t\t\t\t\tconst currItem = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t$(this).on('mouseover', function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tif (currItem.hasClass('hovered')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(this).prevAll().removeClass('hover');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcurrItem.removeClass('hover');\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(this).prevAll().addClass('hover');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tcurrItem.on('mouseout', function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).removeClass('hover')\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).prevAll().removeClass('hover');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tcurrItem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.click(function(index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar curIndex = $(this).index() + 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (curIndex < 2) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#rating').text(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcurIndex + ' Star')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#rating').text(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcurIndex + ' Stars')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tprevAll.addClass('hovered');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(this).addClass('hovered');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(this).nextAll()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.removeClass('hovered');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talert(\"Thanks for your feedback\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location.href = \"/On_Road_Assistance/customer/rating/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mechanic.mechanicId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ curIndex;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\" >\r\n");
      out.write("\t\thistory.pushState(null, null, location.href);\r\n");
      out.write("\t    window.onpopstate = function () {\r\n");
      out.write("\t        history.go(1);\r\n");
      out.write("\t    }; \r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(16,52) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/Images/road.png");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(127,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/Images/icon.png");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(158,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/Images/bgvid.mp4");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(166,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/Images/location.png");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(168,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty time }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<h5>estimated time for arrival : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</h5>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(171,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty time }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<h5>thanking you for using our service. Please feel free to\r\n");
        out.write("\t\t\t\t\t\t\trate the mechanic's service</h5>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(184,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty time }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\" data-toggle=\"modal\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\tdata-target=\".exampleModal\">Rating</button>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/views/CustomerNavigation.jsp(190,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty time }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div class=\"modal fade exampleModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
        out.write("\t\t\t\t\t\t\taria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"modal-dialog modal-dialog-centered\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"outer\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<h1 id=\"rating\"></h1>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"inner\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"fas fa-star star\"></a> <a href=\"#\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star star\"></a> <a href=\"#\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star star\"></a> <a href=\"#\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star star\"></a> <a href=\"#\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star star\"></a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
