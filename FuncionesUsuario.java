public class FuncionesUsuario {

    ClaseUsuario u;

    public FuncionesUsuario() {
        this.u = new ClaseUsuario();

    }

    public int impuestos(ClaseUsuario edad, ClaseUsuario cantidadHijos) {
        int impuesto = 0;
        if (u.getEdad() < 18) {
            return impuesto;
        }

        if (u.getEdad() >= 18 && u.getEdad() < 30) {
            if (u.getCantidadHijos() > 0) {
                int descuento = u.getCantidadHijos() * 60;
                if (descuento < 1000) {
                    impuesto = 2000 - descuento;
                    return impuesto;
                }
            } else {
                impuesto = 1000;
                return impuesto;
            }
        }
        if (u.getEdad() >= 30 && u.getEdad() < 65) {
            if (u.getCantidadHijos() > 0) {
                int descuento = u.getCantidadHijos() * 210;
                impuesto = 7000 - descuento;
                if (descuento < 3500) {
                    return impuesto;
                }
            } else {
                impuesto = 3500;
                return impuesto;
            }
        }
        if (u.getEdad() >= 65) {
            if (u.getCantidadHijos() > 0) {
                int descuento = u.getCantidadHijos() * 60;
                if (descuento < 1000) {
                    impuesto = 2000 - descuento;
                    return impuesto;
                }
            } else {
                impuesto = 1000;
                return impuesto;
            }
        }
    }
	public void agregarSaldo(int saldo){
        u.getSaldo()=u.getSaldo()+saldo;
    }
}
