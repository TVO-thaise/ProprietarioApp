package pooa20171.iff.br.proprietarioapp.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by thaisevilaca2013@gmail.com on 07/08/17.
 */

public class Proprietario extends RealmObject implements Serializable {

    @PrimaryKey
        private int id;
        private String nome;
        private String endereco;
        private String bairro;
        private String cidade;
        private String CNH;
        private String telefone;
        private String e_mail;
        private String latitude;
        private String longitude;

    public Proprietario(int id, String nome, String endereco, String bairro, String cidade, String CNH, String telefone, String e_mail, String latitude, String longitude) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CNH = CNH;
        this.telefone = telefone;
        this.e_mail = e_mail;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCNH() {
        return CNH;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
