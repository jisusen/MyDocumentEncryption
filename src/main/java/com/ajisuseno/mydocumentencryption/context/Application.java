package com.ajisuseno.mydocumentencryption.context;

import com.ajisuseno.mydocumentencryption.service.DocumentService;
import com.ajisuseno.mydocumentencryption.service.EncryptionService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

    public static final DocumentService documentService = new DocumentService();
    public static final EncryptionService encryptionService= new EncryptionService();
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
