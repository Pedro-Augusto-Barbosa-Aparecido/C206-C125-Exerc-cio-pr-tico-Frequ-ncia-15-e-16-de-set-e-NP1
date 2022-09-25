package com.pedro.redeSocial;

import com.pedro.redeSocial.base.Compartilhamento;
import com.pedro.redeSocial.base.RedeSocial;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter() {
        this.numAmigos = 0;
        this.senha = "defaultPassword";
    }

    @Override
    public void compartilhar() {
        System.out.println("Realizou um compartilhamento no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Realizou um comentario em uma publicacao no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Twitter");
    }
}
