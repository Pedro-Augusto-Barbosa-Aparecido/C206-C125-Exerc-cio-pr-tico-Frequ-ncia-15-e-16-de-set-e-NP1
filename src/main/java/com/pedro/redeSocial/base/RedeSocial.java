package com.pedro.redeSocial.base;

import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {

    }

    public void changePassword(String newPassword) throws Exception {
        if (newPassword.equals(this.senha)) {
            throw new Exception("A nova senha é igual a senha atual");
        }

        if (newPassword.equals("")) {
            throw new Exception("Senha vazia");
        }

        if (newPassword.contains(" ")) {
            throw new Exception("A senha contem espaços em branco");
        }

        this.senha = newPassword;
        System.out.println("Senha alterada com sucesso");

    }

}
