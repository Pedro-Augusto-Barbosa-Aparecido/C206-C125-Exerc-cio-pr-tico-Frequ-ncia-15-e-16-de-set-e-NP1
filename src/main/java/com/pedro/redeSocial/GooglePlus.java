package com.pedro.redeSocial;

import com.pedro.redeSocial.base.Compartilhamento;
import com.pedro.redeSocial.base.RedeSocial;
import com.pedro.redeSocial.base.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus() {
        this.numAmigos = 0;
        this.senha = "defaultPassword";
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferencia no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Realizou um compartilhamento no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Realizou um comentario em uma publicacao no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no GooglePlus");
    }
}
