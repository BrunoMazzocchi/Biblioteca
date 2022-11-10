/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.modelos;

/**
 *
 * @author Bemaz
 */
public class ISBNAutor {
    private int idAutor; 
    private String isbn; 

    public ISBNAutor() {
    }

    public ISBNAutor(int idAutor, String isbn) {
        this.idAutor = idAutor;
        this.isbn = isbn;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
