<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form:form modelAttribute="device" method="get" action="/update">
    <table>
        <tr>
            <th>Device Id</th>
            <td>
                <form:hidden path="d_id"/>
            </td>
        </tr>

        <tr>
            <th>Device Name</th>
            <td>
                <form:input path="d_name"/>
            </td>
        </tr>

        <tr>
            <th>Device Imaage</th>
            <td>
                <form:input path="d_image"/>
            </td>
        </tr>

        <tr>
            <th>Device Cost</th>
            <td>
                <form:input path="d_cost"/>
            </td>
        </tr>

        <tr>
            <th>Device Warranty</th>
            <td>
                <form:input path="d_warranty"/>
            </td>
        </tr>

        <tr>
            <th>Device RAM</th>
            <td>
                <form:input path="d_ram"/>
            </td>
        </tr>

        <tr>
            <th>Device SSD</th>
            <td>
                <form:input path="d_ssd"/>
            </td>
        </tr>

        <tr>
            <th>Device Manfyear</th>
            <td>
                <form:input path="d_manfyear"/>
            </td>
        </tr>
        
        <tr>
            <td colspan="2">
                <input type="submit" value="Update"/>
            </td>
        </tr>

    </table>
</form:form>