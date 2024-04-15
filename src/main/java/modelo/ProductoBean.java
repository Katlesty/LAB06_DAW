package modelo;

import java.util.HashMap;
import java.util.Map;

public class ProductoBean {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public ProductoBean(int codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	private static Map productos;
	static {
		productos = new HashMap();
		productos.put(1, new ProductoBean(1,"Mouse",500.00,3));
	}
	
	public static ProductoBean busqueda(int codigo) {
		return (ProductoBean)productos.get(codigo);
	}
}
