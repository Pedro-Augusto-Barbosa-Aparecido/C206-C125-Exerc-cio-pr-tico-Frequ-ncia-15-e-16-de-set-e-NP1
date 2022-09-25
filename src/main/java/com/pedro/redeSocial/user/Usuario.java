package com.pedro.redeSocial.user;

import com.pedro.redeSocial.base.Compartilhamento;
import com.pedro.redeSocial.base.RedeSocial;
import com.pedro.redeSocial.exceptions.EmptySocialNetwork;
import com.pedro.redeSocial.exceptions.NooneHasSocialNetworkSharing;

public class Usuario {
    private final String nome;
    private final String email;

    public RedeSocial[] usa;

    public Usuario (RedeSocial[] redeSocials, String nome, String email) throws Exception {
        if (redeSocials.length == 0) {
            throw new EmptySocialNetwork("Sua lista de rede social está vazia");
        }

        boolean hasOneSharedSocialNetwork = false;
        for (RedeSocial redeSocial : redeSocials)
            if (redeSocial instanceof Compartilhamento) {
                hasOneSharedSocialNetwork = true;
                break;
            }

        if (!hasOneSharedSocialNetwork) {
            throw new NooneHasSocialNetworkSharing("Nenhuma rede social selecionada contém compartilhamento");
        }

        this.usa = redeSocials;
        this.email = email;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
