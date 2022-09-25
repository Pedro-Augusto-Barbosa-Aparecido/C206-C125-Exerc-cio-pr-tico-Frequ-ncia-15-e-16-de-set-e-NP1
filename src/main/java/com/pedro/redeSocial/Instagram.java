package com.pedro.redeSocial;

import com.pedro.redeSocial.base.RedeSocial;

public class Instagram extends RedeSocial {
    public Instagram() {
        this.numAmigos = 0;
        this.senha = "defaultPassword";
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Realizou um comentario em uma publicacao no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Instagram");
    }
}
