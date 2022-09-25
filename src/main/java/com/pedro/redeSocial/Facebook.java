package com.pedro.redeSocial;

import com.pedro.redeSocial.base.Compartilhamento;
import com.pedro.redeSocial.base.RedeSocial;
import com.pedro.redeSocial.base.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook() {
        this.numAmigos = 0;
        this.senha = "defaultPassword";
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Realizou um comentario em uma publicacao no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicacao no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferencia no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Realizou um compartilhamento no Facebook");
    }
}
