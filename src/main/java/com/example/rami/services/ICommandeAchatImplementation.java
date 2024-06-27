package com.example.rami.services;

import com.example.rami.entities.CommandeAchat;
import com.example.rami.repositories.CommandeAchatReporistory;


public class ICommandeAchatImplementation {

    CommandeAchatReporistory commandeachatRepository;

    public ICommandeAchatImplementation(CommandeAchatReporistory commandeAchatReporistory){
        this.commandeachatRepository=commandeAchatReporistory;
    }

    public CommandeAchat saveCommandeAchat(CommandeAchat commandeAchat) {
        return commandeachatRepository.save(commandeAchat);
    }
}
