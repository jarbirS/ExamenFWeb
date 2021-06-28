package dao;

import modelo.Usuario;
import util.Conexion;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario> {

	private static final long serialVersionUID = 1L;

	public UsuarioDao() {
		super(Usuario.class);
	}

}
