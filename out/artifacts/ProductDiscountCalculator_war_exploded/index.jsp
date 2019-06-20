<%--
  Created by IntelliJ IDEA.
  User: adminu
  Date: 20/06/2019
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="calculate">
    <h1>Product Discount Calculator</h1>
    <div>
      <label>Product Description: </label>
      <input type="text" name="product" placeholder="Product Description"/>
      <br/>
      <label>List Price</label>
      <input type="text" name="price" placeholder="List Price"/>
      <br/>
      <label>Discount Percent</label>
      <input type="text" name="percent" placeholder="Discount Percent"/>
      <br/>
    </div>
    <div>
      <input type="submit" id="submit" value="Calculate Discount"/>
    </div>
  </form>
  </body>
</html>
