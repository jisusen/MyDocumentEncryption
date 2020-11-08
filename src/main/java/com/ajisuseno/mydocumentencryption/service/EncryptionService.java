package com.ajisuseno.mydocumentencryption.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

public class EncryptionService {

    public String encrypt(String documentLocation) throws IOException {
        File file = new File(documentLocation);
        byte [] bytes = Files.readAllBytes(file.toPath());
        return Base64.getEncoder().encodeToString(bytes);
    }
}
