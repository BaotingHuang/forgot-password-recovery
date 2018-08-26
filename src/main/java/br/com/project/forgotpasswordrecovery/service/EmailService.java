package br.com.project.forgotpasswordrecovery.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    public void sendEmail(SimpleMailMessage email);
}
