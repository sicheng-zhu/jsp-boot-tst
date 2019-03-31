<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>

<h3>User Registration</h3>
<form action='/index/update' method='post'>
    <table class='table table-hover table-responsive table-bordered'>
        <tr>
            <td><b>First Name</b></td>
            <td><input type='text' name='firstname' class='form-control' value="${user.firstname}" /></td>
        </tr>
        <tr>
            <td><b>Last Name</b></td>
            <td><input type='text' name='lastname' class='form-control' value="${user.lastname}" /></td>
        </tr>
        <tr>
            <td><b>Address</b></td>
            <td><input type='text' name='address' class='form-control' size="20" value="${user.address}" /></td>           
        </tr>
        
        <input type='hidden' id='id' rows='5' class='form-control' name='id' value="${user.id}"/>
        
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Update User Information</button>
            </td>
        </tr>
    </table>
</form>
</div>

<jsp:include page="footer.jsp"></jsp:include>