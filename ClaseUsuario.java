public class ClaseUsuario {

//atributos
 private String nombre;
 private int cedula;
 private String contraseña;
 private int edad;
 private int cantidadHijos;
 private int saldo;
 
 //getters and setters
 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
 
 //constructor
 public ClaseUsuario(){
	 this.nombre="sin nombre";
	 this.cedula=0;
	 this.contraseña="sin contraseña";
	 this.edad=0;
	 this.cantidadHijos=0;
	 this.saldo=0;
 }
 
 //equals
 public boolean equals (Object obj){
	 return this.cedula==obj.getCedula();
 
}	