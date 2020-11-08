package com.ajisuseno.mydocumentencryption.service;

import com.ajisuseno.mydocumentencryption.model.DocumentModel;

public class DocumentService {

    public DocumentModel create(String documentLocation, String encryptedDocument) {

        return new DocumentModel(documentLocation, encryptedDocument);
    }
}
