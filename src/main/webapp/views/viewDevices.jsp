<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1"
       align="center"
       cellspacing="10px"
       cellpadding="10px">

       <tr>
        <th>d_id</th>
        <th>d_name</th>
        <th>d_image</th>
        <th>d_cost</th>
        <th>d_warranty</th>
        <th>d_ram</th>
        <th>d_ssd</th>
        <th>d_manfyear</th>
        <th>Edit</th>
        <th>Delete</th>
       </tr>

       <tr>
        <c:forEach var="device" items="${devices}">
            <tr>
                <td>${device.d_id}</td>
                <td>${device.d_name}</td>
                <td>
                    <img src="${device.d_image}" width="50px">
                </td>
                <td>${device.d_cost}</td>
                <td>${device.d_warranty}</td>
                <td>${device.d_ram}</td>
                <td>${device.d_ssd}</td>
                <td>${device.d_manfyear}</td>
                <td>
                <a href="/edit/${device.d_id}">Edit</a>
                </td>
                <td>
                <a href="/delete/${device.d_id}">Delete</a>
                </td>
            </tr>
        </c:forEach>    
                
       </tr></table>