<%--
  Created by IntelliJ IDEA.
  User: Thinh
  Date: 1/16/2019
  Time: 3:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/product" method="post">
    <div class="product">
      <h1>Product Discount Calculator</h1>
      Description:
      <input type="text" name="mota" placeholder="Description" size="30" />
      Price:
      <input type="text" name="gia" placeholder="Price" size="30" />
      Discount:
      <input type="text" name="giamgia" placeholder="Percent" size="30" />
      <br/>
      <input type="submit" value="Tinh">


    </div>
  </form>
  </body>
</html>
