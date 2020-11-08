package com.ajisuseno.mydocumentencryption.web;

import com.ajisuseno.mydocumentencryption.context.Application;
import com.ajisuseno.mydocumentencryption.model.DocumentModel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyDocumentEncryptionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().equalsIgnoreCase("/")) {
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().print(
                    "<html>\n" +
                            "<body>\n" +
                            "<h1>Hello/h1>\n" +
                            "<p>This is Embedded Tomcat, HTML Page! Example</p>\n" +
                            "</body>\n" +
                            "</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().equalsIgnoreCase("/document")) {

            String documentLocation = request.getParameter("document_location");
            String encryptedDocument = Application.encryptionService.encrypt(documentLocation);

            DocumentModel documentModel = Application.documentService.create(documentLocation, encryptedDocument);

            response.setContentType("application/json; charset=UTF-8");
            String json = Application.objectMapper.writeValueAsString(documentModel);
            response.getWriter().print(json);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
