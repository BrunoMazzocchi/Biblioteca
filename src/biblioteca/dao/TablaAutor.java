/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.dao;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import biblioteca.modelos.Autor; 
/**
 *
 * @author Bemaz
 */
public class TablaAutor {
    private ArrayList<Autor> lista;
    private final Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistro;

    // Constructor
    public TablaAutor() {
        try {
            conn = conexion.obtenerConexion();
            mostrarRegistros = conn.prepareStatement("SELECT * FROM Autor");
            insertarRegistros = conn.prepareStatement("INSERT INTO Autor(nombrePila, "
                    + "apellidoPaterno) VALUES(?, ?)");
            modificarRegistros = conn.prepareStatement("UPDATE Autor SET nombrePilla ?, "
                    + " apellidoPaterno = ? WHERE idAutor = ?");
            eliminarRegistro = conn.prepareStatement("DELETE FROM Autor WHERE idAutor = ?");
            lista = new ArrayList<>();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    // Método para obtener la lista de registros de la tabla Autor
    private ArrayList<Autor> listarRegistro() {
        ArrayList<Autor> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Autor(
                        rs.getInt("idAutor"),
                        rs.getString("nombrePila"),
                        rs.getString("apellidoPaterno"),
                        1
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                conexion.close(conn);
            }
        }

        return result;
    }

    // Método para obtener un registro de la tabla Autor
    public int agregarALista(String nombrePila, String apellidoPaterno) {
        try {
            lista.add(new Autor(0,
                    nombrePila,
                    apellidoPaterno,
                    4
            ));
            return 1;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    // Método para insertar un registro en la tabla Autor
    public int editarEnLista(int idAutor, String nombrePila, String apellidoPaterno) {
        try {
            Autor autor = new Autor(
                    idAutor,
                    nombrePila,
                    apellidoPaterno,
                    2
            );

            for (Autor a : lista) {
                if (a.getIdAutor() == autor.getIdAutor()) {
                    a.setNombrePila(autor.getNombrePila());
                    a.setApellidoPaterno(autor.getApellidoPaterno());
                    if (a.getEstado() != 0) a.setEstado(autor.getEstado());
                    return 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    // Método para modificar un registro de la tabla Autor
    public int modificarRegistros(Autor autor) {
        int resultado = 0;
        try {
            modificarRegistros.setString(1, autor.getNombrePila());
            modificarRegistros.setString(2, autor.getApellidoPaterno());
            modificarRegistros.setInt(3, autor.getIdAutor());
            resultado = modificarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    // Método para eliminar un registro de la tabla Autor
    public int eliminarEnLista(int idAutor) {
        try {
            for (Autor a : lista) {
                if (a.getIdAutor() == idAutor) {
                    a.setEstado(3);
                    return 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    // metodo para eliminar un registro de la tabla Autor
    public int eliminarRegistro(Autor autor) {
        int resultado = 0;
        try {
            eliminarRegistro.setInt(1, autor.getIdAutor());
            resultado = eliminarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int agregarRegistrar(Autor autor) {
        int resultado = 0;
        try {
            insertarRegistros.setString(1, autor.getNombrePila());
            insertarRegistros.setString(2, autor.getApellidoPaterno());
            resultado = insertarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }


    // Método para guardar los cambios en la tabla Autor
    public String actualizarBD() {
        String msn = "";
        String msnError = "Errores en: ";
        int nuevos = 0, modificados = 0, eliminados = 0;
        int errorNuevos = 0, errorModificados = 0, errorEliminados = 0;

        for (Autor autor : lista) {
            switch (autor.getEstado()) {
                case 1:
                    // Si es original, no hace nada
                    break;
                case 2:
                    if (this.modificarRegistros(autor) != 0) {
                        modificados++;
                    } else {
                        errorModificados++;
                        msnError += "Modificar " + autor.getNombrePila() + ", ";
                    }
                    break;
                case 3:
                    if (this.eliminarRegistro(autor) != 0) {
                        eliminados++;
                    } else {
                        errorEliminados++;
                        msnError += "Eliminar " + autor.getNombrePila() + ", ";
                    }
                    break;
                case 4:
                    if (this.agregarRegistrar( autor) != 0) {
                        nuevos++;
                    } else {
                        errorNuevos++;
                        msnError += "Agregar " + autor.getNombrePila() + ", ";
                    }
                    break;
            }
        }

        msn = "Nuevos: " + nuevos + ", Modificados: " + modificados + ", Eliminados: " + eliminados;
        if (!msnError.equals("Errores en: ")) {
            msn += "\n" + msnError;
        }
        lista = this.listarRegistro();
        return msn;
    }
}
