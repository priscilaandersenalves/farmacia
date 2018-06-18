/**
 * 
 */
package br.com.farmacia.factory;

import java.sql.Connection;

/**
 * @author pandersen
 *
 */
public class ConexaoFactory {

	private static final String user = "root";
	private static final String pass = "123456";
	private static final String url = "jdbc:mysql://localhost:3306/sistema";
	
	public static Connection conectar() {
		return null;
	}
}
