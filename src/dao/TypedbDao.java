package dao;

import modelo.Typedb;
import util.Conexion;


public class TypedbDao extends Conexion<Typedb> implements GenericDao<Typedb> {

	private static final long serialVersionUID = 1L;

	public TypedbDao() {
		super(Typedb.class);
	}

}
