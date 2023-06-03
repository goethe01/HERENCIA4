
package com.mycompany.herenciaejer4_1;

public class CuentaAhorros extends Cuenta{
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
}
public void retirar(float cantidad) {
    if (activa)
        super.retirar(cantidad);
}
public void consignar(float cantidad) {
    if (activa)
        super.consignar(cantidad);
}
public void extractoMensual() {
    if (númeroRetiros > 4) {
        comisiónMensual += (númeroRetiros - 4) * 1000;
    }
    super.extractoMensual();
    if ( saldo < 10000 )
        activa = false;
}
}
