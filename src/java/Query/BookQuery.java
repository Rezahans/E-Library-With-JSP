/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Query;

/**
 *
 * @author Reza
 */
    
    public class BookQuery {
    public String get = "SELECT * FROM lib";
    
    public String getByName = "SELECT * FROM lib WHERE judul LIKE ? ";
    
    public String delete = "DELETE FROM lib WHERE id = ?";
    
    public String create = "INSERT INTO lib (img, judul, " + 
            "penulis, genre, link) VALUES (?, ?, ?, ?, ?)";
    
    public String update = "UPDATE lib SET img = ?, judul = ?, "
            + "penulis = ?, genre = ?, link = ? WHERE id = ?";
    
    public String getById = "SELECT * FROM lib where id = ?"; 
    
    }
    
