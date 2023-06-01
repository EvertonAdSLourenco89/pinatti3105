package br.edu.ifsp.domain.entities.user;

public class User {
    private Integer idUser;
    private String nameUser;
    private String cpfUser;
    private String passwordUser;
    private UserType typeUser;

    private UserStatus statusUser;

    public User() {
        statusUser = UserStatus.ACTIVE;
    }

    public User(String nameUser, String cpfUser, String passwordUser, UserType typeUser, UserStatus statusUser) {
        this.nameUser = nameUser;
        this.cpfUser = cpfUser;
        this.passwordUser = passwordUser;
        this.typeUser = typeUser;
        this.statusUser = statusUser;
    }

    public User(Integer idUser, String nameUser, String cpfUser, String passwordUser, UserType typeUser, UserStatus statusUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.cpfUser = cpfUser;
        this.passwordUser = passwordUser;
        this.typeUser = typeUser;
        this.statusUser = statusUser;
    }

    private boolean isUserAdmin() {
        return typeUser.equals(UserType.ADMIN);
    }



    public UserStatus getStatusUser() {return statusUser;}

    public void setStatusUser(UserStatus statusUser) {this.statusUser = statusUser;}

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public UserType getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(UserType typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + idUser +
                ", name='" + nameUser + '\'' +
                ", cpf='" + cpfUser + '\'' +
                ", password='" + passwordUser + '\'' +
                ", type=" + typeUser +
                ", status=" + statusUser +
                '}';
    }
}
