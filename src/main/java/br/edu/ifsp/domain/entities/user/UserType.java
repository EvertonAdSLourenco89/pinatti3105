package br.edu.ifsp.domain.entities.user;

public enum UserType {
    ADMIN("Administrador"),
    MAINTAINER("Mantenedor");

    private String label;
    UserType(String label){this.label = label;}

    @Override
    public String toString() {return label;}
}
