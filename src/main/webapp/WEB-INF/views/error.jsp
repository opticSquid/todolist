<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 19/06/22
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="commons/header.jspf"%>
<%@include file="commons/navigation.jspf"%>
    <div class="container">
        An exception has occurred please contact support!
        <div class="accordion" id="errorAccordion">
            <div class="accordion-item">
                <h2 class="accordion-header" id="heading">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#one" aria-controls="one">
                        Error
                    </button>
                </h2>
                <div id="one" class="accordion-collapse collapse show" aria-labelledby="heading" data-bs-parent="errorAccordion">
                    <div class="accordion-body">
                        <i>${message}</i>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="commons/footer.jspf"%>
