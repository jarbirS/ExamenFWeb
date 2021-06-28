package dao;

import modelo.Seguimiento;
import util.Conexion;

public class SeguimientoDao extends Conexion<Seguimiento> implements GenericDao<Seguimiento> {

	private static final long serialVersionUID = 1L;

	public SeguimientoDao() {
		super(Seguimiento.class);
	}
}
