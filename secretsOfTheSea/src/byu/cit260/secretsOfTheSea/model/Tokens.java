/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jacieames
 */
public class Tokens implements Serializable{
    
    private String tokenType;
    private String tokenDescription;

    public Tokens() {
    }
    
    

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenDescription() {
        return tokenDescription;
    }

    public void setTokenDescription(String tokenDescription) {
        this.tokenDescription = tokenDescription;
    }

    @Override
    public String toString() {
        return "Tokens{" + "tokenType=" + tokenType + ", tokenDescription=" + tokenDescription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.tokenType);
        hash = 73 * hash + Objects.hashCode(this.tokenDescription);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tokens other = (Tokens) obj;
        if (!Objects.equals(this.tokenType, other.tokenType)) {
            return false;
        }
        if (!Objects.equals(this.tokenDescription, other.tokenDescription)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
