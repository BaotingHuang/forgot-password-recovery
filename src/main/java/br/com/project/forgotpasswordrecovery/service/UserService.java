package br.com.project.forgotpasswordrecovery.service;

import br.com.project.forgotpasswordrecovery.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByEmail(String email);
    Optional<User> findByResetToken(String resetToken);
    public void save(User user);
}
