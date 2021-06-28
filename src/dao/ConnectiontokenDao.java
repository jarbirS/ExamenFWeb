package dao;

import modelo.Connectiontoken;
import util.Conexion;


public class ConnectiontokenDao extends Conexion<Connectiontoken> implements GenericDao<Connectiontoken> {

	private static final long serialVersionUID = 1L;

	public ConnectiontokenDao() {
		super(Connectiontoken.class);
	}
}
