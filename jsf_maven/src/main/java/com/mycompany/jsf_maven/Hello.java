/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.jsf_maven;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
/**
 *
 * @author rogersouza
 */
public class Hello {
    public String getMenssage(){
        return "Hello JSF + Maven!!!";
    }
}
