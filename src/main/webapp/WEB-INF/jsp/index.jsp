<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>

<h3>User Registration</h3>
<br />

<form action='/index/add' method='post'>
    <table class='table table-hover table-responsive table-bordered'>
        <tr>
            <td><b>First Name</b></td> 
            <td><input type='text' name='firstname' class='form-control' required/></td>
        </tr>
        <tr>
            <td><b>Last Name</b></td>
            <td><input type='text' name='lastname' class='form-control' required /></td>
        </tr> 
        <tr>
            <td><b>Address</b></td>
            <td><input type='text' name='address' class='form-control' size="20" required/></td>           
        </tr>
 
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Register</button>
            </td>
        </tr>
    </table>
    <b><c:out value="${danger}"></c:out></b>
</form>

<h3>List Of Users</h3>
<br />

<table class="table table-hover">
    <thead>
      <tr>
        <th><b>User FirstName</b></th>
        <th><b>User LastName</b></th>
        <th><b>User Address</b></th>
        <th><b>Transactions</b></th>
      </tr>
    </thead>
    
    <tbody>
    <c:forEach items="${list}" var="user">
      <tr>
        <td><c:out value="${user.firstname}"></c:out></td>
        <td><c:out value="${user.lastname}"></c:out></td>
        <td><c:out value="${user.address}"></c:out></td>
        
        <td>
            <a href="/index/${user.id}/edit">
                <button type="submit" class="btn btn-primary">Edit User</button>
            </a>
        </td>
        <td>
            <a href="/index/${user.id}/delete">
                <button type="submit" class="btn btn-primary">Delete User</button>
            </a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

<jsp:include page="footer.jsp"></jsp:include>