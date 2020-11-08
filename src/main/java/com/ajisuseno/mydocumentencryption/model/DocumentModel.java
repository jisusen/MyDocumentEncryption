package com.ajisuseno.mydocumentencryption.model;

public class DocumentModel {
    private String documentLocation;
    private String encryptedDocument;


    public DocumentModel() {

    }

    public DocumentModel(String documentLocation, String encryptedDocument) {
        this.documentLocation = documentLocation;
        this.encryptedDocument = encryptedDocument;
    }

    public DocumentModel(String encryptedDocument) {
        this.encryptedDocument = encryptedDocument;
    }

    public String getDocumentLocation() {
        return documentLocation;
    }

    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }

    public String getEncryptedDocument() {
        return encryptedDocument;
    }

    public void setEncryptedDocument(String encryptedDocument) {
        this.encryptedDocument = encryptedDocument;
    }
}
